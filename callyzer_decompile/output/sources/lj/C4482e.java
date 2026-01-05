package lj;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;
import jj.InterfaceC3780e;
import jj.InterfaceC3781f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lj.e */
/* loaded from: classes.dex */
public final class C4482e implements InterfaceC3779d, InterfaceC3781f {

    /* renamed from: a */
    public final boolean f22313a = true;

    /* renamed from: b */
    public final JsonWriter f22314b;

    /* renamed from: c */
    public final Map f22315c;

    /* renamed from: d */
    public final Map f22316d;

    /* renamed from: e */
    public final InterfaceC3778c f22317e;

    /* renamed from: f */
    public final boolean f22318f;

    public C4482e(Writer writer, Map map, Map map2, InterfaceC3778c interfaceC3778c, boolean z6) {
        this.f22314b = new JsonWriter(writer);
        this.f22315c = map;
        this.f22316d = map2;
        this.f22317e = interfaceC3778c;
        this.f22318f = z6;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: a */
    public final InterfaceC3779d mo8302a(C3777b c3777b, Object obj) throws IOException {
        m9331h(obj, c3777b.f19684a);
        return this;
    }

    @Override // jj.InterfaceC3781f
    public final InterfaceC3781f add(String str) throws IOException {
        m9332i();
        this.f22314b.value(str);
        return this;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: b */
    public final InterfaceC3779d mo8303b(C3777b c3777b, boolean z6) throws IOException {
        String str = c3777b.f19684a;
        m9332i();
        JsonWriter jsonWriter = this.f22314b;
        jsonWriter.name(str);
        m9332i();
        jsonWriter.value(z6);
        return this;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: c */
    public final InterfaceC3779d mo8304c(C3777b c3777b, double d2) throws IOException {
        String str = c3777b.f19684a;
        m9332i();
        JsonWriter jsonWriter = this.f22314b;
        jsonWriter.name(str);
        m9332i();
        jsonWriter.value(d2);
        return this;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: d */
    public final InterfaceC3779d mo8305d(C3777b c3777b, long j6) throws IOException {
        String str = c3777b.f19684a;
        m9332i();
        JsonWriter jsonWriter = this.f22314b;
        jsonWriter.name(str);
        m9332i();
        jsonWriter.value(j6);
        return this;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: e */
    public final InterfaceC3779d mo8306e(C3777b c3777b, int i10) throws IOException {
        String str = c3777b.f19684a;
        m9332i();
        JsonWriter jsonWriter = this.f22314b;
        jsonWriter.name(str);
        m9332i();
        jsonWriter.value(i10);
        return this;
    }

    @Override // jj.InterfaceC3781f
    /* renamed from: f */
    public final InterfaceC3781f mo8307f(boolean z6) throws IOException {
        m9332i();
        this.f22314b.value(z6);
        return this;
    }

    /* renamed from: g */
    public final C4482e m9330g(Object obj) {
        JsonWriter jsonWriter = this.f22314b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m9330g(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m9331h(entry.getValue(), (String) key);
                    } catch (ClassCastException e2) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC3778c interfaceC3778c = (InterfaceC3778c) this.f22315c.get(obj.getClass());
            if (interfaceC3778c != null) {
                jsonWriter.beginObject();
                interfaceC3778c.mo5788a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC3780e interfaceC3780e = (InterfaceC3780e) this.f22316d.get(obj.getClass());
            if (interfaceC3780e != null) {
                interfaceC3780e.mo5788a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f22317e.mo5788a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof InterfaceC4483f) {
                int number = ((InterfaceC4483f) obj).getNumber();
                m9332i();
                jsonWriter.value(number);
                return this;
            }
            String strName = ((Enum) obj).name();
            m9332i();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            m9332i();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i10 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                jsonWriter.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j6 = jArr[i10];
                m9332i();
                jsonWriter.value(j6);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                jsonWriter.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                jsonWriter.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i10 < length5) {
                m9330g(numberArr[i10]);
                i10++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i10 < length6) {
                m9330g(objArr[i10]);
                i10++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    /* renamed from: h */
    public final C4482e m9331h(Object obj, String str) throws IOException {
        boolean z6 = this.f22318f;
        JsonWriter jsonWriter = this.f22314b;
        if (z6) {
            if (obj == null) {
                return this;
            }
            m9332i();
            jsonWriter.name(str);
            m9330g(obj);
            return this;
        }
        m9332i();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        m9330g(obj);
        return this;
    }

    /* renamed from: i */
    public final void m9332i() {
        if (!this.f22313a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
