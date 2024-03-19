package controller;

import java.util.Map;

import view.InputView;
import view.OutputView;

public class RacingCarController {
    public void racingStart() {
        try {
            int purchaseAmount = InputView.getPurchaseAmount();
            LottoGenerator lottoGenerator = new LottoGenerator(purchaseAmount);
            Lottos lottos = new Lottos(lottoGenerator.generateLottos());
            printLottosInformation(lottoGenerator, lottos);
            WinningLotto winningLotto = new WinningLotto(InputView.getLottoNumber(), InputView.getLottoBonusNumber());
            Map<WinningRank, Integer> winningDetails = WinningStatistics.getWinningDetails(lottos, winningLotto);
            printWinningInformation(winningDetails, purchaseAmount);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void printLottosInformation(LottoGenerator lottoGenerator, Lottos lottos) {
        OutputView.printHowManyLottoUserPurchased(lottoGenerator.getLottoQuantity());
        OutputView.printLottos(lottos);
    }

    private void printWinningInformation(Map<WinningRank, Integer> winningDetails, int purchaseAmount) {
        OutputView.printWinningStatistics();
        OutputView.printWinningDetails(winningDetails);
        long winningAmount = WinningStatistics.getWinningAmount(winningDetails);
        OutputView.printLottoYield(WinningStatistics.getLottoYield(winningAmount, purchaseAmount));
    }

}
