package p001o;

import android.text.TextUtils;
import java.util.ArrayList;
import p001o.qbg;

/* loaded from: classes2.dex */
public final class o6j implements qbg {

    /* renamed from: a */
    public final zwc f37838a = new zwc();

    /* renamed from: b */
    public final j6j f37839b = new j6j();

    /* renamed from: d */
    public static int m41653d(zwc zwcVar) {
        int i = -1;
        int iM60025f = 0;
        while (i == -1) {
            iM60025f = zwcVar.m60025f();
            String strM60038s = zwcVar.m60038s();
            i = strM60038s == null ? 0 : "STYLE".equals(strM60038s) ? 2 : strM60038s.startsWith("NOTE") ? 1 : 3;
        }
        zwcVar.m60017U(iM60025f);
        return i;
    }

    /* renamed from: e */
    public static void m41654e(zwc zwcVar) {
        while (!TextUtils.isEmpty(zwcVar.m60038s())) {
        }
    }

    @Override // p001o.qbg
    /* renamed from: a */
    public void mo29158a(byte[] bArr, int i, int i2, qbg.C16330b c16330b, fu3 fu3Var) {
        l6j l6jVarM38438n;
        this.f37838a.m60015S(bArr, i2 + i);
        this.f37838a.m60017U(i);
        ArrayList arrayList = new ArrayList();
        try {
            p6j.m43016d(this.f37838a);
            while (!TextUtils.isEmpty(this.f37838a.m60038s())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iM41653d = m41653d(this.f37838a);
                if (iM41653d == 0) {
                    rba.m46486c(new r6j(arrayList2), c16330b, fu3Var);
                    return;
                }
                if (iM41653d == 1) {
                    m41654e(this.f37838a);
                } else if (iM41653d == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f37838a.m60038s();
                    arrayList.addAll(this.f37839b.m33317d(this.f37838a));
                } else if (iM41653d == 3 && (l6jVarM38438n = m6j.m38438n(this.f37838a, arrayList)) != null) {
                    arrayList2.add(l6jVarM38438n);
                }
            }
        } catch (byc e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // p001o.qbg
    /* renamed from: c */
    public int mo29159c() {
        return 1;
    }
}
