package kk;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kk.a */
/* loaded from: classes.dex */
public abstract class EnumC4081a implements InterfaceC4082b {
    private static final /* synthetic */ EnumC4081a[] $VALUES;
    public static final EnumC4081a IDENTITY;
    public static final EnumC4081a LOWER_CASE_WITH_DASHES;
    public static final EnumC4081a LOWER_CASE_WITH_DOTS;
    public static final EnumC4081a LOWER_CASE_WITH_UNDERSCORES;
    public static final EnumC4081a UPPER_CAMEL_CASE;
    public static final EnumC4081a UPPER_CAMEL_CASE_WITH_SPACES;
    public static final EnumC4081a UPPER_CASE_WITH_UNDERSCORES;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: kk.a$a */
    public enum a extends EnumC4081a {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // kk.EnumC4081a, kk.InterfaceC4082b
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // kk.EnumC4081a, kk.InterfaceC4082b
        public String translateName(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        IDENTITY = aVar;
        EnumC4081a enumC4081a = new EnumC4081a("UPPER_CAMEL_CASE", 1) { // from class: kk.a.b
            {
                a aVar2 = null;
            }

            @Override // kk.EnumC4081a, kk.InterfaceC4082b
            public List alternateNames(Field field) {
                return Collections.EMPTY_LIST;
            }

            @Override // kk.EnumC4081a, kk.InterfaceC4082b
            public String translateName(Field field) {
                return EnumC4081a.upperCaseFirstLetter(field.getName());
            }
        };
        UPPER_CAMEL_CASE = enumC4081a;
        EnumC4081a enumC4081a2 = new EnumC4081a("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: kk.a.c
            {
                a aVar2 = null;
            }

            @Override // kk.EnumC4081a, kk.InterfaceC4082b
            public List alternateNames(Field field) {
                return Collections.EMPTY_LIST;
            }

            @Override // kk.EnumC4081a, kk.InterfaceC4082b
            public String translateName(Field field) {
                return EnumC4081a.upperCaseFirstLetter(EnumC4081a.separateCamelCase(field.getName(), ' '));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = enumC4081a2;
        EnumC4081a enumC4081a3 = new EnumC4081a("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: kk.a.d
            {
                a aVar2 = null;
            }

            @Override // kk.EnumC4081a, kk.InterfaceC4082b
            public List alternateNames(Field field) {
                return Collections.EMPTY_LIST;
            }

            @Override // kk.EnumC4081a, kk.InterfaceC4082b
            public String translateName(Field field) {
                return EnumC4081a.separateCamelCase(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = enumC4081a3;
        EnumC4081a enumC4081a4 = new EnumC4081a("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: kk.a.e
            {
                a aVar2 = null;
            }

            @Override // kk.EnumC4081a, kk.InterfaceC4082b
            public List alternateNames(Field field) {
                return Collections.EMPTY_LIST;
            }

            @Override // kk.EnumC4081a, kk.InterfaceC4082b
            public String translateName(Field field) {
                return EnumC4081a.separateCamelCase(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = enumC4081a4;
        EnumC4081a enumC4081a5 = new EnumC4081a("LOWER_CASE_WITH_DASHES", 5) { // from class: kk.a.f
            {
                a aVar2 = null;
            }

            @Override // kk.EnumC4081a, kk.InterfaceC4082b
            public List alternateNames(Field field) {
                return Collections.EMPTY_LIST;
            }

            @Override // kk.EnumC4081a, kk.InterfaceC4082b
            public String translateName(Field field) {
                return EnumC4081a.separateCamelCase(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = enumC4081a5;
        EnumC4081a enumC4081a6 = new EnumC4081a("LOWER_CASE_WITH_DOTS", 6) { // from class: kk.a.g
            {
                a aVar2 = null;
            }

            @Override // kk.EnumC4081a, kk.InterfaceC4082b
            public List alternateNames(Field field) {
                return Collections.EMPTY_LIST;
            }

            @Override // kk.EnumC4081a, kk.InterfaceC4082b
            public String translateName(Field field) {
                return EnumC4081a.separateCamelCase(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = enumC4081a6;
        $VALUES = new EnumC4081a[]{aVar, enumC4081a, enumC4081a2, enumC4081a3, enumC4081a4, enumC4081a5, enumC4081a6};
    }

    private EnumC4081a(String str, int i10) {
    }

    public static String separateCamelCase(String str, char c2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(c2);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static String upperCaseFirstLetter(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = str.charAt(i10);
            if (!Character.isLetter(cCharAt)) {
                i10++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static EnumC4081a valueOf(String str) {
        return (EnumC4081a) Enum.valueOf(EnumC4081a.class, str);
    }

    public static EnumC4081a[] values() {
        return (EnumC4081a[]) $VALUES.clone();
    }

    @Override // kk.InterfaceC4082b
    public List alternateNames(Field field) {
        return Collections.EMPTY_LIST;
    }

    @Override // kk.InterfaceC4082b
    public abstract /* synthetic */ String translateName(Field field);

    public /* synthetic */ EnumC4081a(String str, int i10, a aVar) {
        this(str, i10);
    }
}
