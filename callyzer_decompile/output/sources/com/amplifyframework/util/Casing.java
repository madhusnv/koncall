package com.amplifyframework.util;

import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Casing {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: com.amplifyframework.util.Casing$1 */
    public static /* synthetic */ class C12691 {
        static final /* synthetic */ int[] $SwitchMap$com$amplifyframework$util$Casing$CaseType;

        static {
            int[] iArr = new int[CaseType.values().length];
            $SwitchMap$com$amplifyframework$util$Casing$CaseType = iArr;
            try {
                iArr[CaseType.SCREAMING_SNAKE_CASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amplifyframework$util$Casing$CaseType[CaseType.CAMEL_CASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amplifyframework$util$Casing$CaseType[CaseType.PASCAL_CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public enum CaseType {
        SCREAMING_SNAKE_CASE,
        CAMEL_CASE,
        PASCAL_CASE
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CasingSource {
        private final CaseType sourceCasing;

        public /* synthetic */ CasingSource(CaseType caseType, int i10) {
            this(caseType);
        }

        public CasingTarget to(CaseType caseType) {
            return new CasingTarget(this.sourceCasing, caseType, 0);
        }

        private CasingSource(CaseType caseType) {
            this.sourceCasing = caseType;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CasingTarget {
        private CaseType sourceCasing;
        private CaseType targetCasing;

        public /* synthetic */ CasingTarget(CaseType caseType, CaseType caseType2, int i10) {
            this(caseType, caseType2);
        }

        public String convert(String str) {
            if (str == null || str.length() == 0) {
                return str;
            }
            int i10 = C12691.$SwitchMap$com$amplifyframework$util$Casing$CaseType[this.sourceCasing.ordinal()];
            if (i10 == 1) {
                return Casing.fromScreamingSnakeCase(str, this.targetCasing);
            }
            if (i10 == 2) {
                return Casing.fromCamelCase(str, this.targetCasing);
            }
            if (i10 == 3) {
                return Casing.fromPascalCase(str, this.targetCasing);
            }
            throw new IllegalStateException("Unknown source casing = " + this.sourceCasing);
        }

        private CasingTarget(CaseType caseType, CaseType caseType2) {
            this.sourceCasing = caseType;
            this.targetCasing = caseType2;
        }
    }

    private Casing() {
    }

    private static String camelToPascal(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(0, 1).toUpperCase(Locale.getDefault()) + str.substring(1);
    }

    public static String capitalize(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(0, 1).toUpperCase(Locale.getDefault()) + str.substring(1).toLowerCase(Locale.getDefault());
    }

    public static String capitalizeFirst(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(0, 1).toUpperCase(Locale.getDefault()) + str.substring(1);
    }

    public static CasingSource from(CaseType caseType) {
        Objects.requireNonNull(caseType);
        return new CasingSource(caseType, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fromCamelCase(String str, CaseType caseType) {
        Objects.requireNonNull(caseType);
        if (str == null) {
            return null;
        }
        int i10 = C12691.$SwitchMap$com$amplifyframework$util$Casing$CaseType[caseType.ordinal()];
        if (i10 == 1) {
            return toScreamingSnake(str);
        }
        if (i10 == 2) {
            return str;
        }
        if (i10 == 3) {
            return camelToPascal(str);
        }
        throw new IllegalStateException("No such casing = " + caseType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fromPascalCase(String str, CaseType caseType) {
        Objects.requireNonNull(caseType);
        if (str == null) {
            return null;
        }
        int i10 = C12691.$SwitchMap$com$amplifyframework$util$Casing$CaseType[caseType.ordinal()];
        if (i10 == 1) {
            return toScreamingSnake(str);
        }
        if (i10 == 2) {
            return pascalToCamel(str);
        }
        if (i10 == 3) {
            return str;
        }
        throw new IllegalStateException("No such casing = " + caseType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fromScreamingSnakeCase(String str, CaseType caseType) {
        int i10;
        Objects.requireNonNull(caseType);
        if (str == null || str.length() == 0 || (i10 = C12691.$SwitchMap$com$amplifyframework$util$Casing$CaseType[caseType.ordinal()]) == 1) {
            return str;
        }
        if (i10 == 2) {
            return screamingSnakeToCamel(str);
        }
        if (i10 == 3) {
            return screamingSnakeToPascal(str);
        }
        throw new IllegalStateException("Unknown target casing = " + caseType);
    }

    private static String pascalToCamel(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(0, 1).toLowerCase(Locale.getDefault()) + str.substring(1);
    }

    private static String screamingSnakeToCamel(String str) {
        return (str == null || str.length() == 0) ? str : pascalToCamel(screamingSnakeToPascal(str));
    }

    private static String screamingSnakeToPascal(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        String[] strArrSplit = str.split("_");
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            sb2.append(capitalize(str2));
        }
        return sb2.toString();
    }

    private static String toScreamingSnake(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            char c2 = charArray[i10];
            if (!Character.isLetterOrDigit(c2)) {
                sb2.append("_");
            } else if (Character.isLowerCase(c2)) {
                sb2.append(Character.toUpperCase(c2));
            } else if (i10 != 0) {
                sb2.append("_");
                sb2.append(c2);
            } else {
                sb2.append(c2);
            }
        }
        return sb2.toString();
    }
}
