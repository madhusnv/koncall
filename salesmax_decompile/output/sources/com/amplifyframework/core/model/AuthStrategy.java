package com.amplifyframework.core.model;

import com.amazonaws.regions.ServiceAbbreviations;
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
/* loaded from: classes5.dex */
public final class AuthStrategy {
    private static final /* synthetic */ AuthStrategy[] $VALUES;
    public static final AuthStrategy CUSTOM = new AuthStrategy("CUSTOM", 0, Provider.FUNCTION, 1);
    public static final AuthStrategy GROUPS;
    public static final AuthStrategy OWNER;
    public static final AuthStrategy PRIVATE;
    public static final AuthStrategy PUBLIC;
    private final Provider defaultAuthProvider;
    private final int priority;

    public enum Provider {
        FUNCTION("function", 1),
        USER_POOLS("userPools", 2),
        OIDC("oidc", 3),
        IAM(ServiceAbbreviations.IAM, 4),
        API_KEY("apiKey", 5);

        private final String authDirectiveProviderName;
        private final int priority;

        Provider(String str, int i) {
            this.authDirectiveProviderName = str;
            this.priority = i;
        }

        public static Provider from(String str) {
            Objects.requireNonNull(str);
            for (Provider provider : values()) {
                if (str.equals(provider.authDirectiveProviderName)) {
                    return provider;
                }
            }
            throw new IllegalArgumentException("Unable to find a matching auth strategy for " + str);
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

    private AuthStrategy(String str, int i, Provider provider, int i2) {
        this.defaultAuthProvider = provider;
        this.priority = i2;
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
