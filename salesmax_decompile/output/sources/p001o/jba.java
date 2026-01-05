package p001o;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;

/* loaded from: classes2.dex */
public abstract class jba {

    /* renamed from: o.jba$a */
    public static final class C14483a extends jba {

        /* renamed from: a */
        public final String f30089a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14483a(String str) {
            super(null);
            sq8.m48649h(str, "errorMessage");
            this.f30089a = str;
        }

        /* renamed from: a */
        public final String m33473a() {
            return this.f30089a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14483a) && sq8.m48644c(this.f30089a, ((C14483a) obj).f30089a);
        }

        public int hashCode() {
            return this.f30089a.hashCode();
        }

        public String toString() {
            return "Err(errorMessage=" + this.f30089a + ')';
        }
    }

    /* renamed from: o.jba$b */
    public static final class C14484b extends jba {

        /* renamed from: a */
        public final iba f30090a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14484b(iba ibaVar) {
            super(null);
            sq8.m48649h(ibaVar, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
            this.f30090a = ibaVar;
        }

        /* renamed from: a */
        public final iba m33474a() {
            return this.f30090a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14484b) && sq8.m48644c(this.f30090a, ((C14484b) obj).f30090a);
        }

        public int hashCode() {
            return this.f30090a.hashCode();
        }

        public String toString() {
            return "Ok(provider=" + this.f30090a + ')';
        }
    }

    public jba() {
    }

    public /* synthetic */ jba(id5 id5Var) {
        this();
    }
}
