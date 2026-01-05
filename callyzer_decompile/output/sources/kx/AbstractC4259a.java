package kx;

import fx.InterfaceC2395a;
import java.util.Iterator;
import pg.h9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kx.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4259a implements Iterable, InterfaceC2395a {

    /* renamed from: a */
    public final char f21637a;

    /* renamed from: b */
    public final char f21638b;

    /* renamed from: c */
    public final int f21639c = 1;

    public AbstractC4259a(char c2, char c10) {
        this.f21637a = c2;
        this.f21638b = (char) h9.m11687a(c2, c10, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C4260b(this.f21637a, this.f21638b, this.f21639c);
    }
}
