package com.amplifyframework.core.model;

import java.util.Objects;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'OWNER' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthStrategy {
    private static final /* synthetic */ AuthStrategy[] $VALUES;
    public static final AuthStrategy CUSTOM = new AuthStrategy("CUSTOM", 0, Provider.FUNCTION, 1);
    public static final AuthStrategy GROUPS;
    public static final AuthStrategy OWNER;
    public static final AuthStrategy PRIVATE;
    public static final AuthStrategy PUBLIC;
    private final Provider defaultAuthProvider;
    private final int priority;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public enum Provider {
        FUNCTION("function", 1),
        USER_POOLS("userPools", 2),
        OIDC("oidc", 3),
        IAM("iam", 4),
        API_KEY("apiKey", 5);

        private final String authDirectiveProviderName;
        private final int priority;

        Provider(String str, int i10) {
            this.authDirectiveProviderName = str;
            this.priority = i10;
        }

        public static Provider from(String str) {
            Objects.requireNonNull(str);
            for (Provider provider : values()) {
                if (str.equals(provider.authDirectiveProviderName)) {
                    return provider;
                }
            }
            throw new IllegalArgumentException("Unable to find a matching auth strategy for ".concat(str));
        }

        public String getAuthDirectiveProviderName() {
            return this.authDirectiveProviderName;
        }

        public int getPriority() {
            return this.priority;
        }
    }

    private static /* synthetic */ AuthStrategy[] $values() {
        return new AuthStrategy[]{CUSTOM, OWNER, GROUPS, PRIVATE, PUBLIC};
    }

    static {
        Provider provider = Provider.USER_POOLS;
        OWNER = new AuthStrategy("OWNER", 1, provider, 2);
        GROUPS = new AuthStrategy("GROUPS", 2, provider, 3);
        PRIVATE = new AuthStrategy("PRIVATE", 3, provider, 4);
        PUBLIC = new AuthStrategy("PUBLIC", 4, Provider.API_KEY, 5);
        $VALUES = $values();
    }

    private AuthStrategy(String str, int i10, Provider provider, int i11) {
        this.defaultAuthProvider = provider;
        this.priority = i11;
    }

    public static AuthStrategy valueOf(String str) {
        return (AuthStrategy) Enum.valueOf(AuthStrategy.class, str);
    }

    public static AuthStrategy[] values() {
        return (AuthStrategy[]) $VALUES.clone();
    }

    public Provider getDefaultAuthProvider() {
        return this.defaultAuthProvider;
    }

    public int getPriority() {
        return this.priority;
    }
}
