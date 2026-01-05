package k4;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import m4.AbstractC4646a;
import og.pe;
import org.bouncycastle.asn1.x509.DisplayText;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k4.s */
/* loaded from: classes.dex */
public final class C3998s implements Comparable {

    /* renamed from: b */
    public static final C3998s f20692b;

    /* renamed from: c */
    public static final C3998s f20693c;

    /* renamed from: d */
    public static final C3998s f20694d;

    /* renamed from: e */
    public static final C3998s f20695e;

    /* renamed from: f */
    public static final C3998s f20696f;

    /* renamed from: g */
    public static final C3998s f20697g;

    /* renamed from: h */
    public static final C3998s f20698h;

    /* renamed from: j */
    public static final C3998s f20699j;

    /* renamed from: k */
    public static final C3998s f20700k;

    /* renamed from: a */
    public final int f20701a;

    static {
        C3998s c3998s = new C3998s(100);
        C3998s c3998s2 = new C3998s(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        C3998s c3998s3 = new C3998s(300);
        C3998s c3998s4 = new C3998s(400);
        f20692b = c3998s4;
        C3998s c3998s5 = new C3998s(500);
        f20693c = c3998s5;
        C3998s c3998s6 = new C3998s(600);
        f20694d = c3998s6;
        C3998s c3998s7 = new C3998s(700);
        C3998s c3998s8 = new C3998s(800);
        C3998s c3998s9 = new C3998s(900);
        f20695e = c3998s4;
        f20696f = c3998s5;
        f20697g = c3998s6;
        f20698h = c3998s7;
        f20699j = c3998s8;
        f20700k = c3998s9;
        pe.m10834i(c3998s, c3998s2, c3998s3, c3998s4, c3998s5, c3998s6, c3998s7, c3998s8, c3998s9);
    }

    public C3998s(int i10) {
        this.f20701a = i10;
        boolean z6 = false;
        if (1 <= i10 && i10 < 1001) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        AbstractC4646a.m9525a("Font weight can be in range [1, 1000]. Current value: " + i10);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3998s c3998s) {
        return AbstractC4154l.m8924g(this.f20701a, c3998s.f20701a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3998s) {
            return this.f20701a == ((C3998s) obj).f20701a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20701a;
    }

    public final String toString() {
        return AbstractC1452a.m4563j(new StringBuilder("FontWeight(weight="), this.f20701a, ')');
    }
}
