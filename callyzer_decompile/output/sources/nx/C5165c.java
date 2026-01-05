package nx;

import ex.InterfaceC2141e;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import mx.InterfaceC4911g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nx.c */
/* loaded from: classes3.dex */
public final class C5165c implements InterfaceC4911g {

    /* renamed from: a */
    public final CharSequence f25257a;

    /* renamed from: b */
    public final int f25258b;

    /* renamed from: c */
    public final InterfaceC2141e f25259c;

    public C5165c(CharSequence input, int i10, InterfaceC2141e interfaceC2141e) {
        AbstractC4154l.m8923f(input, "input");
        this.f25257a = input;
        this.f25258b = i10;
        this.f25259c = interfaceC2141e;
    }

    @Override // mx.InterfaceC4911g
    public final Iterator iterator() {
        return new C5164b(this);
    }
}
