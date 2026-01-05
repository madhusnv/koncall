package j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: j$.time.format.d */
/* loaded from: classes2.dex */
public final class C3434d implements InterfaceC3435e {

    /* renamed from: a */
    public final InterfaceC3435e[] f18154a;

    /* renamed from: b */
    public final boolean f18155b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3434d(List list, boolean z6) {
        ArrayList arrayList = (ArrayList) list;
        this((InterfaceC3435e[]) arrayList.toArray(new InterfaceC3435e[arrayList.size()]), z6);
    }

    public C3434d(InterfaceC3435e[] interfaceC3435eArr, boolean z6) {
        this.f18154a = interfaceC3435eArr;
        this.f18155b = z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        return true;
     */
    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo7963t(j$.time.format.C3453w r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 1
            boolean r2 = r7.f18155b
            if (r2 == 0) goto Le
            int r3 = r8.f18213c
            int r3 = r3 + r1
            r8.f18213c = r3
        Le:
            j$.time.format.e[] r3 = r7.f18154a     // Catch: java.lang.Throwable -> L27
            int r4 = r3.length     // Catch: java.lang.Throwable -> L27
            r5 = 0
        L12:
            if (r5 >= r4) goto L2c
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L27
            boolean r6 = r6.mo7963t(r8, r9)     // Catch: java.lang.Throwable -> L27
            if (r6 != 0) goto L29
            r9.setLength(r0)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2f
        L21:
            int r9 = r8.f18213c
            int r9 = r9 - r1
            r8.f18213c = r9
            return r1
        L27:
            r9 = move-exception
            goto L30
        L29:
            int r5 = r5 + 1
            goto L12
        L2c:
            if (r2 == 0) goto L2f
            goto L21
        L2f:
            return r1
        L30:
            if (r2 == 0) goto L37
            int r0 = r8.f18213c
            int r0 = r0 - r1
            r8.f18213c = r0
        L37:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.C3434d.mo7963t(j$.time.format.w, java.lang.StringBuilder):boolean");
    }

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: C */
    public final int mo7962C(C3451u c3451u, CharSequence charSequence, int i10) {
        boolean z6 = this.f18155b;
        InterfaceC3435e[] interfaceC3435eArr = this.f18154a;
        int i11 = 0;
        if (z6) {
            ArrayList arrayList = c3451u.f18205d;
            a0 a0VarM7986c = c3451u.m7986c();
            a0VarM7986c.getClass();
            a0 a0Var = new a0();
            ((HashMap) a0Var.f18136a).putAll(a0VarM7986c.f18136a);
            a0Var.f18137b = a0VarM7986c.f18137b;
            a0Var.f18138c = a0VarM7986c.f18138c;
            a0Var.f18139d = a0VarM7986c.f18139d;
            arrayList.add(a0Var);
            int length = interfaceC3435eArr.length;
            int iMo7962C = i10;
            while (i11 < length) {
                iMo7962C = interfaceC3435eArr[i11].mo7962C(c3451u, charSequence, iMo7962C);
                if (iMo7962C < 0) {
                    c3451u.f18205d.remove(r8.size() - 1);
                    return i10;
                }
                i11++;
            }
            c3451u.f18205d.remove(r8.size() - 2);
            return iMo7962C;
        }
        int length2 = interfaceC3435eArr.length;
        while (i11 < length2) {
            i10 = interfaceC3435eArr[i11].mo7962C(c3451u, charSequence, i10);
            if (i10 < 0) {
                return i10;
            }
            i11++;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        InterfaceC3435e[] interfaceC3435eArr = this.f18154a;
        if (interfaceC3435eArr != null) {
            boolean z6 = this.f18155b;
            sb2.append(z6 ? "[" : "(");
            for (InterfaceC3435e interfaceC3435e : interfaceC3435eArr) {
                sb2.append(interfaceC3435e);
            }
            sb2.append(z6 ? "]" : ")");
        }
        return sb2.toString();
    }
}
