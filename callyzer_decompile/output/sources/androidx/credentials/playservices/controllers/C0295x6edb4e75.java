package androidx.credentials.playservices.controllers;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4168z;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.controllers.CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1 */
/* loaded from: classes.dex */
public final class C0295x6edb4e75 extends AbstractC4155m implements InterfaceC2137a {
    final /* synthetic */ C4168z $exception;
    final /* synthetic */ InterfaceC2139c $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0295x6edb4e75(InterfaceC2139c interfaceC2139c, C4168z c4168z) {
        super(0);
        this.$onError = interfaceC2139c;
        this.$exception = c4168z;
    }

    @Override // ex.InterfaceC2137a
    public /* bridge */ /* synthetic */ Object invoke() {
        m16542invoke();
        return a0.f30746a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m16542invoke() {
        this.$onError.invoke(this.$exception.f21164a);
    }
}
