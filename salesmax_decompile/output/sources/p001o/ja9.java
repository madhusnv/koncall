package p001o;

import p001o.ca9;

/* loaded from: classes5.dex */
public enum ja9 {
    ALLOW_JAVA_COMMENTS(false, ca9.EnumC12600a.ALLOW_COMMENTS),
    ALLOW_YAML_COMMENTS(false, ca9.EnumC12600a.ALLOW_YAML_COMMENTS),
    ALLOW_SINGLE_QUOTES(false, ca9.EnumC12600a.ALLOW_SINGLE_QUOTES),
    ALLOW_UNQUOTED_FIELD_NAMES(false, ca9.EnumC12600a.ALLOW_UNQUOTED_FIELD_NAMES),
    ALLOW_UNESCAPED_CONTROL_CHARS(false, ca9.EnumC12600a.ALLOW_UNQUOTED_CONTROL_CHARS),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false, ca9.EnumC12600a.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER),
    ALLOW_LEADING_ZEROS_FOR_NUMBERS(false, ca9.EnumC12600a.ALLOW_NUMERIC_LEADING_ZEROS),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false, ca9.EnumC12600a.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS),
    ALLOW_NON_NUMERIC_NUMBERS(false, ca9.EnumC12600a.ALLOW_NON_NUMERIC_NUMBERS),
    ALLOW_MISSING_VALUES(false, ca9.EnumC12600a.ALLOW_MISSING_VALUES),
    ALLOW_TRAILING_COMMA(false, ca9.EnumC12600a.ALLOW_TRAILING_COMMA);

    private final boolean _defaultState;
    private final ca9.EnumC12600a _mappedFeature;
    private final int _mask = 1 << ordinal();

    ja9(boolean z, ca9.EnumC12600a enumC12600a) {
        this._defaultState = z;
        this._mappedFeature = enumC12600a;
    }

    public static int collectDefaults() {
        int mask = 0;
        for (ja9 ja9Var : values()) {
            if (ja9Var.enabledByDefault()) {
                mask |= ja9Var.getMask();
            }
        }
        return mask;
    }

    public boolean enabledByDefault() {
        return this._defaultState;
    }

    public boolean enabledIn(int i) {
        return (i & this._mask) != 0;
    }

    public int getMask() {
        return this._mask;
    }

    public ca9.EnumC12600a mappedFeature() {
        return this._mappedFeature;
    }
}
