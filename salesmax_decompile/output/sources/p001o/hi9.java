package p001o;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.function.Supplier;

/* loaded from: classes6.dex */
public final class hi9 implements uri, Supplier, Serializable {

    /* renamed from: a */
    public volatile transient Supplier f27022a;

    /* renamed from: b */
    public Object f27023b;

    public hi9(Supplier supplier) {
        this.f27022a = supplier;
    }

    /* renamed from: e */
    public static hi9 m30634e(Supplier supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return supplier instanceof hi9 ? (hi9) supplier : new hi9(supplier);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        get();
        objectOutputStream.defaultWriteObject();
    }

    public String P0() {
        return "Lazy";
    }

    /* renamed from: b */
    public final synchronized Object m30635b() {
        Supplier supplier = this.f27022a;
        if (supplier != null) {
            this.f27023b = supplier.get();
            this.f27022a = null;
        }
        return this.f27023b;
    }

    /* renamed from: d */
    public boolean m30636d() {
        return this.f27022a == null;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof hi9) && Objects.equals(((hi9) obj).get(), get()));
    }

    @Override // p001o.uri
    public Object get() {
        return this.f27022a == null ? this.f27023b : m30635b();
    }

    public int hashCode() {
        return Objects.hashCode(get());
    }

    @Override // p001o.uri
    public boolean isEmpty() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(P0());
        sb.append("(");
        sb.append(!m30636d() ? "?" : this.f27023b);
        sb.append(")");
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public b69 iterator() {
        return b69.of(get());
    }
}
