package com.amplifyframework.util;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class Casing {

    /* renamed from: com.amplifyframework.util.Casing$1 */
    public static /* synthetic */ class C107181 {
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

    public enum CaseType {
        SCREAMING_SNAKE_CASE,
        CAMEL_CASE,
        PASCAL_CASE
    }

    public static final class CasingSource {
        private final CaseType sourceCasing;

        public CasingTarget to(CaseType caseType) {
            return new CasingTarget(this.sourceCasing, caseType);
        }

        private CasingSource(CaseType caseType) {
            this.sourceCasing = caseType;
        }
    }

    public static final class CasingTarget {
        private CaseType sourceCasing;
        private CaseType targetCasing;

        public String convert(String str) {
            if (str == null || str.length() == 0) {
                return str;
            }
            int i = C107181.$SwitchMap$com$amplifyframework$util$Casing$CaseType[this.sourceCasing.ordinal()];
            if (i == 1) {
                return Casing.fromScreamingSnakeCase(str, this.targetCasing);
            }
            if (i == 2) {
                return Casing.fromCamelCase(str, this.targetCasing);
            }
            if (i == 3) {
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
        return new CasingSource(caseType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fromCamelCase(String str, CaseType caseType) {
        Objects.requireNonNull(caseType);
        if (str == null) {
            return null;
        }
        int i = C107181.$SwitchMap$com$amplifyframework$util$Casing$CaseType[caseType.ordinal()];
        if (i == 1) {
            return toScreamingSnake(str);
        }
        if (i == 2) {
            return str;
        }
        if (i == 3) {
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
        int i = C107181.$SwitchMap$com$amplifyframework$util$Casing$CaseType[caseType.ordinal()];
        if (i == 1) {
            return toScreamingSnake(str);
        }
        if (i == 2) {
            return pascalToCamel(str);
        }
        if (i == 3) {
            return str;
        }
        throw new IllegalStateException("No such casing = " + caseType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fromScreamingSnakeCase(String str, CaseType caseType) {
        int i;
        Objects.requireNonNull(caseType);
        if (str == null || str.length() == 0 || (i = C107181.$SwitchMap$com$amplifyframework$util$Casing$CaseType[caseType.ordinal()]) == 1) {
            return str;
        }
        if (i == 2) {
            return screamingSnakeToCamel(str);
        }
        if (i == 3) {
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
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            sb.append(capitalize(str2));
        }
        return sb.toString();
    }

    private static String toScreamingSnake(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (!Character.isLetterOrDigit(c)) {
                sb.append("_");
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else if (i != 0) {
                sb.append("_");
                sb.append(c);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
