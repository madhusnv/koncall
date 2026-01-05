package h6;

import android.app.Activity;
import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import c4.C0856f;
import ey.C2147b;
import kotlin.jvm.internal.AbstractC4154l;
import pg.n6;
import tx.C7251k;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h6.j */
/* loaded from: classes.dex */
public interface InterfaceC2854j {
    /* renamed from: b */
    static Object m6985b(Context context, C2863s c2863s, InterfaceC7559c interfaceC7559c) {
        C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        CancellationSignal cancellationSignal = new CancellationSignal();
        c7251k.m13542t(new C0856f(cancellationSignal, 2));
        C2147b c2147b = new C2147b(c7251k);
        ExecutorC2852h executorC2852h = new ExecutorC2852h(0);
        AbstractC4154l.m8923f(context, "context");
        InterfaceC2858n interfaceC2858nM6989b = C2859o.m6989b(new C2859o(context));
        if (interfaceC2858nM6989b == null) {
            c2147b.mo5820a(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            interfaceC2858nM6989b.onGetCredential(context, c2863s, cancellationSignal, executorC2852h, c2147b);
        }
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    /* renamed from: a */
    default Object m6986a(Activity context, C2850f c2850f, InterfaceC7559c interfaceC7559c) {
        C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        CancellationSignal cancellationSignal = new CancellationSignal();
        c7251k.m13542t(new C0856f(cancellationSignal, 1));
        C2853i c2853i = new C2853i(c7251k);
        ExecutorC2852h executorC2852h = new ExecutorC2852h(0);
        AbstractC4154l.m8923f(context, "context");
        InterfaceC2858n interfaceC2858nM6989b = C2859o.m6989b(new C2859o(((C2856l) this).f15864a));
        if (interfaceC2858nM6989b == null) {
            c2853i.mo5820a(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            interfaceC2858nM6989b.onCreateCredential(context, c2850f, cancellationSignal, executorC2852h, c2853i);
        }
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }
}
