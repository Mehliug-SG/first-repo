package Chess;

import java.util.ArrayList;

public enum Piece {
    PAWN(true),
    ROOK(true),
    KNIGHT(false),
    BISHOP(false),
    QUEEN(false),
    KING(true);

    private boolean untouched;

    Piece(boolean untouched) {
        this.untouched = untouched;
    }

}
