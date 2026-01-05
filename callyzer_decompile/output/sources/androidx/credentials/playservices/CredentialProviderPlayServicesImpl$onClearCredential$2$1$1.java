package androidx.credentials.playservices;

import androidx.credentials.exceptions.ClearCredentialUnknownException;
import ex.InterfaceC2137a;
import h6.InterfaceC2855k;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl$onClearCredential$2$1$1 extends AbstractC4155m implements InterfaceC2137a {
    final /* synthetic */ InterfaceC2855k $callback;
    final /* synthetic */ Exception $e;
    final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(Exception exc, Executor executor, InterfaceC2855k interfaceC2855k) {
        super(0);
        this.$e = exc;
        this.$executor = executor;
        this.$callback = interfaceC2855k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(InterfaceC2855k callback, Exception e2) {
        AbstractC4154l.m8923f(callback, "$callback");
        AbstractC4154l.m8923f(e2, "$e");
        callback.mo5820a(new ClearCredentialUnknownException(e2.getMessage()));
    }

    @Override // ex.InterfaceC2137a
    public /* bridge */ /* synthetic */ Object invoke() {
        m16520invoke();
        return a0.f30746a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m16520invoke() {
        Objects.toString(this.$e);
        Executor executor = this.$executor;
        final InterfaceC2855k interfaceC2855k = this.$callback;
        final Exception exc = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.d
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl$onClearCredential$2$1$1.invoke$lambda$0(interfaceC2855k, exc);
            }
        });
    }
}
