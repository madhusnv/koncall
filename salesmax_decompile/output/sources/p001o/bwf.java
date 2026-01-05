package p001o;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class bwf {

    /* renamed from: o.bwf$a */
    public static final class C12517a extends qre implements nl7 {

        /* renamed from: b */
        public Object f16936b;

        /* renamed from: c */
        public Object f16937c;

        /* renamed from: d */
        public int f16938d;

        /* renamed from: e */
        public int f16939e;

        /* renamed from: f */
        public /* synthetic */ Object f16940f;

        /* renamed from: g */
        public final /* synthetic */ int f16941g;

        /* renamed from: h */
        public final /* synthetic */ int f16942h;

        /* renamed from: q */
        public final /* synthetic */ Iterator f16943q;

        /* renamed from: s */
        public final /* synthetic */ boolean f16944s;

        /* renamed from: x */
        public final /* synthetic */ boolean f16945x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12517a(int i, int i2, Iterator it, boolean z, boolean z2, n64 n64Var) {
            super(2, n64Var);
            this.f16941g = i;
            this.f16942h = i2;
            this.f16943q = it;
            this.f16944s = z;
            this.f16945x = z2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12517a c12517a = new C12517a(this.f16941g, this.f16942h, this.f16943q, this.f16944s, this.f16945x, n64Var);
            c12517a.f16940f = obj;
            return c12517a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kef kefVar, n64 n64Var) {
            return ((C12517a) create(kefVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00dc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a6 -> B:16:0x0058). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x011d -> B:59:0x0120). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x014b -> B:72:0x014e). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            due dueVar;
            Iterator it;
            kef kefVar;
            C12517a c12517a;
            kef kefVar2;
            int i;
            ArrayList arrayList;
            Iterator it2;
            int i2;
            C12517a c12517a2;
            due dueVar2;
            kef kefVar3;
            Object objM51918f = uq8.m51918f();
            int i3 = this.f16939e;
            if (i3 == 0) {
                wre.m54934b(obj);
                kef kefVar4 = (kef) this.f16940f;
                int iM18604g = bce.m18604g(this.f16941g, 1024);
                int i4 = this.f16942h - this.f16941g;
                if (i4 < 0) {
                    dueVar = new due(iM18604g);
                    it = this.f16943q;
                    kefVar = kefVar4;
                    c12517a = this;
                    while (it.hasNext()) {
                    }
                    if (c12517a.f16945x) {
                    }
                    return y3i.f54824a;
                }
                kefVar2 = kefVar4;
                i = 0;
                arrayList = new ArrayList(iM18604g);
                it2 = this.f16943q;
                i2 = i4;
                c12517a2 = this;
                while (it2.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                    c12517a2.f16940f = null;
                    c12517a2.f16936b = null;
                    c12517a2.f16937c = null;
                    c12517a2.f16939e = 2;
                    if (kefVar2.mo33661f(arrayList, c12517a2) == objM51918f) {
                    }
                }
                return y3i.f54824a;
            }
            if (i3 == 1) {
                i2 = this.f16938d;
                it2 = (Iterator) this.f16937c;
                arrayList = (ArrayList) this.f16936b;
                kefVar2 = (kef) this.f16940f;
                wre.m54934b(obj);
                c12517a2 = this;
                i = i2;
                if (c12517a2.f16944s) {
                    arrayList = new ArrayList(c12517a2.f16941g);
                } else {
                    arrayList.clear();
                }
                i2 = i;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (i > 0) {
                        i--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == c12517a2.f16941g) {
                            c12517a2.f16940f = kefVar2;
                            c12517a2.f16936b = arrayList;
                            c12517a2.f16937c = it2;
                            c12517a2.f16938d = i2;
                            c12517a2.f16939e = 1;
                            if (kefVar2.mo33661f(arrayList, c12517a2) == objM51918f) {
                                return objM51918f;
                            }
                            i = i2;
                            if (c12517a2.f16944s) {
                            }
                            i2 = i;
                            while (it2.hasNext()) {
                            }
                        }
                    }
                }
                if ((!arrayList.isEmpty()) && (c12517a2.f16945x || arrayList.size() == c12517a2.f16941g)) {
                    c12517a2.f16940f = null;
                    c12517a2.f16936b = null;
                    c12517a2.f16937c = null;
                    c12517a2.f16939e = 2;
                    if (kefVar2.mo33661f(arrayList, c12517a2) == objM51918f) {
                        return objM51918f;
                    }
                }
                return y3i.f54824a;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    it = (Iterator) this.f16937c;
                    dueVar = (due) this.f16936b;
                    kefVar = (kef) this.f16940f;
                    wre.m54934b(obj);
                    c12517a = this;
                    dueVar.m23850A(c12517a.f16942h);
                    while (it.hasNext()) {
                        dueVar.m23851p(it.next());
                        if (dueVar.m23853y()) {
                            int size = dueVar.size();
                            int i5 = c12517a.f16941g;
                            if (size >= i5) {
                                Object arrayList2 = c12517a.f16944s ? dueVar : new ArrayList(dueVar);
                                c12517a.f16940f = kefVar;
                                c12517a.f16936b = dueVar;
                                c12517a.f16937c = it;
                                c12517a.f16939e = 3;
                                if (kefVar.mo33661f(arrayList2, c12517a) == objM51918f) {
                                    return objM51918f;
                                }
                                dueVar.m23850A(c12517a.f16942h);
                                while (it.hasNext()) {
                                }
                            } else {
                                dueVar = dueVar.m23852r(i5);
                            }
                        }
                    }
                    if (c12517a.f16945x) {
                        dueVar2 = dueVar;
                        kefVar3 = kefVar;
                        if (dueVar2.size() <= c12517a.f16942h) {
                        }
                    }
                    return y3i.f54824a;
                }
                if (i3 == 4) {
                    dueVar2 = (due) this.f16936b;
                    kefVar3 = (kef) this.f16940f;
                    wre.m54934b(obj);
                    c12517a = this;
                    dueVar2.m23850A(c12517a.f16942h);
                    if (dueVar2.size() <= c12517a.f16942h) {
                        Object arrayList3 = c12517a.f16944s ? dueVar2 : new ArrayList(dueVar2);
                        c12517a.f16940f = kefVar3;
                        c12517a.f16936b = dueVar2;
                        c12517a.f16937c = null;
                        c12517a.f16939e = 4;
                        if (kefVar3.mo33661f(arrayList3, c12517a) == objM51918f) {
                            return objM51918f;
                        }
                        dueVar2.m23850A(c12517a.f16942h);
                        if (dueVar2.size() <= c12517a.f16942h) {
                            if (!dueVar2.isEmpty()) {
                                c12517a.f16940f = null;
                                c12517a.f16936b = null;
                                c12517a.f16937c = null;
                                c12517a.f16939e = 5;
                                if (kefVar3.mo33661f(dueVar2, c12517a) == objM51918f) {
                                    return objM51918f;
                                }
                            }
                            return y3i.f54824a;
                        }
                    }
                } else if (i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            wre.m54934b(obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: a */
    public static final void m19905a(int i, int i2) {
        String str;
        if (i > 0 && i2 > 0) {
            return;
        }
        if (i != i2) {
            str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
        } else {
            str = "size " + i + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    /* renamed from: b */
    public static final Iterator m19906b(Iterator it, int i, int i2, boolean z, boolean z2) {
        sq8.m48649h(it, "iterator");
        return !it.hasNext() ? j66.f29853a : mef.m38853a(new C12517a(i, i2, it, z2, z, null));
    }
}
