package ob;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import oj.C5396h;
import ox.C5770a;
import qw.a0;
import s6.C6763b;
import tb.C7095f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ob.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C5333a implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f26230a;

    /* renamed from: b */
    public final /* synthetic */ long f26231b;

    public /* synthetic */ C5333a(int i10, long j6) {
        this.f26230a = i10;
        this.f26231b = j6;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f26230a) {
            case 0:
                C7095f presignGetObject = (C7095f) obj;
                AbstractC4154l.m8923f(presignGetObject, "$this$presignGetObject");
                presignGetObject.f34237m = new C5770a(this.f26231b);
                return a0.f30746a;
            case 1:
                ((C6763b) obj).m12968e(C5396h.f27082b, Long.valueOf(this.f26231b));
                return null;
            default:
                return Long.valueOf(this.f26231b);
        }
    }
}
