package p001o;

import com.google.android.gms.actions.SearchIntents;

/* loaded from: classes2.dex */
public final class ttf implements oeg {

    /* renamed from: c */
    public static final C17207a f47772c = new C17207a(null);

    /* renamed from: a */
    public final String f47773a;

    /* renamed from: b */
    public final Object[] f47774b;

    /* renamed from: o.ttf$a */
    public static final class C17207a {
        public C17207a() {
        }

        public /* synthetic */ C17207a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final void m50584a(neg negVar, int i, Object obj) {
            if (obj == null) {
                negVar.bindNull(i);
                return;
            }
            if (obj instanceof byte[]) {
                negVar.bindBlob(i, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                negVar.bindDouble(i, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                negVar.bindDouble(i, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                negVar.bindLong(i, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                negVar.bindLong(i, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                negVar.bindLong(i, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                negVar.bindLong(i, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                negVar.bindString(i, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                negVar.bindLong(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        /* renamed from: b */
        public final void m50585b(neg negVar, Object[] objArr) {
            sq8.m48649h(negVar, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                m50584a(negVar, i, obj);
            }
        }
    }

    public ttf(String str, Object[] objArr) {
        sq8.m48649h(str, SearchIntents.EXTRA_QUERY);
        this.f47773a = str;
        this.f47774b = objArr;
    }

    @Override // p001o.oeg
    public void bindTo(neg negVar) {
        sq8.m48649h(negVar, "statement");
        f47772c.m50585b(negVar, this.f47774b);
    }

    @Override // p001o.oeg
    public int getArgCount() {
        Object[] objArr = this.f47774b;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // p001o.oeg
    public String getSql() {
        return this.f47773a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ttf(String str) {
        this(str, null);
        sq8.m48649h(str, SearchIntents.EXTRA_QUERY);
    }
}
