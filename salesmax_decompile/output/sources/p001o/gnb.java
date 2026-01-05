package p001o;

import java.util.ArrayList;
import java.util.Collections;
import p001o.cd4;
import p001o.qbg;

/* loaded from: classes2.dex */
public final class gnb implements qbg {

    /* renamed from: a */
    public final zwc f25562a = new zwc();

    /* renamed from: d */
    public static cd4 m29157d(zwc zwcVar, int i) {
        CharSequence charSequenceM38441q = null;
        cd4.C12641b c12641bM38439o = null;
        while (i > 0) {
            op0.m42512b(i >= 8, "Incomplete vtt cue box header found.");
            int iM60036q = zwcVar.m60036q();
            int iM60036q2 = zwcVar.m60036q();
            int i2 = iM60036q - 8;
            String strM48704I = sqi.m48704I(zwcVar.m60024e(), zwcVar.m60025f(), i2);
            zwcVar.m60018V(i2);
            i = (i - 8) - i2;
            if (iM60036q2 == 1937011815) {
                c12641bM38439o = m6j.m38439o(strM48704I);
            } else if (iM60036q2 == 1885436268) {
                charSequenceM38441q = m6j.m38441q(null, strM48704I.trim(), Collections.emptyList());
            }
        }
        if (charSequenceM38441q == null) {
            charSequenceM38441q = "";
        }
        return c12641bM38439o != null ? c12641bM38439o.m20933o(charSequenceM38441q).m20919a() : m6j.m38436l(charSequenceM38441q);
    }

    @Override // p001o.qbg
    /* renamed from: a */
    public void mo29158a(byte[] bArr, int i, int i2, qbg.C16330b c16330b, fu3 fu3Var) {
        this.f25562a.m60015S(bArr, i2 + i);
        this.f25562a.m60017U(i);
        ArrayList arrayList = new ArrayList();
        while (this.f25562a.m60020a() > 0) {
            op0.m42512b(this.f25562a.m60020a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iM60036q = this.f25562a.m60036q();
            if (this.f25562a.m60036q() == 1987343459) {
                arrayList.add(m29157d(this.f25562a, iM60036q - 8));
            } else {
                this.f25562a.m60018V(iM60036q - 8);
            }
        }
        fu3Var.accept(new jd4(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // p001o.qbg
    /* renamed from: c */
    public int mo29159c() {
        return 2;
    }
}
