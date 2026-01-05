package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class mxh {

    /* renamed from: e */
    public static final C15448a f36081e = new C15448a(null);

    /* renamed from: f */
    public static final mxh f36082f = new mxh(0, 0, new Object[0]);

    /* renamed from: a */
    public int f36083a;

    /* renamed from: b */
    public int f36084b;

    /* renamed from: c */
    public final sob f36085c;

    /* renamed from: d */
    public Object[] f36086d;

    /* renamed from: o.mxh$a */
    public static final class C15448a {
        public C15448a() {
        }

        public /* synthetic */ C15448a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final mxh m39811a() {
            return mxh.f36082f;
        }
    }

    /* renamed from: o.mxh$b */
    public static final class C15449b {

        /* renamed from: a */
        public mxh f36087a;

        /* renamed from: b */
        public final int f36088b;

        public C15449b(mxh mxhVar, int i) {
            sq8.m48649h(mxhVar, "node");
            this.f36087a = mxhVar;
            this.f36088b = i;
        }

        /* renamed from: a */
        public final mxh m39812a() {
            return this.f36087a;
        }

        /* renamed from: b */
        public final int m39813b() {
            return this.f36088b;
        }

        /* renamed from: c */
        public final void m39814c(mxh mxhVar) {
            sq8.m48649h(mxhVar, "<set-?>");
            this.f36087a = mxhVar;
        }
    }

    public mxh(int i, int i2, Object[] objArr, sob sobVar) {
        sq8.m48649h(objArr, "buffer");
        this.f36083a = i;
        this.f36084b = i2;
        this.f36085c = sobVar;
        this.f36086d = objArr;
    }

    /* renamed from: A */
    public final mxh m39763A(int i, t4d t4dVar) {
        t4dVar.m49291k(t4dVar.size() - 1);
        t4dVar.m49289g(m39785W(i));
        if (this.f36086d.length == 2) {
            return null;
        }
        if (this.f36085c != t4dVar.m49287e()) {
            return new mxh(0, 0, qxh.m45965h(this.f36086d, i), t4dVar.m49287e());
        }
        this.f36086d = qxh.m45965h(this.f36086d, i);
        return this;
    }

    /* renamed from: B */
    public final mxh m39764B(int i, Object obj, Object obj2, sob sobVar) {
        int iM39798n = m39798n(i);
        if (this.f36085c != sobVar) {
            return new mxh(i | this.f36083a, this.f36084b, qxh.m45964g(this.f36086d, iM39798n, obj, obj2), sobVar);
        }
        this.f36086d = qxh.m45964g(this.f36086d, iM39798n, obj, obj2);
        this.f36083a = i | this.f36083a;
        return this;
    }

    /* renamed from: C */
    public final mxh m39765C(int i, int i2, int i3, Object obj, Object obj2, int i4, sob sobVar) {
        if (this.f36085c != sobVar) {
            return new mxh(this.f36083a ^ i2, i2 | this.f36084b, m39788d(i, i2, i3, obj, obj2, i4, sobVar), sobVar);
        }
        this.f36086d = m39788d(i, i2, i3, obj, obj2, i4, sobVar);
        this.f36083a ^= i2;
        this.f36084b |= i2;
        return this;
    }

    /* renamed from: D */
    public final mxh m39766D(int i, Object obj, Object obj2, int i2, t4d t4dVar) {
        sq8.m48649h(t4dVar, "mutator");
        int iM45963f = 1 << qxh.m45963f(i, i2);
        if (m39801q(iM45963f)) {
            int iM39798n = m39798n(iM45963f);
            if (sq8.m48644c(obj, m39804t(iM39798n))) {
                t4dVar.m49289g(m39785W(iM39798n));
                return m39785W(iM39798n) == obj2 ? this : m39775M(iM39798n, obj2, t4dVar);
            }
            t4dVar.m49291k(t4dVar.size() + 1);
            return m39765C(iM39798n, iM45963f, i, obj, obj2, i2, t4dVar.m49287e());
        }
        if (!m39802r(iM45963f)) {
            t4dVar.m49291k(t4dVar.size() + 1);
            return m39764B(iM45963f, obj, obj2, t4dVar.m49287e());
        }
        int iM39777O = m39777O(iM45963f);
        mxh mxhVarM39776N = m39776N(iM39777O);
        mxh mxhVarM39807w = i2 == 30 ? mxhVarM39776N.m39807w(obj, obj2, t4dVar) : mxhVarM39776N.m39766D(i, obj, obj2, i2 + 5, t4dVar);
        return mxhVarM39776N == mxhVarM39807w ? this : m39774L(iM39777O, mxhVarM39807w, t4dVar.m49287e());
    }

    /* renamed from: E */
    public final mxh m39767E(mxh mxhVar, int i, yl5 yl5Var, t4d t4dVar) {
        sq8.m48649h(mxhVar, "otherNode");
        sq8.m48649h(yl5Var, "intersectionCounter");
        sq8.m48649h(t4dVar, "mutator");
        if (this == mxhVar) {
            yl5Var.m57985b(m39789e());
            return this;
        }
        if (i > 30) {
            return m39808x(mxhVar, yl5Var, t4dVar.m49287e());
        }
        int i2 = this.f36084b | mxhVar.f36084b;
        int i3 = this.f36083a;
        int i4 = mxhVar.f36083a;
        int i5 = (i3 ^ i4) & (~i2);
        int i6 = i3 & i4;
        int i7 = i5;
        while (i6 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i6);
            if (sq8.m48644c(m39804t(m39798n(iLowestOneBit)), mxhVar.m39804t(mxhVar.m39798n(iLowestOneBit)))) {
                i7 |= iLowestOneBit;
            } else {
                i2 |= iLowestOneBit;
            }
            i6 ^= iLowestOneBit;
        }
        int i8 = 0;
        if (!((i2 & i7) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        mxh mxhVar2 = (sq8.m48644c(this.f36085c, t4dVar.m49287e()) && this.f36083a == i7 && this.f36084b == i2) ? this : new mxh(i7, i2, new Object[(Integer.bitCount(i7) * 2) + Integer.bitCount(i2)]);
        int i9 = i2;
        int i10 = 0;
        while (i9 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i9);
            Object[] objArr = mxhVar2.f36086d;
            objArr[(objArr.length - 1) - i10] = m39768F(mxhVar, iLowestOneBit2, i, yl5Var, t4dVar);
            i10++;
            i9 ^= iLowestOneBit2;
        }
        while (i7 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i7);
            int i11 = i8 * 2;
            if (mxhVar.m39801q(iLowestOneBit3)) {
                int iM39798n = mxhVar.m39798n(iLowestOneBit3);
                mxhVar2.f36086d[i11] = mxhVar.m39804t(iM39798n);
                mxhVar2.f36086d[i11 + 1] = mxhVar.m39785W(iM39798n);
                if (m39801q(iLowestOneBit3)) {
                    yl5Var.m57986c(yl5Var.m57984a() + 1);
                }
            } else {
                int iM39798n2 = m39798n(iLowestOneBit3);
                mxhVar2.f36086d[i11] = m39804t(iM39798n2);
                mxhVar2.f36086d[i11 + 1] = m39785W(iM39798n2);
            }
            i8++;
            i7 ^= iLowestOneBit3;
        }
        return m39796l(mxhVar2) ? this : mxhVar.m39796l(mxhVar2) ? mxhVar : mxhVar2;
    }

    /* renamed from: F */
    public final mxh m39768F(mxh mxhVar, int i, int i2, yl5 yl5Var, t4d t4dVar) {
        if (m39802r(i)) {
            mxh mxhVarM39776N = m39776N(m39777O(i));
            if (mxhVar.m39802r(i)) {
                return mxhVarM39776N.m39767E(mxhVar.m39776N(mxhVar.m39777O(i)), i2 + 5, yl5Var, t4dVar);
            }
            if (!mxhVar.m39801q(i)) {
                return mxhVarM39776N;
            }
            int iM39798n = mxhVar.m39798n(i);
            Object objM39804t = mxhVar.m39804t(iM39798n);
            Object objM39785W = mxhVar.m39785W(iM39798n);
            int size = t4dVar.size();
            mxh mxhVarM39766D = mxhVarM39776N.m39766D(objM39804t != null ? objM39804t.hashCode() : 0, objM39804t, objM39785W, i2 + 5, t4dVar);
            if (t4dVar.size() != size) {
                return mxhVarM39766D;
            }
            yl5Var.m57986c(yl5Var.m57984a() + 1);
            return mxhVarM39766D;
        }
        if (!mxhVar.m39802r(i)) {
            int iM39798n2 = m39798n(i);
            Object objM39804t2 = m39804t(iM39798n2);
            Object objM39785W2 = m39785W(iM39798n2);
            int iM39798n3 = mxhVar.m39798n(i);
            Object objM39804t3 = mxhVar.m39804t(iM39798n3);
            return m39805u(objM39804t2 != null ? objM39804t2.hashCode() : 0, objM39804t2, objM39785W2, objM39804t3 != null ? objM39804t3.hashCode() : 0, objM39804t3, mxhVar.m39785W(iM39798n3), i2 + 5, t4dVar.m49287e());
        }
        mxh mxhVarM39776N2 = mxhVar.m39776N(mxhVar.m39777O(i));
        if (m39801q(i)) {
            int iM39798n4 = m39798n(i);
            Object objM39804t4 = m39804t(iM39798n4);
            int i3 = i2 + 5;
            if (!mxhVarM39776N2.m39795k(objM39804t4 != null ? objM39804t4.hashCode() : 0, objM39804t4, i3)) {
                return mxhVarM39776N2.m39766D(objM39804t4 != null ? objM39804t4.hashCode() : 0, objM39804t4, m39785W(iM39798n4), i3, t4dVar);
            }
            yl5Var.m57986c(yl5Var.m57984a() + 1);
        }
        return mxhVarM39776N2;
    }

    /* renamed from: G */
    public final mxh m39769G(int i, Object obj, int i2, t4d t4dVar) {
        sq8.m48649h(t4dVar, "mutator");
        int iM45963f = 1 << qxh.m45963f(i, i2);
        if (m39801q(iM45963f)) {
            int iM39798n = m39798n(iM45963f);
            return sq8.m48644c(obj, m39804t(iM39798n)) ? m39771I(iM39798n, iM45963f, t4dVar) : this;
        }
        if (!m39802r(iM45963f)) {
            return this;
        }
        int iM39777O = m39777O(iM45963f);
        mxh mxhVarM39776N = m39776N(iM39777O);
        return m39773K(mxhVarM39776N, i2 == 30 ? mxhVarM39776N.m39810z(obj, t4dVar) : mxhVarM39776N.m39769G(i, obj, i2 + 5, t4dVar), iM39777O, iM45963f, t4dVar.m49287e());
    }

    /* renamed from: H */
    public final mxh m39770H(int i, Object obj, Object obj2, int i2, t4d t4dVar) {
        sq8.m48649h(t4dVar, "mutator");
        int iM45963f = 1 << qxh.m45963f(i, i2);
        if (m39801q(iM45963f)) {
            int iM39798n = m39798n(iM45963f);
            return (sq8.m48644c(obj, m39804t(iM39798n)) && sq8.m48644c(obj2, m39785W(iM39798n))) ? m39771I(iM39798n, iM45963f, t4dVar) : this;
        }
        if (!m39802r(iM45963f)) {
            return this;
        }
        int iM39777O = m39777O(iM45963f);
        mxh mxhVarM39776N = m39776N(iM39777O);
        return m39773K(mxhVarM39776N, i2 == 30 ? mxhVarM39776N.m39809y(obj, obj2, t4dVar) : mxhVarM39776N.m39770H(i, obj, obj2, i2 + 5, t4dVar), iM39777O, iM45963f, t4dVar.m49287e());
    }

    /* renamed from: I */
    public final mxh m39771I(int i, int i2, t4d t4dVar) {
        t4dVar.m49291k(t4dVar.size() - 1);
        t4dVar.m49289g(m39785W(i));
        if (this.f36086d.length == 2) {
            return null;
        }
        if (this.f36085c != t4dVar.m49287e()) {
            return new mxh(i2 ^ this.f36083a, this.f36084b, qxh.m45965h(this.f36086d, i), t4dVar.m49287e());
        }
        this.f36086d = qxh.m45965h(this.f36086d, i);
        this.f36083a ^= i2;
        return this;
    }

    /* renamed from: J */
    public final mxh m39772J(int i, int i2, sob sobVar) {
        Object[] objArr = this.f36086d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f36085c != sobVar) {
            return new mxh(this.f36083a, i2 ^ this.f36084b, qxh.m45966i(objArr, i), sobVar);
        }
        this.f36086d = qxh.m45966i(objArr, i);
        this.f36084b ^= i2;
        return this;
    }

    /* renamed from: K */
    public final mxh m39773K(mxh mxhVar, mxh mxhVar2, int i, int i2, sob sobVar) {
        return mxhVar2 == null ? m39772J(i, i2, sobVar) : (this.f36085c == sobVar || mxhVar != mxhVar2) ? m39774L(i, mxhVar2, sobVar) : this;
    }

    /* renamed from: L */
    public final mxh m39774L(int i, mxh mxhVar, sob sobVar) {
        Object[] objArr = this.f36086d;
        if (objArr.length == 1 && mxhVar.f36086d.length == 2 && mxhVar.f36084b == 0) {
            mxhVar.f36083a = this.f36084b;
            return mxhVar;
        }
        if (this.f36085c == sobVar) {
            objArr[i] = mxhVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        sq8.m48648g(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i] = mxhVar;
        return new mxh(this.f36083a, this.f36084b, objArrCopyOf, sobVar);
    }

    /* renamed from: M */
    public final mxh m39775M(int i, Object obj, t4d t4dVar) {
        if (this.f36085c == t4dVar.m49287e()) {
            this.f36086d[i + 1] = obj;
            return this;
        }
        t4dVar.m49288f(t4dVar.m49285c() + 1);
        Object[] objArr = this.f36086d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        sq8.m48648g(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i + 1] = obj;
        return new mxh(this.f36083a, this.f36084b, objArrCopyOf, t4dVar.m49287e());
    }

    /* renamed from: N */
    public final mxh m39776N(int i) {
        Object obj = this.f36086d[i];
        sq8.m48647f(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (mxh) obj;
    }

    /* renamed from: O */
    public final int m39777O(int i) {
        return (this.f36086d.length - 1) - Integer.bitCount((i - 1) & this.f36084b);
    }

    /* renamed from: P */
    public final C15449b m39778P(int i, Object obj, Object obj2, int i2) {
        C15449b c15449bM39778P;
        int iM45963f = 1 << qxh.m45963f(i, i2);
        if (m39801q(iM45963f)) {
            int iM39798n = m39798n(iM45963f);
            if (!sq8.m48644c(obj, m39804t(iM39798n))) {
                return m39806v(iM39798n, iM45963f, i, obj, obj2, i2).m39786b();
            }
            if (m39785W(iM39798n) == obj2) {
                return null;
            }
            return m39784V(iM39798n, obj2).m39787c();
        }
        if (!m39802r(iM45963f)) {
            return m39803s(iM45963f, obj, obj2).m39786b();
        }
        int iM39777O = m39777O(iM45963f);
        mxh mxhVarM39776N = m39776N(iM39777O);
        if (i2 == 30) {
            c15449bM39778P = mxhVarM39776N.m39792h(obj, obj2);
            if (c15449bM39778P == null) {
                return null;
            }
        } else {
            c15449bM39778P = mxhVarM39776N.m39778P(i, obj, obj2, i2 + 5);
            if (c15449bM39778P == null) {
                return null;
            }
        }
        c15449bM39778P.m39814c(m39783U(iM39777O, iM45963f, c15449bM39778P.m39812a()));
        return c15449bM39778P;
    }

    /* renamed from: Q */
    public final mxh m39779Q(int i, Object obj, int i2) {
        int iM45963f = 1 << qxh.m45963f(i, i2);
        if (m39801q(iM45963f)) {
            int iM39798n = m39798n(iM45963f);
            return sq8.m48644c(obj, m39804t(iM39798n)) ? m39780R(iM39798n, iM45963f) : this;
        }
        if (!m39802r(iM45963f)) {
            return this;
        }
        int iM39777O = m39777O(iM45963f);
        mxh mxhVarM39776N = m39776N(iM39777O);
        return m39782T(mxhVarM39776N, i2 == 30 ? mxhVarM39776N.m39793i(obj) : mxhVarM39776N.m39779Q(i, obj, i2 + 5), iM39777O, iM45963f);
    }

    /* renamed from: R */
    public final mxh m39780R(int i, int i2) {
        Object[] objArr = this.f36086d;
        if (objArr.length == 2) {
            return null;
        }
        return new mxh(i2 ^ this.f36083a, this.f36084b, qxh.m45965h(objArr, i));
    }

    /* renamed from: S */
    public final mxh m39781S(int i, int i2) {
        Object[] objArr = this.f36086d;
        if (objArr.length == 1) {
            return null;
        }
        return new mxh(this.f36083a, i2 ^ this.f36084b, qxh.m45966i(objArr, i));
    }

    /* renamed from: T */
    public final mxh m39782T(mxh mxhVar, mxh mxhVar2, int i, int i2) {
        return mxhVar2 == null ? m39781S(i, i2) : mxhVar != mxhVar2 ? m39783U(i, i2, mxhVar2) : this;
    }

    /* renamed from: U */
    public final mxh m39783U(int i, int i2, mxh mxhVar) {
        Object[] objArr = mxhVar.f36086d;
        if (objArr.length != 2 || mxhVar.f36084b != 0) {
            Object[] objArr2 = this.f36086d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            sq8.m48648g(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[i] = mxhVar;
            return new mxh(this.f36083a, this.f36084b, objArrCopyOf);
        }
        if (this.f36086d.length == 1) {
            mxhVar.f36083a = this.f36084b;
            return mxhVar;
        }
        return new mxh(this.f36083a ^ i2, i2 ^ this.f36084b, qxh.m45968k(this.f36086d, i, m39798n(i2), objArr[0], objArr[1]));
    }

    /* renamed from: V */
    public final mxh m39784V(int i, Object obj) {
        Object[] objArr = this.f36086d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        sq8.m48648g(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i + 1] = obj;
        return new mxh(this.f36083a, this.f36084b, objArrCopyOf);
    }

    /* renamed from: W */
    public final Object m39785W(int i) {
        return this.f36086d[i + 1];
    }

    /* renamed from: b */
    public final C15449b m39786b() {
        return new C15449b(this, 1);
    }

    /* renamed from: c */
    public final C15449b m39787c() {
        return new C15449b(this, 0);
    }

    /* renamed from: d */
    public final Object[] m39788d(int i, int i2, int i3, Object obj, Object obj2, int i4, sob sobVar) {
        Object objM39804t = m39804t(i);
        return qxh.m45967j(this.f36086d, i, m39777O(i2) + 1, m39805u(objM39804t != null ? objM39804t.hashCode() : 0, objM39804t, m39785W(i), i3, obj, obj2, i4 + 5, sobVar));
    }

    /* renamed from: e */
    public final int m39789e() {
        if (this.f36084b == 0) {
            return this.f36086d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f36083a);
        int length = this.f36086d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += m39776N(i).m39789e();
        }
        return iBitCount;
    }

    /* renamed from: f */
    public final boolean m39790f(Object obj) {
        il8 il8VarM18615r = bce.m18615r(bce.m18616s(0, this.f36086d.length), 2);
        int iM32260e = il8VarM18615r.m32260e();
        int iM32261j = il8VarM18615r.m32261j();
        int iM32262n = il8VarM18615r.m32262n();
        if ((iM32262n > 0 && iM32260e <= iM32261j) || (iM32262n < 0 && iM32261j <= iM32260e)) {
            while (!sq8.m48644c(obj, this.f36086d[iM32260e])) {
                if (iM32260e != iM32261j) {
                    iM32260e += iM32262n;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final Object m39791g(Object obj) {
        il8 il8VarM18615r = bce.m18615r(bce.m18616s(0, this.f36086d.length), 2);
        int iM32260e = il8VarM18615r.m32260e();
        int iM32261j = il8VarM18615r.m32261j();
        int iM32262n = il8VarM18615r.m32262n();
        if ((iM32262n <= 0 || iM32260e > iM32261j) && (iM32262n >= 0 || iM32261j > iM32260e)) {
            return null;
        }
        while (!sq8.m48644c(obj, m39804t(iM32260e))) {
            if (iM32260e == iM32261j) {
                return null;
            }
            iM32260e += iM32262n;
        }
        return m39785W(iM32260e);
    }

    /* renamed from: h */
    public final C15449b m39792h(Object obj, Object obj2) {
        il8 il8VarM18615r = bce.m18615r(bce.m18616s(0, this.f36086d.length), 2);
        int iM32260e = il8VarM18615r.m32260e();
        int iM32261j = il8VarM18615r.m32261j();
        int iM32262n = il8VarM18615r.m32262n();
        if ((iM32262n > 0 && iM32260e <= iM32261j) || (iM32262n < 0 && iM32261j <= iM32260e)) {
            while (!sq8.m48644c(obj, m39804t(iM32260e))) {
                if (iM32260e != iM32261j) {
                    iM32260e += iM32262n;
                }
            }
            if (obj2 == m39785W(iM32260e)) {
                return null;
            }
            Object[] objArr = this.f36086d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            sq8.m48648g(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iM32260e + 1] = obj2;
            return new mxh(0, 0, objArrCopyOf).m39787c();
        }
        return new mxh(0, 0, qxh.m45964g(this.f36086d, 0, obj, obj2)).m39786b();
    }

    /* renamed from: i */
    public final mxh m39793i(Object obj) {
        il8 il8VarM18615r = bce.m18615r(bce.m18616s(0, this.f36086d.length), 2);
        int iM32260e = il8VarM18615r.m32260e();
        int iM32261j = il8VarM18615r.m32261j();
        int iM32262n = il8VarM18615r.m32262n();
        if ((iM32262n > 0 && iM32260e <= iM32261j) || (iM32262n < 0 && iM32261j <= iM32260e)) {
            while (!sq8.m48644c(obj, m39804t(iM32260e))) {
                if (iM32260e != iM32261j) {
                    iM32260e += iM32262n;
                }
            }
            return m39794j(iM32260e);
        }
        return this;
    }

    /* renamed from: j */
    public final mxh m39794j(int i) {
        Object[] objArr = this.f36086d;
        if (objArr.length == 2) {
            return null;
        }
        return new mxh(0, 0, qxh.m45965h(objArr, i));
    }

    /* renamed from: k */
    public final boolean m39795k(int i, Object obj, int i2) {
        int iM45963f = 1 << qxh.m45963f(i, i2);
        if (m39801q(iM45963f)) {
            return sq8.m48644c(obj, m39804t(m39798n(iM45963f)));
        }
        if (!m39802r(iM45963f)) {
            return false;
        }
        mxh mxhVarM39776N = m39776N(m39777O(iM45963f));
        return i2 == 30 ? mxhVarM39776N.m39790f(obj) : mxhVarM39776N.m39795k(i, obj, i2 + 5);
    }

    /* renamed from: l */
    public final boolean m39796l(mxh mxhVar) {
        if (this == mxhVar) {
            return true;
        }
        if (this.f36084b != mxhVar.f36084b || this.f36083a != mxhVar.f36083a) {
            return false;
        }
        int length = this.f36086d.length;
        for (int i = 0; i < length; i++) {
            if (this.f36086d[i] != mxhVar.f36086d[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final int m39797m() {
        return Integer.bitCount(this.f36083a);
    }

    /* renamed from: n */
    public final int m39798n(int i) {
        return Integer.bitCount((i - 1) & this.f36083a) * 2;
    }

    /* renamed from: o */
    public final Object m39799o(int i, Object obj, int i2) {
        int iM45963f = 1 << qxh.m45963f(i, i2);
        if (m39801q(iM45963f)) {
            int iM39798n = m39798n(iM45963f);
            if (sq8.m48644c(obj, m39804t(iM39798n))) {
                return m39785W(iM39798n);
            }
            return null;
        }
        if (!m39802r(iM45963f)) {
            return null;
        }
        mxh mxhVarM39776N = m39776N(m39777O(iM45963f));
        return i2 == 30 ? mxhVarM39776N.m39791g(obj) : mxhVarM39776N.m39799o(i, obj, i2 + 5);
    }

    /* renamed from: p */
    public final Object[] m39800p() {
        return this.f36086d;
    }

    /* renamed from: q */
    public final boolean m39801q(int i) {
        return (i & this.f36083a) != 0;
    }

    /* renamed from: r */
    public final boolean m39802r(int i) {
        return (i & this.f36084b) != 0;
    }

    /* renamed from: s */
    public final mxh m39803s(int i, Object obj, Object obj2) {
        return new mxh(i | this.f36083a, this.f36084b, qxh.m45964g(this.f36086d, m39798n(i), obj, obj2));
    }

    /* renamed from: t */
    public final Object m39804t(int i) {
        return this.f36086d[i];
    }

    /* renamed from: u */
    public final mxh m39805u(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, sob sobVar) {
        if (i3 > 30) {
            return new mxh(0, 0, new Object[]{obj, obj2, obj3, obj4}, sobVar);
        }
        int iM45963f = qxh.m45963f(i, i3);
        int iM45963f2 = qxh.m45963f(i2, i3);
        if (iM45963f != iM45963f2) {
            return new mxh((1 << iM45963f) | (1 << iM45963f2), 0, iM45963f < iM45963f2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, sobVar);
        }
        return new mxh(0, 1 << iM45963f, new Object[]{m39805u(i, obj, obj2, i2, obj3, obj4, i3 + 5, sobVar)}, sobVar);
    }

    /* renamed from: v */
    public final mxh m39806v(int i, int i2, int i3, Object obj, Object obj2, int i4) {
        return new mxh(this.f36083a ^ i2, i2 | this.f36084b, m39788d(i, i2, i3, obj, obj2, i4, null));
    }

    /* renamed from: w */
    public final mxh m39807w(Object obj, Object obj2, t4d t4dVar) {
        il8 il8VarM18615r = bce.m18615r(bce.m18616s(0, this.f36086d.length), 2);
        int iM32260e = il8VarM18615r.m32260e();
        int iM32261j = il8VarM18615r.m32261j();
        int iM32262n = il8VarM18615r.m32262n();
        if ((iM32262n > 0 && iM32260e <= iM32261j) || (iM32262n < 0 && iM32261j <= iM32260e)) {
            while (!sq8.m48644c(obj, m39804t(iM32260e))) {
                if (iM32260e != iM32261j) {
                    iM32260e += iM32262n;
                }
            }
            t4dVar.m49289g(m39785W(iM32260e));
            if (this.f36085c == t4dVar.m49287e()) {
                this.f36086d[iM32260e + 1] = obj2;
                return this;
            }
            t4dVar.m49288f(t4dVar.m49285c() + 1);
            Object[] objArr = this.f36086d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            sq8.m48648g(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iM32260e + 1] = obj2;
            return new mxh(0, 0, objArrCopyOf, t4dVar.m49287e());
        }
        t4dVar.m49291k(t4dVar.size() + 1);
        return new mxh(0, 0, qxh.m45964g(this.f36086d, 0, obj, obj2), t4dVar.m49287e());
    }

    /* renamed from: x */
    public final mxh m39808x(mxh mxhVar, yl5 yl5Var, sob sobVar) {
        vj3.m52874a(this.f36084b == 0);
        vj3.m52874a(this.f36083a == 0);
        vj3.m52874a(mxhVar.f36084b == 0);
        vj3.m52874a(mxhVar.f36083a == 0);
        Object[] objArr = this.f36086d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + mxhVar.f36086d.length);
        sq8.m48648g(objArrCopyOf, "copyOf(this, newSize)");
        int length = this.f36086d.length;
        il8 il8VarM18615r = bce.m18615r(bce.m18616s(0, mxhVar.f36086d.length), 2);
        int iM32260e = il8VarM18615r.m32260e();
        int iM32261j = il8VarM18615r.m32261j();
        int iM32262n = il8VarM18615r.m32262n();
        if ((iM32262n > 0 && iM32260e <= iM32261j) || (iM32262n < 0 && iM32261j <= iM32260e)) {
            while (true) {
                if (m39790f(mxhVar.f36086d[iM32260e])) {
                    yl5Var.m57986c(yl5Var.m57984a() + 1);
                } else {
                    Object[] objArr2 = mxhVar.f36086d;
                    objArrCopyOf[length] = objArr2[iM32260e];
                    objArrCopyOf[length + 1] = objArr2[iM32260e + 1];
                    length += 2;
                }
                if (iM32260e == iM32261j) {
                    break;
                }
                iM32260e += iM32262n;
            }
        }
        if (length == this.f36086d.length) {
            return this;
        }
        if (length == mxhVar.f36086d.length) {
            return mxhVar;
        }
        if (length == objArrCopyOf.length) {
            return new mxh(0, 0, objArrCopyOf, sobVar);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        sq8.m48648g(objArrCopyOf2, "copyOf(this, newSize)");
        return new mxh(0, 0, objArrCopyOf2, sobVar);
    }

    /* renamed from: y */
    public final mxh m39809y(Object obj, Object obj2, t4d t4dVar) {
        il8 il8VarM18615r = bce.m18615r(bce.m18616s(0, this.f36086d.length), 2);
        int iM32260e = il8VarM18615r.m32260e();
        int iM32261j = il8VarM18615r.m32261j();
        int iM32262n = il8VarM18615r.m32262n();
        if ((iM32262n > 0 && iM32260e <= iM32261j) || (iM32262n < 0 && iM32261j <= iM32260e)) {
            while (true) {
                if (!sq8.m48644c(obj, m39804t(iM32260e)) || !sq8.m48644c(obj2, m39785W(iM32260e))) {
                    if (iM32260e == iM32261j) {
                        break;
                    }
                    iM32260e += iM32262n;
                } else {
                    return m39763A(iM32260e, t4dVar);
                }
            }
        }
        return this;
    }

    /* renamed from: z */
    public final mxh m39810z(Object obj, t4d t4dVar) {
        il8 il8VarM18615r = bce.m18615r(bce.m18616s(0, this.f36086d.length), 2);
        int iM32260e = il8VarM18615r.m32260e();
        int iM32261j = il8VarM18615r.m32261j();
        int iM32262n = il8VarM18615r.m32262n();
        if ((iM32262n > 0 && iM32260e <= iM32261j) || (iM32262n < 0 && iM32261j <= iM32260e)) {
            while (!sq8.m48644c(obj, m39804t(iM32260e))) {
                if (iM32260e != iM32261j) {
                    iM32260e += iM32262n;
                }
            }
            return m39763A(iM32260e, t4dVar);
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mxh(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
        sq8.m48649h(objArr, "buffer");
    }
}
