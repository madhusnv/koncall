package l7;

import android.content.Context;
import android.os.Bundle;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.y */
/* loaded from: classes.dex */
public final /* synthetic */ class C4425y implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f22144a;

    /* renamed from: b */
    public final /* synthetic */ C4168z f22145b;

    public /* synthetic */ C4425y(C4168z c4168z, int i10) {
        this.f22144a = i10;
        this.f22145b = c4168z;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f22144a) {
            case 0:
                String key = (String) obj;
                AbstractC4154l.m8923f(key, "key");
                Object obj2 = this.f22145b.f21164a;
                return Boolean.valueOf(obj2 == null || !((Bundle) obj2).containsKey(key));
            default:
                Context it = (Context) obj;
                AbstractC4154l.m8923f(it, "it");
                this.f22145b.f21164a = it;
                return qw.a0.f30746a;
        }
    }
}
