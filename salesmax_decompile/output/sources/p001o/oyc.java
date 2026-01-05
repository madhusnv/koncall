package p001o;

import p001o.vre;

/* loaded from: classes3.dex */
public abstract class oyc {

    /* renamed from: o.oyc$a */
    public /* synthetic */ class C15912a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39056a;

        static {
            int[] iArr = new int[vmh.values().length];
            try {
                iArr[vmh.ISO_8601_CONDENSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vmh.ISO_8601_CONDENSED_DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vmh.ISO_8601_FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vmh.ISO_8601.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vmh.RFC_5322.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[vmh.EPOCH_SECONDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f39056a = iArr;
        }
    }

    /* renamed from: a */
    public static final Object m42769a(Object obj) {
        if (vre.m53357h(obj)) {
            try {
                return vre.m53351b(Boolean.valueOf(Boolean.parseBoolean((String) obj)));
            } catch (Throwable th) {
                vre.C17665a c17665a = vre.f50797b;
                obj = wre.m54933a(th);
            }
        }
        return vre.m53351b(obj);
    }

    /* renamed from: b */
    public static final Object m42770b(Object obj) {
        if (vre.m53357h(obj)) {
            try {
                return vre.m53351b(Integer.valueOf(Integer.parseInt((String) obj)));
            } catch (Throwable th) {
                vre.C17665a c17665a = vre.f50797b;
                obj = wre.m54933a(th);
            }
        }
        return vre.m53351b(obj);
    }

    /* renamed from: c */
    public static final Object m42771c(Object obj) {
        if (vre.m53357h(obj)) {
            try {
                return vre.m53351b(Long.valueOf(Long.parseLong((String) obj)));
            } catch (Throwable th) {
                vre.C17665a c17665a = vre.f50797b;
                obj = wre.m54933a(th);
            }
        }
        return vre.m53351b(obj);
    }

    /* renamed from: d */
    public static final Object m42772d(Object obj, vmh vmhVar) {
        sq8.m48649h(vmhVar, "fmt");
        if (vre.m53357h(obj)) {
            try {
                return vre.m53351b(m42773e((String) obj, vmhVar));
            } catch (Throwable th) {
                vre.C17665a c17665a = vre.f50797b;
                obj = wre.m54933a(th);
            }
        }
        return vre.m53351b(obj);
    }

    /* renamed from: e */
    public static final gk8 m42773e(String str, vmh vmhVar) {
        switch (C15912a.f39056a[vmhVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return gk8.f25374b.m28960d(str);
            case 5:
                return gk8.f25374b.m28961e(str);
            case 6:
                return gk8.f25374b.m28959b(str);
            default:
                throw new szb();
        }
    }
}
