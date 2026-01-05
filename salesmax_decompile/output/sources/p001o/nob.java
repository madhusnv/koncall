package p001o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class nob {

    /* renamed from: o.nob$a */
    public static class C15620a extends f8 {

        /* renamed from: g */
        public transient hdg f37104g;

        public C15620a(Map map, hdg hdgVar) {
            super(map);
            this.f37104g = (hdg) dgd.m23062o(hdgVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.f37104g = (hdg) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            m36682C((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f37104g);
            objectOutputStream.writeObject(m36689t());
        }

        @Override // p001o.l8
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public List mo36690u() {
            return (List) this.f37104g.get();
        }

        @Override // p001o.v8
        /* renamed from: e */
        public Map mo40870e() {
            return m36692y();
        }

        @Override // p001o.v8
        /* renamed from: g */
        public Set mo40871g() {
            return m36693z();
        }
    }

    /* renamed from: o.nob$b */
    public static abstract class AbstractC15621b extends AbstractCollection {
        /* renamed from: b */
        public abstract lob mo40872b();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            mo40872b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo40872b().mo37575c(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo40872b().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return mo40872b().size();
        }
    }

    /* renamed from: a */
    public static boolean m40867a(lob lobVar, Object obj) {
        if (obj == lobVar) {
            return true;
        }
        if (obj instanceof lob) {
            return lobVar.mo26264a().equals(((lob) obj).mo26264a());
        }
        return false;
    }

    /* renamed from: b */
    public static zea m40868b(Map map, hdg hdgVar) {
        return new C15620a(map, hdgVar);
    }
}
