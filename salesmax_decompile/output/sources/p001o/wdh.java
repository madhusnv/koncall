package p001o;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import p001o.q74;

/* loaded from: classes3.dex */
public final class wdh extends i7 {

    /* renamed from: c */
    public static final C17823a f51822c = new C17823a(null);

    /* renamed from: b */
    public final vdh f51823b;

    /* renamed from: o.wdh$a */
    public static final class C17823a implements q74.InterfaceC16312c {
        public C17823a() {
        }

        public /* synthetic */ C17823a(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wdh(vdh vdhVar) {
        super(f51822c);
        sq8.m48649h(vdhVar, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        this.f51823b = vdhVar;
    }

    /* renamed from: K */
    public final vdh m54242K() {
        return this.f51823b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wdh) && sq8.m48644c(this.f51823b, ((wdh) obj).f51823b);
    }

    public int hashCode() {
        return this.f51823b.hashCode();
    }

    public String toString() {
        return "TelemetryContext(" + this.f51823b + ')';
    }
}
