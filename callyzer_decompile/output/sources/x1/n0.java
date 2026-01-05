package x1;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    private final boolean editsText;
    public static final n0 LEFT_CHAR = new n0("LEFT_CHAR", 0, false);
    public static final n0 RIGHT_CHAR = new n0("RIGHT_CHAR", 1, false);
    public static final n0 RIGHT_WORD = new n0("RIGHT_WORD", 2, false);
    public static final n0 LEFT_WORD = new n0("LEFT_WORD", 3, false);
    public static final n0 NEXT_PARAGRAPH = new n0("NEXT_PARAGRAPH", 4, false);
    public static final n0 PREV_PARAGRAPH = new n0("PREV_PARAGRAPH", 5, false);
    public static final n0 LINE_START = new n0("LINE_START", 6, false);
    public static final n0 LINE_END = new n0("LINE_END", 7, false);
    public static final n0 LINE_LEFT = new n0("LINE_LEFT", 8, false);
    public static final n0 LINE_RIGHT = new n0("LINE_RIGHT", 9, false);
    public static final n0 UP = new n0("UP", 10, false);
    public static final n0 DOWN = new n0("DOWN", 11, false);
    public static final n0 PAGE_UP = new n0("PAGE_UP", 12, false);
    public static final n0 PAGE_DOWN = new n0("PAGE_DOWN", 13, false);
    public static final n0 HOME = new n0("HOME", 14, false);
    public static final n0 END = new n0("END", 15, false);
    public static final n0 COPY = new n0("COPY", 16, false);
    public static final n0 PASTE = new n0("PASTE", 17, true);
    public static final n0 CUT = new n0("CUT", 18, true);
    public static final n0 DELETE_PREV_CHAR = new n0("DELETE_PREV_CHAR", 19, true);
    public static final n0 DELETE_NEXT_CHAR = new n0("DELETE_NEXT_CHAR", 20, true);
    public static final n0 DELETE_PREV_WORD = new n0("DELETE_PREV_WORD", 21, true);
    public static final n0 DELETE_NEXT_WORD = new n0("DELETE_NEXT_WORD", 22, true);
    public static final n0 DELETE_FROM_LINE_START = new n0("DELETE_FROM_LINE_START", 23, true);
    public static final n0 DELETE_TO_LINE_END = new n0("DELETE_TO_LINE_END", 24, true);
    public static final n0 SELECT_ALL = new n0("SELECT_ALL", 25, false);
    public static final n0 SELECT_LEFT_CHAR = new n0("SELECT_LEFT_CHAR", 26, false);
    public static final n0 SELECT_RIGHT_CHAR = new n0("SELECT_RIGHT_CHAR", 27, false);
    public static final n0 SELECT_UP = new n0("SELECT_UP", 28, false);
    public static final n0 SELECT_DOWN = new n0("SELECT_DOWN", 29, false);
    public static final n0 SELECT_PAGE_UP = new n0("SELECT_PAGE_UP", 30, false);
    public static final n0 SELECT_PAGE_DOWN = new n0("SELECT_PAGE_DOWN", 31, false);
    public static final n0 SELECT_HOME = new n0("SELECT_HOME", 32, false);
    public static final n0 SELECT_END = new n0("SELECT_END", 33, false);
    public static final n0 SELECT_LEFT_WORD = new n0("SELECT_LEFT_WORD", 34, false);
    public static final n0 SELECT_RIGHT_WORD = new n0("SELECT_RIGHT_WORD", 35, false);
    public static final n0 SELECT_NEXT_PARAGRAPH = new n0("SELECT_NEXT_PARAGRAPH", 36, false);
    public static final n0 SELECT_PREV_PARAGRAPH = new n0("SELECT_PREV_PARAGRAPH", 37, false);
    public static final n0 SELECT_LINE_START = new n0("SELECT_LINE_START", 38, false);
    public static final n0 SELECT_LINE_END = new n0("SELECT_LINE_END", 39, false);
    public static final n0 SELECT_LINE_LEFT = new n0("SELECT_LINE_LEFT", 40, false);
    public static final n0 SELECT_LINE_RIGHT = new n0("SELECT_LINE_RIGHT", 41, false);
    public static final n0 DESELECT = new n0("DESELECT", 42, false);
    public static final n0 NEW_LINE = new n0("NEW_LINE", 43, true);
    public static final n0 TAB = new n0("TAB", 44, true);
    public static final n0 UNDO = new n0("UNDO", 45, true);
    public static final n0 REDO = new n0("REDO", 46, true);
    public static final n0 CHARACTER_PALETTE = new n0("CHARACTER_PALETTE", 47, true);

    private static final /* synthetic */ n0[] $values() {
        return new n0[]{LEFT_CHAR, RIGHT_CHAR, RIGHT_WORD, LEFT_WORD, NEXT_PARAGRAPH, PREV_PARAGRAPH, LINE_START, LINE_END, LINE_LEFT, LINE_RIGHT, UP, DOWN, PAGE_UP, PAGE_DOWN, HOME, END, COPY, PASTE, CUT, DELETE_PREV_CHAR, DELETE_NEXT_CHAR, DELETE_PREV_WORD, DELETE_NEXT_WORD, DELETE_FROM_LINE_START, DELETE_TO_LINE_END, SELECT_ALL, SELECT_LEFT_CHAR, SELECT_RIGHT_CHAR, SELECT_UP, SELECT_DOWN, SELECT_PAGE_UP, SELECT_PAGE_DOWN, SELECT_HOME, SELECT_END, SELECT_LEFT_WORD, SELECT_RIGHT_WORD, SELECT_NEXT_PARAGRAPH, SELECT_PREV_PARAGRAPH, SELECT_LINE_START, SELECT_LINE_END, SELECT_LINE_LEFT, SELECT_LINE_RIGHT, DESELECT, NEW_LINE, TAB, UNDO, REDO, CHARACTER_PALETTE};
    }

    static {
        n0[] n0VarArr$values = $values();
        $VALUES = n0VarArr$values;
        $ENTRIES = b8.m11548b(n0VarArr$values);
    }

    private n0(String str, int i10, boolean z6) {
        this.editsText = z6;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }

    public final boolean getEditsText() {
        return this.editsText;
    }
}
