package bridge.service;

import bridge.repository.BridgeMaker;
import bridge.validation.Validation;
import java.util.ArrayList;
import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {

    private static BridgeGame bridgeGame;
    private final List<Integer> bridge = new ArrayList<>();
    private final Validation validation = new Validation();
    protected BridgeGame() {

    }

    public static BridgeGame getBridgeGame() {
        if (bridgeGame == null) {
            return new BridgeGame();
        }
        return bridgeGame;
    }

    public void createBridge(String length) {
        validation.bridgeLengthValidation(length);
    }
    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void move() {
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
    }
}
