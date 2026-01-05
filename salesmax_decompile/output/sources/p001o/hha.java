package p001o;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.cs1;
import p001o.vr1;

/* loaded from: classes3.dex */
public class hha extends AbstractMap implements ConcurrentMap {
    public static final Logger k0 = Logger.getLogger(hha.class.getName());
    public static final b0 l0 = new C13948d();
    public static final Queue m0 = new C13949e();

    /* renamed from: H */
    public final long f26874H;

    /* renamed from: L */
    public final Queue f26875L;

    /* renamed from: M */
    public final nie f26876M;

    /* renamed from: Q */
    public final rlh f26877Q;

    /* renamed from: X */
    public final EnumC13952h f26878X;

    /* renamed from: Y */
    public final z6 f26879Y;

    /* renamed from: Z */
    public final cs1 f26880Z;

    /* renamed from: a */
    public final int f26881a;

    /* renamed from: b */
    public final int f26882b;

    /* renamed from: c */
    public final C13963s[] f26883c;

    /* renamed from: d */
    public final int f26884d;

    /* renamed from: e */
    public final ej6 f26885e;

    /* renamed from: f */
    public final ej6 f26886f;

    /* renamed from: g */
    public final EnumC13965u f26887g;

    /* renamed from: h */
    public final EnumC13965u f26888h;
    public Set h0;
    public Collection i0;
    public Set j0;

    /* renamed from: q */
    public final long f26889q;

    /* renamed from: s */
    public final f7j f26890s;

    /* renamed from: x */
    public final long f26891x;

    /* renamed from: y */
    public final long f26892y;

    /* renamed from: o.hha$a */
    public static final class C13945a extends AbstractQueue {

        /* renamed from: a */
        public final ige f26893a = new b(this);

        /* renamed from: o.hha$a$a */
        public class a extends n9 {
            public a(ige igeVar) {
                super(igeVar);
            }

            @Override // p001o.n9
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ige mo30506a(ige igeVar) {
                ige nextInAccessQueue = igeVar.getNextInAccessQueue();
                if (nextInAccessQueue == C13945a.this.f26893a) {
                    return null;
                }
                return nextInAccessQueue;
            }
        }

        /* renamed from: o.hha$a$b */
        public class b extends AbstractC13951g {

            /* renamed from: a */
            public ige f26895a = this;

            /* renamed from: b */
            public ige f26896b = this;

            public b(C13945a c13945a) {
            }

            @Override // p001o.hha.AbstractC13951g, p001o.ige
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // p001o.hha.AbstractC13951g, p001o.ige
            public ige getNextInAccessQueue() {
                return this.f26895a;
            }

            @Override // p001o.hha.AbstractC13951g, p001o.ige
            public ige getPreviousInAccessQueue() {
                return this.f26896b;
            }

            @Override // p001o.hha.AbstractC13951g, p001o.ige
            public void setAccessTime(long j) {
            }

            @Override // p001o.hha.AbstractC13951g, p001o.ige
            public void setNextInAccessQueue(ige igeVar) {
                this.f26895a = igeVar;
            }

            @Override // p001o.hha.AbstractC13951g, p001o.ige
            public void setPreviousInAccessQueue(ige igeVar) {
                this.f26896b = igeVar;
            }
        }

        @Override // java.util.Queue
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean offer(ige igeVar) {
            hha.m30472c(igeVar.getPreviousInAccessQueue(), igeVar.getNextInAccessQueue());
            hha.m30472c(this.f26893a.getPreviousInAccessQueue(), igeVar);
            hha.m30472c(igeVar, this.f26893a);
            return true;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ige nextInAccessQueue = this.f26893a.getNextInAccessQueue();
            while (true) {
                ige igeVar = this.f26893a;
                if (nextInAccessQueue == igeVar) {
                    igeVar.setNextInAccessQueue(igeVar);
                    ige igeVar2 = this.f26893a;
                    igeVar2.setPreviousInAccessQueue(igeVar2);
                    return;
                } else {
                    ige nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    hha.m30466B(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((ige) obj).getNextInAccessQueue() != EnumC13962r.INSTANCE;
        }

        @Override // java.util.Queue
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public ige peek() {
            ige nextInAccessQueue = this.f26893a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f26893a) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.Queue
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ige poll() {
            ige nextInAccessQueue = this.f26893a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f26893a) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f26893a.getNextInAccessQueue() == this.f26893a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            ige igeVar = (ige) obj;
            ige previousInAccessQueue = igeVar.getPreviousInAccessQueue();
            ige nextInAccessQueue = igeVar.getNextInAccessQueue();
            hha.m30472c(previousInAccessQueue, nextInAccessQueue);
            hha.m30466B(igeVar);
            return nextInAccessQueue != EnumC13962r.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (ige nextInAccessQueue = this.f26893a.getNextInAccessQueue(); nextInAccessQueue != this.f26893a; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i++;
            }
            return i;
        }
    }

    public final class a0 extends AbstractC13955k {
        public a0(hha hhaVar) {
            super();
        }

        @Override // java.util.Iterator
        public Object next() {
            return m30525e().getValue();
        }
    }

    /* renamed from: o.hha$b */
    public static class C13946b implements rr1, Serializable {

        /* renamed from: a */
        public final hha f26897a;

        /* renamed from: o.hha$b$a */
        public class a extends cs1 {

            /* renamed from: a */
            public final /* synthetic */ Callable f26898a;

            public a(C13946b c13946b, Callable callable) {
                this.f26898a = callable;
            }

            @Override // p001o.cs1
            /* renamed from: a */
            public Object mo21693a(Object obj) {
                return this.f26898a.call();
            }
        }

        public /* synthetic */ C13946b(hha hhaVar, C13948d c13948d) {
            this(hhaVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use ManualSerializationProxy");
        }

        @Override // p001o.rr1
        /* renamed from: a */
        public ConcurrentMap mo21258a() {
            return this.f26897a;
        }

        @Override // p001o.rr1
        /* renamed from: c */
        public Object mo30508c(Object obj, Callable callable) {
            dgd.m23062o(callable);
            return this.f26897a.m30495o(obj, new a(this, callable));
        }

        @Override // p001o.rr1
        /* renamed from: d */
        public void mo30509d(Object obj) {
            dgd.m23062o(obj);
            this.f26897a.remove(obj);
        }

        @Override // p001o.rr1
        /* renamed from: f */
        public void mo30510f() {
            this.f26897a.clear();
        }

        @Override // p001o.rr1
        /* renamed from: g */
        public Object mo30511g(Object obj) {
            return this.f26897a.m30496r(obj);
        }

        @Override // p001o.rr1
        public void put(Object obj, Object obj2) {
            this.f26897a.put(obj, obj2);
        }

        Object writeReplace() {
            return new C13961q(this.f26897a);
        }

        public C13946b(vr1 vr1Var) {
            this(new hha(vr1Var, null));
        }

        public C13946b(hha hhaVar) {
            this.f26897a = hhaVar;
        }
    }

    public interface b0 {
        /* renamed from: a */
        boolean mo30512a();

        /* renamed from: b */
        boolean mo30513b();

        /* renamed from: c */
        void mo30514c(Object obj);

        /* renamed from: d */
        b0 mo30515d(ReferenceQueue referenceQueue, Object obj, ige igeVar);

        /* renamed from: e */
        ige mo30516e();

        /* renamed from: f */
        Object mo30517f();

        Object get();

        int getWeight();
    }

    /* renamed from: o.hha$c */
    public static final class C13947c extends AbstractQueue {

        /* renamed from: a */
        public final ige f26899a = new b(this);

        /* renamed from: o.hha$c$a */
        public class a extends n9 {
            public a(ige igeVar) {
                super(igeVar);
            }

            @Override // p001o.n9
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ige mo30506a(ige igeVar) {
                ige nextInWriteQueue = igeVar.getNextInWriteQueue();
                if (nextInWriteQueue == C13947c.this.f26899a) {
                    return null;
                }
                return nextInWriteQueue;
            }
        }

        /* renamed from: o.hha$c$b */
        public class b extends AbstractC13951g {

            /* renamed from: a */
            public ige f26901a = this;

            /* renamed from: b */
            public ige f26902b = this;

            public b(C13947c c13947c) {
            }

            @Override // p001o.hha.AbstractC13951g, p001o.ige
            public ige getNextInWriteQueue() {
                return this.f26901a;
            }

            @Override // p001o.hha.AbstractC13951g, p001o.ige
            public ige getPreviousInWriteQueue() {
                return this.f26902b;
            }

            @Override // p001o.hha.AbstractC13951g, p001o.ige
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // p001o.hha.AbstractC13951g, p001o.ige
            public void setNextInWriteQueue(ige igeVar) {
                this.f26901a = igeVar;
            }

            @Override // p001o.hha.AbstractC13951g, p001o.ige
            public void setPreviousInWriteQueue(ige igeVar) {
                this.f26902b = igeVar;
            }

            @Override // p001o.hha.AbstractC13951g, p001o.ige
            public void setWriteTime(long j) {
            }
        }

        @Override // java.util.Queue
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean offer(ige igeVar) {
            hha.m30473d(igeVar.getPreviousInWriteQueue(), igeVar.getNextInWriteQueue());
            hha.m30473d(this.f26899a.getPreviousInWriteQueue(), igeVar);
            hha.m30473d(igeVar, this.f26899a);
            return true;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ige nextInWriteQueue = this.f26899a.getNextInWriteQueue();
            while (true) {
                ige igeVar = this.f26899a;
                if (nextInWriteQueue == igeVar) {
                    igeVar.setNextInWriteQueue(igeVar);
                    ige igeVar2 = this.f26899a;
                    igeVar2.setPreviousInWriteQueue(igeVar2);
                    return;
                } else {
                    ige nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    hha.m30467C(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((ige) obj).getNextInWriteQueue() != EnumC13962r.INSTANCE;
        }

        @Override // java.util.Queue
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public ige peek() {
            ige nextInWriteQueue = this.f26899a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f26899a) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.Queue
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ige poll() {
            ige nextInWriteQueue = this.f26899a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f26899a) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f26899a.getNextInWriteQueue() == this.f26899a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            ige igeVar = (ige) obj;
            ige previousInWriteQueue = igeVar.getPreviousInWriteQueue();
            ige nextInWriteQueue = igeVar.getNextInWriteQueue();
            hha.m30473d(previousInWriteQueue, nextInWriteQueue);
            hha.m30467C(igeVar);
            return nextInWriteQueue != EnumC13962r.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (ige nextInWriteQueue = this.f26899a.getNextInWriteQueue(); nextInWriteQueue != this.f26899a; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i++;
            }
            return i;
        }
    }

    public final class c0 extends AbstractCollection {
        public c0() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            hha.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return hha.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return hha.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a0(hha.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return hha.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return hha.m30469O(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return hha.m30469O(this).toArray(objArr);
        }
    }

    /* renamed from: o.hha$d */
    public class C13948d implements b0 {
        @Override // o.hha.b0
        /* renamed from: a */
        public boolean mo30512a() {
            return false;
        }

        @Override // o.hha.b0
        /* renamed from: b */
        public boolean mo30513b() {
            return false;
        }

        @Override // o.hha.b0
        /* renamed from: c */
        public void mo30514c(Object obj) {
        }

        @Override // o.hha.b0
        /* renamed from: d */
        public b0 mo30515d(ReferenceQueue referenceQueue, Object obj, ige igeVar) {
            return this;
        }

        @Override // o.hha.b0
        /* renamed from: e */
        public ige mo30516e() {
            return null;
        }

        @Override // o.hha.b0
        /* renamed from: f */
        public Object mo30517f() {
            return null;
        }

        @Override // o.hha.b0
        public Object get() {
            return null;
        }

        @Override // o.hha.b0
        public int getWeight() {
            return 0;
        }
    }

    public static final class d0 extends f0 {

        /* renamed from: d */
        public volatile long f26904d;

        /* renamed from: e */
        public ige f26905e;

        /* renamed from: f */
        public ige f26906f;

        public d0(ReferenceQueue referenceQueue, Object obj, int i, ige igeVar) {
            super(referenceQueue, obj, i, igeVar);
            this.f26904d = Long.MAX_VALUE;
            this.f26905e = hha.m30465A();
            this.f26906f = hha.m30465A();
        }

        @Override // o.hha.f0, p001o.ige
        public long getAccessTime() {
            return this.f26904d;
        }

        @Override // o.hha.f0, p001o.ige
        public ige getNextInAccessQueue() {
            return this.f26905e;
        }

        @Override // o.hha.f0, p001o.ige
        public ige getPreviousInAccessQueue() {
            return this.f26906f;
        }

        @Override // o.hha.f0, p001o.ige
        public void setAccessTime(long j) {
            this.f26904d = j;
        }

        @Override // o.hha.f0, p001o.ige
        public void setNextInAccessQueue(ige igeVar) {
            this.f26905e = igeVar;
        }

        @Override // o.hha.f0, p001o.ige
        public void setPreviousInAccessQueue(ige igeVar) {
            this.f26906f = igeVar;
        }
    }

    /* renamed from: o.hha$e */
    public class C13949e extends AbstractQueue {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return pf8.m43571B().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    }

    public static final class e0 extends f0 {

        /* renamed from: d */
        public volatile long f26907d;

        /* renamed from: e */
        public ige f26908e;

        /* renamed from: f */
        public ige f26909f;

        /* renamed from: g */
        public volatile long f26910g;

        /* renamed from: h */
        public ige f26911h;

        /* renamed from: q */
        public ige f26912q;

        public e0(ReferenceQueue referenceQueue, Object obj, int i, ige igeVar) {
            super(referenceQueue, obj, i, igeVar);
            this.f26907d = Long.MAX_VALUE;
            this.f26908e = hha.m30465A();
            this.f26909f = hha.m30465A();
            this.f26910g = Long.MAX_VALUE;
            this.f26911h = hha.m30465A();
            this.f26912q = hha.m30465A();
        }

        @Override // o.hha.f0, p001o.ige
        public long getAccessTime() {
            return this.f26907d;
        }

        @Override // o.hha.f0, p001o.ige
        public ige getNextInAccessQueue() {
            return this.f26908e;
        }

        @Override // o.hha.f0, p001o.ige
        public ige getNextInWriteQueue() {
            return this.f26911h;
        }

        @Override // o.hha.f0, p001o.ige
        public ige getPreviousInAccessQueue() {
            return this.f26909f;
        }

        @Override // o.hha.f0, p001o.ige
        public ige getPreviousInWriteQueue() {
            return this.f26912q;
        }

        @Override // o.hha.f0, p001o.ige
        public long getWriteTime() {
            return this.f26910g;
        }

        @Override // o.hha.f0, p001o.ige
        public void setAccessTime(long j) {
            this.f26907d = j;
        }

        @Override // o.hha.f0, p001o.ige
        public void setNextInAccessQueue(ige igeVar) {
            this.f26908e = igeVar;
        }

        @Override // o.hha.f0, p001o.ige
        public void setNextInWriteQueue(ige igeVar) {
            this.f26911h = igeVar;
        }

        @Override // o.hha.f0, p001o.ige
        public void setPreviousInAccessQueue(ige igeVar) {
            this.f26909f = igeVar;
        }

        @Override // o.hha.f0, p001o.ige
        public void setPreviousInWriteQueue(ige igeVar) {
            this.f26912q = igeVar;
        }

        @Override // o.hha.f0, p001o.ige
        public void setWriteTime(long j) {
            this.f26910g = j;
        }
    }

    /* renamed from: o.hha$f */
    public abstract class AbstractC13950f extends AbstractSet {
        public AbstractC13950f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            hha.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return hha.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return hha.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return hha.m30469O(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray(Object[] objArr) {
            return hha.m30469O(this).toArray(objArr);
        }
    }

    public static class f0 extends WeakReference implements ige {

        /* renamed from: a */
        public final int f26914a;

        /* renamed from: b */
        public final ige f26915b;

        /* renamed from: c */
        public volatile b0 f26916c;

        public f0(ReferenceQueue referenceQueue, Object obj, int i, ige igeVar) {
            super(obj, referenceQueue);
            this.f26916c = hha.m30470P();
            this.f26914a = i;
            this.f26915b = igeVar;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public int getHash() {
            return this.f26914a;
        }

        @Override // p001o.ige
        public Object getKey() {
            return get();
        }

        @Override // p001o.ige
        public ige getNext() {
            return this.f26915b;
        }

        public ige getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public ige getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public ige getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public ige getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public b0 getValueReference() {
            return this.f26916c;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(ige igeVar) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(ige igeVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(ige igeVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(ige igeVar) {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public void setValueReference(b0 b0Var) {
            this.f26916c = b0Var;
        }

        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.hha$g */
    public static abstract class AbstractC13951g implements ige {
        @Override // p001o.ige
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public Object getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public ige getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public ige getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public ige getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public ige getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public ige getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public b0 getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public void setNextInAccessQueue(ige igeVar) {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public void setNextInWriteQueue(ige igeVar) {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public void setPreviousInAccessQueue(ige igeVar) {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public void setPreviousInWriteQueue(ige igeVar) {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public void setValueReference(b0 b0Var) {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.ige
        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    public static class g0 extends WeakReference implements b0 {

        /* renamed from: a */
        public final ige f26917a;

        public g0(ReferenceQueue referenceQueue, Object obj, ige igeVar) {
            super(obj, referenceQueue);
            this.f26917a = igeVar;
        }

        @Override // o.hha.b0
        /* renamed from: a */
        public boolean mo30512a() {
            return true;
        }

        @Override // o.hha.b0
        /* renamed from: b */
        public boolean mo30513b() {
            return false;
        }

        @Override // o.hha.b0
        /* renamed from: c */
        public void mo30514c(Object obj) {
        }

        @Override // o.hha.b0
        /* renamed from: d */
        public b0 mo30515d(ReferenceQueue referenceQueue, Object obj, ige igeVar) {
            return new g0(referenceQueue, obj, igeVar);
        }

        @Override // o.hha.b0
        /* renamed from: e */
        public ige mo30516e() {
            return this.f26917a;
        }

        @Override // o.hha.b0
        /* renamed from: f */
        public Object mo30517f() {
            return get();
        }

        @Override // o.hha.b0
        public int getWeight() {
            return 1;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.hha$h */
    public static abstract class EnumC13952h {
        private static final /* synthetic */ EnumC13952h[] $VALUES;
        static final int ACCESS_MASK = 1;
        public static final EnumC13952h STRONG;
        public static final EnumC13952h STRONG_ACCESS;
        public static final EnumC13952h STRONG_ACCESS_WRITE;
        public static final EnumC13952h STRONG_WRITE;
        public static final EnumC13952h WEAK;
        public static final EnumC13952h WEAK_ACCESS;
        public static final EnumC13952h WEAK_ACCESS_WRITE;
        static final int WEAK_MASK = 4;
        public static final EnumC13952h WEAK_WRITE;
        static final int WRITE_MASK = 2;
        static final EnumC13952h[] factories;

        /* renamed from: o.hha$h$a */
        public enum a extends EnumC13952h {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // p001o.hha.EnumC13952h
            public <K, V> ige newEntry(C13963s c13963s, K k, int i, ige igeVar) {
                return new C13968x(k, i, igeVar);
            }
        }

        /* renamed from: o.hha$h$b */
        public enum b extends EnumC13952h {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // p001o.hha.EnumC13952h
            public <K, V> ige copyEntry(C13963s c13963s, ige igeVar, ige igeVar2, K k) {
                ige igeVarCopyEntry = super.copyEntry(c13963s, igeVar, igeVar2, k);
                copyAccessEntry(igeVar, igeVarCopyEntry);
                return igeVarCopyEntry;
            }

            @Override // p001o.hha.EnumC13952h
            public <K, V> ige newEntry(C13963s c13963s, K k, int i, ige igeVar) {
                return new C13966v(k, i, igeVar);
            }
        }

        /* renamed from: o.hha$h$c */
        public enum c extends EnumC13952h {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // p001o.hha.EnumC13952h
            public <K, V> ige copyEntry(C13963s c13963s, ige igeVar, ige igeVar2, K k) {
                ige igeVarCopyEntry = super.copyEntry(c13963s, igeVar, igeVar2, k);
                copyWriteEntry(igeVar, igeVarCopyEntry);
                return igeVarCopyEntry;
            }

            @Override // p001o.hha.EnumC13952h
            public <K, V> ige newEntry(C13963s c13963s, K k, int i, ige igeVar) {
                return new C13970z(k, i, igeVar);
            }
        }

        /* renamed from: o.hha$h$d */
        public enum d extends EnumC13952h {
            public d(String str, int i) {
                super(str, i, null);
            }

            @Override // p001o.hha.EnumC13952h
            public <K, V> ige copyEntry(C13963s c13963s, ige igeVar, ige igeVar2, K k) {
                ige igeVarCopyEntry = super.copyEntry(c13963s, igeVar, igeVar2, k);
                copyAccessEntry(igeVar, igeVarCopyEntry);
                copyWriteEntry(igeVar, igeVarCopyEntry);
                return igeVarCopyEntry;
            }

            @Override // p001o.hha.EnumC13952h
            public <K, V> ige newEntry(C13963s c13963s, K k, int i, ige igeVar) {
                return new C13967w(k, i, igeVar);
            }
        }

        /* renamed from: o.hha$h$e */
        public enum e extends EnumC13952h {
            public e(String str, int i) {
                super(str, i, null);
            }

            @Override // p001o.hha.EnumC13952h
            public <K, V> ige newEntry(C13963s c13963s, K k, int i, ige igeVar) {
                return new f0(c13963s.f26964h, k, i, igeVar);
            }
        }

        /* renamed from: o.hha$h$f */
        public enum f extends EnumC13952h {
            public f(String str, int i) {
                super(str, i, null);
            }

            @Override // p001o.hha.EnumC13952h
            public <K, V> ige copyEntry(C13963s c13963s, ige igeVar, ige igeVar2, K k) {
                ige igeVarCopyEntry = super.copyEntry(c13963s, igeVar, igeVar2, k);
                copyAccessEntry(igeVar, igeVarCopyEntry);
                return igeVarCopyEntry;
            }

            @Override // p001o.hha.EnumC13952h
            public <K, V> ige newEntry(C13963s c13963s, K k, int i, ige igeVar) {
                return new d0(c13963s.f26964h, k, i, igeVar);
            }
        }

        /* renamed from: o.hha$h$g */
        public enum g extends EnumC13952h {
            public g(String str, int i) {
                super(str, i, null);
            }

            @Override // p001o.hha.EnumC13952h
            public <K, V> ige copyEntry(C13963s c13963s, ige igeVar, ige igeVar2, K k) {
                ige igeVarCopyEntry = super.copyEntry(c13963s, igeVar, igeVar2, k);
                copyWriteEntry(igeVar, igeVarCopyEntry);
                return igeVarCopyEntry;
            }

            @Override // p001o.hha.EnumC13952h
            public <K, V> ige newEntry(C13963s c13963s, K k, int i, ige igeVar) {
                return new h0(c13963s.f26964h, k, i, igeVar);
            }
        }

        /* renamed from: o.hha$h$h */
        public enum h extends EnumC13952h {
            public h(String str, int i) {
                super(str, i, null);
            }

            @Override // p001o.hha.EnumC13952h
            public <K, V> ige copyEntry(C13963s c13963s, ige igeVar, ige igeVar2, K k) {
                ige igeVarCopyEntry = super.copyEntry(c13963s, igeVar, igeVar2, k);
                copyAccessEntry(igeVar, igeVarCopyEntry);
                copyWriteEntry(igeVar, igeVarCopyEntry);
                return igeVarCopyEntry;
            }

            @Override // p001o.hha.EnumC13952h
            public <K, V> ige newEntry(C13963s c13963s, K k, int i, ige igeVar) {
                return new e0(c13963s.f26964h, k, i, igeVar);
            }
        }

        private static /* synthetic */ EnumC13952h[] $values() {
            return new EnumC13952h[]{STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE};
        }

        static {
            a aVar = new a("STRONG", 0);
            STRONG = aVar;
            b bVar = new b("STRONG_ACCESS", 1);
            STRONG_ACCESS = bVar;
            c cVar = new c("STRONG_WRITE", 2);
            STRONG_WRITE = cVar;
            d dVar = new d("STRONG_ACCESS_WRITE", 3);
            STRONG_ACCESS_WRITE = dVar;
            e eVar = new e("WEAK", 4);
            WEAK = eVar;
            f fVar = new f("WEAK_ACCESS", 5);
            WEAK_ACCESS = fVar;
            g gVar = new g("WEAK_WRITE", 6);
            WEAK_WRITE = gVar;
            h hVar = new h("WEAK_ACCESS_WRITE", 7);
            WEAK_ACCESS_WRITE = hVar;
            $VALUES = $values();
            factories = new EnumC13952h[]{aVar, bVar, cVar, dVar, eVar, fVar, gVar, hVar};
        }

        private EnumC13952h(String str, int i) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static EnumC13952h getFactory(EnumC13965u enumC13965u, boolean z, boolean z2) {
            return factories[(enumC13965u == EnumC13965u.WEAK ? (char) 4 : (char) 0) | (z ? 1 : 0) | (z2 ? 2 : 0)];
        }

        public static EnumC13952h valueOf(String str) {
            return (EnumC13952h) Enum.valueOf(EnumC13952h.class, str);
        }

        public static EnumC13952h[] values() {
            return (EnumC13952h[]) $VALUES.clone();
        }

        public <K, V> void copyAccessEntry(ige igeVar, ige igeVar2) {
            igeVar2.setAccessTime(igeVar.getAccessTime());
            hha.m30472c(igeVar.getPreviousInAccessQueue(), igeVar2);
            hha.m30472c(igeVar2, igeVar.getNextInAccessQueue());
            hha.m30466B(igeVar);
        }

        public <K, V> ige copyEntry(C13963s c13963s, ige igeVar, ige igeVar2, K k) {
            return newEntry(c13963s, k, igeVar.getHash(), igeVar2);
        }

        public <K, V> void copyWriteEntry(ige igeVar, ige igeVar2) {
            igeVar2.setWriteTime(igeVar.getWriteTime());
            hha.m30473d(igeVar.getPreviousInWriteQueue(), igeVar2);
            hha.m30473d(igeVar2, igeVar.getNextInWriteQueue());
            hha.m30467C(igeVar);
        }

        public abstract <K, V> ige newEntry(C13963s c13963s, K k, int i, ige igeVar);

        public /* synthetic */ EnumC13952h(String str, int i, C13948d c13948d) {
            this(str, i);
        }
    }

    public static final class h0 extends f0 {

        /* renamed from: d */
        public volatile long f26918d;

        /* renamed from: e */
        public ige f26919e;

        /* renamed from: f */
        public ige f26920f;

        public h0(ReferenceQueue referenceQueue, Object obj, int i, ige igeVar) {
            super(referenceQueue, obj, i, igeVar);
            this.f26918d = Long.MAX_VALUE;
            this.f26919e = hha.m30465A();
            this.f26920f = hha.m30465A();
        }

        @Override // o.hha.f0, p001o.ige
        public ige getNextInWriteQueue() {
            return this.f26919e;
        }

        @Override // o.hha.f0, p001o.ige
        public ige getPreviousInWriteQueue() {
            return this.f26920f;
        }

        @Override // o.hha.f0, p001o.ige
        public long getWriteTime() {
            return this.f26918d;
        }

        @Override // o.hha.f0, p001o.ige
        public void setNextInWriteQueue(ige igeVar) {
            this.f26919e = igeVar;
        }

        @Override // o.hha.f0, p001o.ige
        public void setPreviousInWriteQueue(ige igeVar) {
            this.f26920f = igeVar;
        }

        @Override // o.hha.f0, p001o.ige
        public void setWriteTime(long j) {
            this.f26918d = j;
        }
    }

    /* renamed from: o.hha$i */
    public final class C13953i extends AbstractC13955k {
        public C13953i(hha hhaVar) {
            super();
        }

        @Override // java.util.Iterator
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            return m30525e();
        }
    }

    public static final class i0 extends C13964t {

        /* renamed from: b */
        public final int f26921b;

        public i0(ReferenceQueue referenceQueue, Object obj, ige igeVar, int i) {
            super(referenceQueue, obj, igeVar);
            this.f26921b = i;
        }

        @Override // p001o.hha.C13964t, o.hha.b0
        /* renamed from: d */
        public b0 mo30515d(ReferenceQueue referenceQueue, Object obj, ige igeVar) {
            return new i0(referenceQueue, obj, igeVar, this.f26921b);
        }

        @Override // p001o.hha.C13964t, o.hha.b0
        public int getWeight() {
            return this.f26921b;
        }
    }

    /* renamed from: o.hha$j */
    public final class C13954j extends AbstractC13950f {
        public C13954j() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = hha.this.get(key)) != null && hha.this.f26886f.m25128d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C13953i(hha.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && hha.this.remove(key, entry.getValue());
        }
    }

    public static final class j0 extends C13969y {

        /* renamed from: b */
        public final int f26923b;

        public j0(Object obj, int i) {
            super(obj);
            this.f26923b = i;
        }

        @Override // p001o.hha.C13969y, o.hha.b0
        public int getWeight() {
            return this.f26923b;
        }
    }

    /* renamed from: o.hha$k */
    public abstract class AbstractC13955k implements Iterator {

        /* renamed from: a */
        public int f26924a;

        /* renamed from: b */
        public int f26925b = -1;

        /* renamed from: c */
        public C13963s f26926c;

        /* renamed from: d */
        public AtomicReferenceArray f26927d;

        /* renamed from: e */
        public ige f26928e;

        /* renamed from: f */
        public l0 f26929f;

        /* renamed from: g */
        public l0 f26930g;

        public AbstractC13955k() {
            this.f26924a = hha.this.f26883c.length - 1;
            m30523a();
        }

        /* renamed from: a */
        public final void m30523a() {
            this.f26929f = null;
            if (m30526f() || m30527g()) {
                return;
            }
            while (true) {
                int i = this.f26924a;
                if (i < 0) {
                    return;
                }
                C13963s[] c13963sArr = hha.this.f26883c;
                this.f26924a = i - 1;
                C13963s c13963s = c13963sArr[i];
                this.f26926c = c13963s;
                if (c13963s.f26958b != 0) {
                    this.f26927d = this.f26926c.f26962f;
                    this.f26925b = r0.length() - 1;
                    if (m30527g()) {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public boolean m30524b(ige igeVar) {
            try {
                long jMo46948a = hha.this.f26877Q.mo46948a();
                Object key = igeVar.getKey();
                Object objM30497s = hha.this.m30497s(igeVar, jMo46948a);
                if (objM30497s == null) {
                    this.f26926c.m30551L();
                    return false;
                }
                this.f26929f = hha.this.new l0(key, objM30497s);
                this.f26926c.m30551L();
                return true;
            } catch (Throwable th) {
                this.f26926c.m30551L();
                throw th;
            }
        }

        /* renamed from: e */
        public l0 m30525e() {
            l0 l0Var = this.f26929f;
            if (l0Var == null) {
                throw new NoSuchElementException();
            }
            this.f26930g = l0Var;
            m30523a();
            return this.f26930g;
        }

        /* renamed from: f */
        public boolean m30526f() {
            ige igeVar = this.f26928e;
            if (igeVar == null) {
                return false;
            }
            while (true) {
                this.f26928e = igeVar.getNext();
                ige igeVar2 = this.f26928e;
                if (igeVar2 == null) {
                    return false;
                }
                if (m30524b(igeVar2)) {
                    return true;
                }
                igeVar = this.f26928e;
            }
        }

        /* renamed from: g */
        public boolean m30527g() {
            while (true) {
                int i = this.f26925b;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray atomicReferenceArray = this.f26927d;
                this.f26925b = i - 1;
                ige igeVar = (ige) atomicReferenceArray.get(i);
                this.f26928e = igeVar;
                if (igeVar != null && (m30524b(igeVar) || m30526f())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26929f != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            dgd.m23068u(this.f26930g != null);
            hha.this.remove(this.f26930g.getKey());
            this.f26930g = null;
        }
    }

    public static final class k0 extends g0 {

        /* renamed from: b */
        public final int f26932b;

        public k0(ReferenceQueue referenceQueue, Object obj, ige igeVar, int i) {
            super(referenceQueue, obj, igeVar);
            this.f26932b = i;
        }

        @Override // o.hha.g0, o.hha.b0
        /* renamed from: d */
        public b0 mo30515d(ReferenceQueue referenceQueue, Object obj, ige igeVar) {
            return new k0(referenceQueue, obj, igeVar, this.f26932b);
        }

        @Override // o.hha.g0, o.hha.b0
        public int getWeight() {
            return this.f26932b;
        }
    }

    /* renamed from: o.hha$l */
    public final class C13956l extends AbstractC13955k {
        public C13956l(hha hhaVar) {
            super();
        }

        @Override // java.util.Iterator
        public Object next() {
            return m30525e().getKey();
        }
    }

    public final class l0 implements Map.Entry {

        /* renamed from: a */
        public final Object f26933a;

        /* renamed from: b */
        public Object f26934b;

        public l0(Object obj, Object obj2) {
            this.f26933a = obj;
            this.f26934b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f26933a.equals(entry.getKey()) && this.f26934b.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f26933a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f26934b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f26933a.hashCode() ^ this.f26934b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object objPut = hha.this.put(this.f26933a, obj);
            this.f26934b = obj;
            return objPut;
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: o.hha$m */
    public final class C13957m extends AbstractC13950f {
        public C13957m() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return hha.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C13956l(hha.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return hha.this.remove(obj) != null;
        }
    }

    /* renamed from: o.hha$n */
    public static final class C13958n extends C13961q implements cha {

        /* renamed from: L */
        public transient cha f26937L;

        public C13958n(hha hhaVar) {
            super(hhaVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f26937L = m30540o().m53305b(this.f26954y);
        }

        private Object readResolve() {
            return this.f26937L;
        }

        @Override // p001o.cha, p001o.ol7
        public Object apply(Object obj) {
            return this.f26937L.apply(obj);
        }

        @Override // p001o.cha
        /* renamed from: e */
        public void mo21259e(Object obj) {
            this.f26937L.mo21259e(obj);
        }

        @Override // p001o.cha
        public Object get(Object obj) {
            return this.f26937L.get(obj);
        }
    }

    /* renamed from: o.hha$o */
    public static class C13959o implements b0 {

        /* renamed from: a */
        public volatile b0 f26938a;

        /* renamed from: b */
        public final qif f26939b;

        /* renamed from: c */
        public final g6g f26940c;

        /* renamed from: d */
        public final Thread f26941d;

        public C13959o() {
            this(hha.m30470P());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ Object m30529l(Object obj) {
            m30535n(obj);
            return obj;
        }

        @Override // o.hha.b0
        /* renamed from: a */
        public boolean mo30512a() {
            return this.f26938a.mo30512a();
        }

        @Override // o.hha.b0
        /* renamed from: b */
        public boolean mo30513b() {
            return true;
        }

        @Override // o.hha.b0
        /* renamed from: c */
        public void mo30514c(Object obj) {
            if (obj != null) {
                m30535n(obj);
            } else {
                this.f26938a = hha.m30470P();
            }
        }

        @Override // o.hha.b0
        /* renamed from: d */
        public b0 mo30515d(ReferenceQueue referenceQueue, Object obj, ige igeVar) {
            return this;
        }

        @Override // o.hha.b0
        /* renamed from: e */
        public ige mo30516e() {
            return null;
        }

        @Override // o.hha.b0
        /* renamed from: f */
        public Object mo30517f() {
            return x3i.m55622a(this.f26939b);
        }

        @Override // o.hha.b0
        public Object get() {
            return this.f26938a.get();
        }

        @Override // o.hha.b0
        public int getWeight() {
            return this.f26938a.getWeight();
        }

        /* renamed from: h */
        public long m30530h() {
            return this.f26940c.m28103d(TimeUnit.NANOSECONDS);
        }

        /* renamed from: i */
        public final zfa m30531i(Throwable th) {
            return cn7.m21444b(th);
        }

        /* renamed from: j */
        public Thread m30532j() {
            return this.f26941d;
        }

        /* renamed from: k */
        public b0 m30533k() {
            return this.f26938a;
        }

        /* renamed from: m */
        public zfa m30534m(Object obj, cs1 cs1Var) {
            try {
                this.f26940c.m28105f();
                Object obj2 = this.f26938a.get();
                if (obj2 == null) {
                    Object objMo21693a = cs1Var.mo21693a(obj);
                    return m30535n(objMo21693a) ? this.f26939b : cn7.m21445c(objMo21693a);
                }
                zfa zfaVarMo21694b = cs1Var.mo21694b(obj, obj2);
                return zfaVarMo21694b == null ? cn7.m21445c(null) : cn7.m21446d(zfaVarMo21694b, new ol7() { // from class: o.iha
                    @Override // p001o.ol7
                    public final Object apply(Object obj3) {
                        return this.f28675a.m30529l(obj3);
                    }
                }, bmb.m19375a());
            } catch (Throwable th) {
                zfa zfaVarM30531i = m30536o(th) ? this.f26939b : m30531i(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return zfaVarM30531i;
            }
        }

        /* renamed from: n */
        public boolean m30535n(Object obj) {
            return this.f26939b.mo43035B(obj);
        }

        /* renamed from: o */
        public boolean m30536o(Throwable th) {
            return this.f26939b.mo43036C(th);
        }

        public C13959o(b0 b0Var) {
            this.f26939b = qif.m45520F();
            this.f26940c = g6g.m28102c();
            this.f26938a = b0Var;
            this.f26941d = Thread.currentThread();
        }
    }

    /* renamed from: o.hha$p */
    public static class C13960p extends C13946b implements cha {
        public C13960p(vr1 vr1Var, cs1 cs1Var) {
            super(new hha(vr1Var, (cs1) dgd.m23062o(cs1Var)), null);
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use LoadingSerializationProxy");
        }

        @Override // p001o.cha, p001o.ol7
        public final Object apply(Object obj) {
            return m30537b(obj);
        }

        /* renamed from: b */
        public Object m30537b(Object obj) {
            try {
                return get(obj);
            } catch (ExecutionException e) {
                throw new c3i(e.getCause());
            }
        }

        @Override // p001o.cha
        /* renamed from: e */
        public void mo21259e(Object obj) {
            this.f26897a.m30481K(obj);
        }

        @Override // p001o.cha
        public Object get(Object obj) {
            return this.f26897a.m30498t(obj);
        }

        @Override // p001o.hha.C13946b
        public Object writeReplace() {
            return new C13958n(this.f26897a);
        }
    }

    /* renamed from: o.hha$q */
    public static class C13961q extends kf7 implements Serializable {

        /* renamed from: H */
        public transient rr1 f26942H;

        /* renamed from: a */
        public final EnumC13965u f26943a;

        /* renamed from: b */
        public final EnumC13965u f26944b;

        /* renamed from: c */
        public final ej6 f26945c;

        /* renamed from: d */
        public final ej6 f26946d;

        /* renamed from: e */
        public final long f26947e;

        /* renamed from: f */
        public final long f26948f;

        /* renamed from: g */
        public final long f26949g;

        /* renamed from: h */
        public final f7j f26950h;

        /* renamed from: q */
        public final int f26951q;

        /* renamed from: s */
        public final nie f26952s;

        /* renamed from: x */
        public final rlh f26953x;

        /* renamed from: y */
        public final cs1 f26954y;

        public C13961q(hha hhaVar) {
            this(hhaVar.f26887g, hhaVar.f26888h, hhaVar.f26885e, hhaVar.f26886f, hhaVar.f26892y, hhaVar.f26891x, hhaVar.f26889q, hhaVar.f26890s, hhaVar.f26884d, hhaVar.f26876M, hhaVar.f26877Q, hhaVar.f26880Z);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f26942H = m30540o().m53304a();
        }

        private Object readResolve() {
            return this.f26942H;
        }

        @Override // p001o.qf7
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public rr1 mo30538h() {
            return this.f26942H;
        }

        /* renamed from: o */
        public vr1 m30540o() {
            vr1 vr1VarM53328z = vr1.m53298y().m53299A(this.f26943a).m53300B(this.f26944b).m53325v(this.f26945c).m53302D(this.f26946d).m53308e(this.f26951q).m53328z(this.f26952s);
            vr1VarM53328z.f50765a = false;
            long j = this.f26947e;
            if (j > 0) {
                vr1VarM53328z.m53310g(j, TimeUnit.NANOSECONDS);
            }
            long j2 = this.f26948f;
            if (j2 > 0) {
                vr1VarM53328z.m53309f(j2, TimeUnit.NANOSECONDS);
            }
            f7j f7jVar = this.f26950h;
            if (f7jVar != vr1.EnumC17662f.INSTANCE) {
                vr1VarM53328z.m53303E(f7jVar);
                long j3 = this.f26949g;
                if (j3 != -1) {
                    vr1VarM53328z.m53327x(j3);
                }
            } else {
                long j4 = this.f26949g;
                if (j4 != -1) {
                    vr1VarM53328z.m53326w(j4);
                }
            }
            rlh rlhVar = this.f26953x;
            if (rlhVar != null) {
                vr1VarM53328z.m53301C(rlhVar);
            }
            return vr1VarM53328z;
        }

        public C13961q(EnumC13965u enumC13965u, EnumC13965u enumC13965u2, ej6 ej6Var, ej6 ej6Var2, long j, long j2, long j3, f7j f7jVar, int i, nie nieVar, rlh rlhVar, cs1 cs1Var) {
            this.f26943a = enumC13965u;
            this.f26944b = enumC13965u2;
            this.f26945c = ej6Var;
            this.f26946d = ej6Var2;
            this.f26947e = j;
            this.f26948f = j2;
            this.f26949g = j3;
            this.f26950h = f7jVar;
            this.f26951q = i;
            this.f26952s = nieVar;
            this.f26953x = (rlhVar == rlh.m46947b() || rlhVar == vr1.f50764t) ? null : rlhVar;
            this.f26954y = cs1Var;
        }
    }

    /* renamed from: o.hha$r */
    public enum EnumC13962r implements ige {
        INSTANCE;

        @Override // p001o.ige
        public long getAccessTime() {
            return 0L;
        }

        @Override // p001o.ige
        public int getHash() {
            return 0;
        }

        @Override // p001o.ige
        public Object getKey() {
            return null;
        }

        @Override // p001o.ige
        public ige getNext() {
            return null;
        }

        @Override // p001o.ige
        public ige getNextInAccessQueue() {
            return this;
        }

        @Override // p001o.ige
        public ige getNextInWriteQueue() {
            return this;
        }

        @Override // p001o.ige
        public ige getPreviousInAccessQueue() {
            return this;
        }

        @Override // p001o.ige
        public ige getPreviousInWriteQueue() {
            return this;
        }

        @Override // p001o.ige
        public b0 getValueReference() {
            return null;
        }

        @Override // p001o.ige
        public long getWriteTime() {
            return 0L;
        }

        @Override // p001o.ige
        public void setAccessTime(long j) {
        }

        @Override // p001o.ige
        public void setNextInAccessQueue(ige igeVar) {
        }

        @Override // p001o.ige
        public void setNextInWriteQueue(ige igeVar) {
        }

        @Override // p001o.ige
        public void setPreviousInAccessQueue(ige igeVar) {
        }

        @Override // p001o.ige
        public void setPreviousInWriteQueue(ige igeVar) {
        }

        @Override // p001o.ige
        public void setValueReference(b0 b0Var) {
        }

        @Override // p001o.ige
        public void setWriteTime(long j) {
        }
    }

    /* renamed from: o.hha$s */
    public static class C13963s extends ReentrantLock {

        /* renamed from: H */
        public final Queue f26955H;

        /* renamed from: L */
        public final z6 f26956L;

        /* renamed from: a */
        public final hha f26957a;

        /* renamed from: b */
        public volatile int f26958b;

        /* renamed from: c */
        public long f26959c;

        /* renamed from: d */
        public int f26960d;

        /* renamed from: e */
        public int f26961e;

        /* renamed from: f */
        public volatile AtomicReferenceArray f26962f;

        /* renamed from: g */
        public final long f26963g;

        /* renamed from: h */
        public final ReferenceQueue f26964h;

        /* renamed from: q */
        public final ReferenceQueue f26965q;

        /* renamed from: s */
        public final Queue f26966s;

        /* renamed from: x */
        public final AtomicInteger f26967x = new AtomicInteger();

        /* renamed from: y */
        public final Queue f26968y;

        public C13963s(hha hhaVar, int i, long j, z6 z6Var) {
            this.f26957a = hhaVar;
            this.f26963g = j;
            this.f26956L = (z6) dgd.m23062o(z6Var);
            m30544B(m30550J(i));
            this.f26964h = hhaVar.m30486S() ? new ReferenceQueue() : null;
            this.f26965q = hhaVar.m30487T() ? new ReferenceQueue() : null;
            this.f26966s = hhaVar.m30485R() ? new ConcurrentLinkedQueue() : hha.m30474g();
            this.f26968y = hhaVar.m30489V() ? new C13947c() : hha.m30474g();
            this.f26955H = hhaVar.m30485R() ? new C13945a() : hha.m30474g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E */
        public /* synthetic */ void m30541E(Object obj, int i, C13959o c13959o, zfa zfaVar) {
            try {
                m30582t(obj, i, c13959o, zfaVar);
            } catch (Throwable th) {
                hha.k0.log(Level.WARNING, "Exception thrown during refresh", th);
                c13959o.m30536o(th);
            }
        }

        /* renamed from: A */
        public ige m30543A() {
            for (ige igeVar : this.f26955H) {
                if (igeVar.getValueReference().getWeight() > 0) {
                    return igeVar;
                }
            }
            throw new AssertionError();
        }

        /* renamed from: B */
        public void m30544B(AtomicReferenceArray atomicReferenceArray) {
            this.f26961e = (atomicReferenceArray.length() * 3) / 4;
            if (!this.f26957a.m30491f()) {
                int i = this.f26961e;
                if (i == this.f26963g) {
                    this.f26961e = i + 1;
                }
            }
            this.f26962f = atomicReferenceArray;
        }

        /* renamed from: C */
        public C13959o m30545C(Object obj, int i, boolean z) {
            lock();
            try {
                long jMo46948a = this.f26957a.f26877Q.mo46948a();
                m30553N(jMo46948a);
                AtomicReferenceArray atomicReferenceArray = this.f26962f;
                int length = (atomicReferenceArray.length() - 1) & i;
                ige igeVar = (ige) atomicReferenceArray.get(length);
                for (ige next = igeVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.f26957a.f26885e.m25128d(obj, key)) {
                        b0 valueReference = next.getValueReference();
                        if (!valueReference.mo30513b() && (!z || jMo46948a - next.getWriteTime() >= this.f26957a.f26874H)) {
                            this.f26960d++;
                            C13959o c13959o = new C13959o(valueReference);
                            next.setValueReference(c13959o);
                            return c13959o;
                        }
                        unlock();
                        m30552M();
                        return null;
                    }
                }
                this.f26960d++;
                C13959o c13959o2 = new C13959o();
                ige igeVarM30549I = m30549I(obj, i, igeVar);
                igeVarM30549I.setValueReference(c13959o2);
                atomicReferenceArray.set(length, igeVarM30549I);
                return c13959o2;
            } finally {
                unlock();
                m30552M();
            }
        }

        /* renamed from: F */
        public zfa m30546F(final Object obj, final int i, final C13959o c13959o, cs1 cs1Var) {
            final zfa zfaVarM30534m = c13959o.m30534m(obj, cs1Var);
            zfaVarM30534m.addListener(new Runnable() { // from class: o.jha
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30448a.m30541E(obj, i, c13959o, zfaVarM30534m);
                }
            }, bmb.m19375a());
            return zfaVarM30534m;
        }

        /* renamed from: G */
        public Object m30547G(Object obj, int i, C13959o c13959o, cs1 cs1Var) {
            return m30582t(obj, i, c13959o, c13959o.m30534m(obj, cs1Var));
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
        
            if (r1 == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
        
            r15 = new p001o.hha.C13959o();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
        
            if (r14 != null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
        
            r14 = m30549I(r18, r19, r13);
            r14.setValueReference(r15);
            r11.set(r12, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
        
            r14.setValueReference(r15);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
        
            if (r1 == false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
        
            return m30547G(r18, r19, r15, r20);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
        
            r17.f26956L.mo53330b(1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
        
            return m0(r14, r18, r2);
         */
        /* renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object m30548H(Object obj, int i, cs1 cs1Var) {
            boolean z;
            b0 b0Var;
            lock();
            try {
                long jMo46948a = this.f26957a.f26877Q.mo46948a();
                m30553N(jMo46948a);
                int i2 = this.f26958b - 1;
                AtomicReferenceArray atomicReferenceArray = this.f26962f;
                int length = i & (atomicReferenceArray.length() - 1);
                ige igeVar = (ige) atomicReferenceArray.get(length);
                ige igeVarM30549I = igeVar;
                while (true) {
                    C13959o c13959o = null;
                    if (igeVarM30549I == null) {
                        z = true;
                        b0Var = null;
                        break;
                    }
                    Object key = igeVarM30549I.getKey();
                    if (igeVarM30549I.getHash() == i && key != null && this.f26957a.f26885e.m25128d(obj, key)) {
                        b0 valueReference = igeVarM30549I.getValueReference();
                        if (valueReference.mo30513b()) {
                            z = false;
                        } else {
                            Object obj2 = valueReference.get();
                            if (obj2 == null) {
                                m30576m(key, i, obj2, valueReference.getWeight(), mie.COLLECTED);
                            } else {
                                if (!this.f26957a.m30500v(igeVarM30549I, jMo46948a)) {
                                    m30557R(igeVarM30549I, jMo46948a);
                                    this.f26956L.mo53329a(1);
                                    return obj2;
                                }
                                m30576m(key, i, obj2, valueReference.getWeight(), mie.EXPIRED);
                            }
                            this.f26968y.remove(igeVarM30549I);
                            this.f26955H.remove(igeVarM30549I);
                            this.f26958b = i2;
                            z = true;
                        }
                        b0Var = valueReference;
                    } else {
                        igeVarM30549I = igeVarM30549I.getNext();
                    }
                }
            } finally {
                unlock();
                m30552M();
            }
        }

        /* renamed from: I */
        public ige m30549I(Object obj, int i, ige igeVar) {
            return this.f26957a.f26878X.newEntry(this, dgd.m23062o(obj), i, igeVar);
        }

        /* renamed from: J */
        public AtomicReferenceArray m30550J(int i) {
            return new AtomicReferenceArray(i);
        }

        /* renamed from: L */
        public void m30551L() {
            if ((this.f26967x.incrementAndGet() & 63) == 0) {
                m30565b();
            }
        }

        /* renamed from: M */
        public void m30552M() {
            g0();
        }

        /* renamed from: N */
        public void m30553N(long j) {
            f0(j);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
        
            return null;
         */
        /* renamed from: O */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object m30554O(Object obj, int i, Object obj2, boolean z) {
            int i2;
            lock();
            try {
                long jMo46948a = this.f26957a.f26877Q.mo46948a();
                m30553N(jMo46948a);
                if (this.f26958b + 1 > this.f26961e) {
                    m30578p();
                }
                AtomicReferenceArray atomicReferenceArray = this.f26962f;
                int length = i & (atomicReferenceArray.length() - 1);
                ige igeVar = (ige) atomicReferenceArray.get(length);
                ige next = igeVar;
                while (true) {
                    if (next == null) {
                        this.f26960d++;
                        ige igeVarM30549I = m30549I(obj, i, igeVar);
                        i0(igeVarM30549I, obj, obj2, jMo46948a);
                        atomicReferenceArray.set(length, igeVarM30549I);
                        this.f26958b++;
                        m30577o(igeVarM30549I);
                        break;
                    }
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.f26957a.f26885e.m25128d(obj, key)) {
                        b0 valueReference = next.getValueReference();
                        Object obj3 = valueReference.get();
                        if (obj3 != null) {
                            if (z) {
                                m30557R(next, jMo46948a);
                            } else {
                                this.f26960d++;
                                m30576m(obj, i, obj3, valueReference.getWeight(), mie.REPLACED);
                                i0(next, obj, obj2, jMo46948a);
                                m30577o(next);
                            }
                            return obj3;
                        }
                        this.f26960d++;
                        if (valueReference.mo30512a()) {
                            m30576m(obj, i, obj3, valueReference.getWeight(), mie.COLLECTED);
                            i0(next, obj, obj2, jMo46948a);
                            i2 = this.f26958b;
                        } else {
                            i0(next, obj, obj2, jMo46948a);
                            i2 = this.f26958b + 1;
                        }
                        this.f26958b = i2;
                        m30577o(next);
                    } else {
                        next = next.getNext();
                    }
                }
            } finally {
                unlock();
                m30552M();
            }
        }

        /* renamed from: P */
        public boolean m30555P(ige igeVar, int i) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.f26962f;
                int length = (atomicReferenceArray.length() - 1) & i;
                ige igeVar2 = (ige) atomicReferenceArray.get(length);
                for (ige next = igeVar2; next != null; next = next.getNext()) {
                    if (next == igeVar) {
                        this.f26960d++;
                        ige igeVarC0 = c0(igeVar2, next, next.getKey(), i, next.getValueReference().get(), next.getValueReference(), mie.COLLECTED);
                        int i2 = this.f26958b - 1;
                        atomicReferenceArray.set(length, igeVarC0);
                        this.f26958b = i2;
                        return true;
                    }
                }
                unlock();
                m30552M();
                return false;
            } finally {
                unlock();
                m30552M();
            }
        }

        /* renamed from: Q */
        public boolean m30556Q(Object obj, int i, b0 b0Var) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.f26962f;
                int length = (atomicReferenceArray.length() - 1) & i;
                ige igeVar = (ige) atomicReferenceArray.get(length);
                for (ige next = igeVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.f26957a.f26885e.m25128d(obj, key)) {
                        if (next.getValueReference() != b0Var) {
                            unlock();
                            if (!isHeldByCurrentThread()) {
                                m30552M();
                            }
                            return false;
                        }
                        this.f26960d++;
                        ige igeVarC0 = c0(igeVar, next, key, i, b0Var.get(), b0Var, mie.COLLECTED);
                        int i2 = this.f26958b - 1;
                        atomicReferenceArray.set(length, igeVarC0);
                        this.f26958b = i2;
                        return true;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    m30552M();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    m30552M();
                }
            }
        }

        /* renamed from: R */
        public void m30557R(ige igeVar, long j) {
            if (this.f26957a.m30478H()) {
                igeVar.setAccessTime(j);
            }
            this.f26955H.add(igeVar);
        }

        /* renamed from: S */
        public void m30558S(ige igeVar, long j) {
            if (this.f26957a.m30478H()) {
                igeVar.setAccessTime(j);
            }
            this.f26966s.add(igeVar);
        }

        /* renamed from: T */
        public void m30559T(ige igeVar, int i, long j) {
            m30573j();
            this.f26959c += i;
            if (this.f26957a.m30478H()) {
                igeVar.setAccessTime(j);
            }
            if (this.f26957a.m30480J()) {
                igeVar.setWriteTime(j);
            }
            this.f26955H.add(igeVar);
            this.f26968y.add(igeVar);
        }

        /* renamed from: U */
        public Object m30560U(Object obj, int i, cs1 cs1Var, boolean z) {
            C13959o c13959oM30545C = m30545C(obj, i, z);
            if (c13959oM30545C == null) {
                return null;
            }
            zfa zfaVarM30546F = m30546F(obj, i, c13959oM30545C, cs1Var);
            if (zfaVarM30546F.isDone()) {
                try {
                    return x3i.m55622a(zfaVarM30546F);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        
            r9 = r5.getValueReference();
            r12 = r9.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        
            if (r12 == null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            r2 = p001o.mie.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            r10 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (r9.mo30512a() == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        
            r2 = p001o.mie.COLLECTED;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        
            r11.f26960d++;
            r13 = c0(r4, r5, r6, r13, r12, r9, r10);
            r2 = r11.f26958b - 1;
            r0.set(r1, r13);
            r11.f26958b = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
        
            return r12;
         */
        /* renamed from: V */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object m30561V(Object obj, int i) {
            lock();
            try {
                m30553N(this.f26957a.f26877Q.mo46948a());
                AtomicReferenceArray atomicReferenceArray = this.f26962f;
                int length = (atomicReferenceArray.length() - 1) & i;
                ige igeVar = (ige) atomicReferenceArray.get(length);
                ige next = igeVar;
                while (true) {
                    if (next == null) {
                        break;
                    }
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.f26957a.f26885e.m25128d(obj, key)) {
                        break;
                    }
                    next = next.getNext();
                }
                return null;
            } finally {
                unlock();
                m30552M();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        
            r10 = r6.getValueReference();
            r9 = r10.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
        
            if (r12.f26957a.f26886f.m25128d(r15, r9) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            r13 = p001o.mie.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            if (r9 != null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
        
            if (r10.mo30512a() == false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        
            r13 = p001o.mie.COLLECTED;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        
            r12.f26960d++;
            r14 = c0(r5, r6, r7, r14, r9, r10, r13);
            r15 = r12.f26958b - 1;
            r0.set(r1, r14);
            r12.f26958b = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        
            if (r13 != p001o.mie.EXPLICIT) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
        
            r2 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        
            return r2;
         */
        /* renamed from: W */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean m30562W(Object obj, int i, Object obj2) {
            lock();
            try {
                m30553N(this.f26957a.f26877Q.mo46948a());
                AtomicReferenceArray atomicReferenceArray = this.f26962f;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                ige igeVar = (ige) atomicReferenceArray.get(length);
                ige next = igeVar;
                while (true) {
                    if (next == null) {
                        break;
                    }
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.f26957a.f26885e.m25128d(obj, key)) {
                        break;
                    }
                    next = next.getNext();
                }
                return false;
            } finally {
                unlock();
                m30552M();
            }
        }

        /* renamed from: Y */
        public void m30563Y(ige igeVar) {
            m30576m(igeVar.getKey(), igeVar.getHash(), igeVar.getValueReference().get(), igeVar.getValueReference().getWeight(), mie.COLLECTED);
            this.f26968y.remove(igeVar);
            this.f26955H.remove(igeVar);
        }

        /* renamed from: Z */
        public boolean m30564Z(ige igeVar, int i, mie mieVar) {
            AtomicReferenceArray atomicReferenceArray = this.f26962f;
            int length = (atomicReferenceArray.length() - 1) & i;
            ige igeVar2 = (ige) atomicReferenceArray.get(length);
            for (ige next = igeVar2; next != null; next = next.getNext()) {
                if (next == igeVar) {
                    this.f26960d++;
                    ige igeVarC0 = c0(igeVar2, next, next.getKey(), i, next.getValueReference().get(), next.getValueReference(), mieVar);
                    int i2 = this.f26958b - 1;
                    atomicReferenceArray.set(length, igeVarC0);
                    this.f26958b = i2;
                    return true;
                }
            }
            return false;
        }

        public ige a0(ige igeVar, ige igeVar2) {
            int i = this.f26958b;
            ige next = igeVar2.getNext();
            while (igeVar != igeVar2) {
                ige igeVarM30571h = m30571h(igeVar, next);
                if (igeVarM30571h != null) {
                    next = igeVarM30571h;
                } else {
                    m30563Y(igeVar);
                    i--;
                }
                igeVar = igeVar.getNext();
            }
            this.f26958b = i;
            return next;
        }

        /* renamed from: b */
        public void m30565b() {
            f0(this.f26957a.f26877Q.mo46948a());
            g0();
        }

        public boolean b0(Object obj, int i, C13959o c13959o) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.f26962f;
                int length = (atomicReferenceArray.length() - 1) & i;
                ige igeVar = (ige) atomicReferenceArray.get(length);
                ige next = igeVar;
                while (true) {
                    if (next == null) {
                        break;
                    }
                    Object key = next.getKey();
                    if (next.getHash() != i || key == null || !this.f26957a.f26885e.m25128d(obj, key)) {
                        next = next.getNext();
                    } else if (next.getValueReference() == c13959o) {
                        if (c13959o.mo30512a()) {
                            next.setValueReference(c13959o.m30533k());
                        } else {
                            atomicReferenceArray.set(length, a0(igeVar, next));
                        }
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                m30552M();
            }
        }

        /* renamed from: c */
        public void m30566c() {
            if (this.f26958b != 0) {
                lock();
                try {
                    m30553N(this.f26957a.f26877Q.mo46948a());
                    AtomicReferenceArray atomicReferenceArray = this.f26962f;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (ige next = (ige) atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            if (next.getValueReference().mo30512a()) {
                                Object key = next.getKey();
                                Object obj = next.getValueReference().get();
                                m30576m(key, next.getHash(), obj, next.getValueReference().getWeight(), (key == null || obj == null) ? mie.COLLECTED : mie.EXPLICIT);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    m30568e();
                    this.f26968y.clear();
                    this.f26955H.clear();
                    this.f26967x.set(0);
                    this.f26960d++;
                    this.f26958b = 0;
                } finally {
                    unlock();
                    m30552M();
                }
            }
        }

        public ige c0(ige igeVar, ige igeVar2, Object obj, int i, Object obj2, b0 b0Var, mie mieVar) {
            m30576m(obj, i, obj2, b0Var.getWeight(), mieVar);
            this.f26968y.remove(igeVar2);
            this.f26955H.remove(igeVar2);
            if (!b0Var.mo30513b()) {
                return a0(igeVar, igeVar2);
            }
            b0Var.mo30514c(null);
            return igeVar;
        }

        /* renamed from: d */
        public void m30567d() {
            while (this.f26964h.poll() != null) {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object d0(Object obj, int i, Object obj2) {
            lock();
            try {
                long jMo46948a = this.f26957a.f26877Q.mo46948a();
                m30553N(jMo46948a);
                AtomicReferenceArray atomicReferenceArray = this.f26962f;
                int length = i & (atomicReferenceArray.length() - 1);
                ige igeVar = (ige) atomicReferenceArray.get(length);
                ige next = igeVar;
                while (true) {
                    if (next == null) {
                        break;
                    }
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null) {
                        if (this.f26957a.f26885e.m25128d(obj, key)) {
                            b0 valueReference = next.getValueReference();
                            Object obj3 = valueReference.get();
                            if (obj3 != null) {
                                this.f26960d++;
                                m30576m(obj, i, obj3, valueReference.getWeight(), mie.REPLACED);
                                i0(next, obj, obj2, jMo46948a);
                                m30577o(next);
                                return obj3;
                            }
                            if (valueReference.mo30512a()) {
                                this.f26960d++;
                                ige igeVarC0 = c0(igeVar, next, key, i, obj3, valueReference, mie.COLLECTED);
                                int i2 = this.f26958b - 1;
                                atomicReferenceArray.set(length, igeVarC0);
                                this.f26958b = i2;
                            }
                        }
                    }
                    next = next.getNext();
                }
            } finally {
                unlock();
                m30552M();
            }
        }

        /* renamed from: e */
        public void m30568e() {
            if (this.f26957a.m30486S()) {
                m30567d();
            }
            if (this.f26957a.m30487T()) {
                m30569f();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean e0(Object obj, int i, Object obj2, Object obj3) {
            lock();
            try {
                long jMo46948a = this.f26957a.f26877Q.mo46948a();
                m30553N(jMo46948a);
                AtomicReferenceArray atomicReferenceArray = this.f26962f;
                int length = i & (atomicReferenceArray.length() - 1);
                ige igeVar = (ige) atomicReferenceArray.get(length);
                ige next = igeVar;
                while (true) {
                    if (next == null) {
                        break;
                    }
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null) {
                        if (this.f26957a.f26885e.m25128d(obj, key)) {
                            b0 valueReference = next.getValueReference();
                            Object obj4 = valueReference.get();
                            if (obj4 == null) {
                                if (valueReference.mo30512a()) {
                                    this.f26960d++;
                                    ige igeVarC0 = c0(igeVar, next, key, i, obj4, valueReference, mie.COLLECTED);
                                    int i2 = this.f26958b - 1;
                                    atomicReferenceArray.set(length, igeVarC0);
                                    this.f26958b = i2;
                                }
                            } else {
                                if (this.f26957a.f26886f.m25128d(obj2, obj4)) {
                                    this.f26960d++;
                                    m30576m(obj, i, obj4, valueReference.getWeight(), mie.REPLACED);
                                    i0(next, obj, obj3, jMo46948a);
                                    m30577o(next);
                                    return true;
                                }
                                m30557R(next, jMo46948a);
                            }
                        }
                    }
                    next = next.getNext();
                }
            } finally {
                unlock();
                m30552M();
            }
        }

        /* renamed from: f */
        public void m30569f() {
            while (this.f26965q.poll() != null) {
            }
        }

        public void f0(long j) {
            if (tryLock()) {
                try {
                    m30574k();
                    m30579q(j);
                    this.f26967x.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: g */
        public boolean m30570g(Object obj, int i) {
            try {
                if (this.f26958b == 0) {
                    return false;
                }
                ige igeVarM30585y = m30585y(obj, i, this.f26957a.f26877Q.mo46948a());
                if (igeVarM30585y == null) {
                    return false;
                }
                return igeVarM30585y.getValueReference().get() != null;
            } finally {
                m30551L();
            }
        }

        public void g0() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.f26957a.m30475D();
        }

        /* renamed from: h */
        public ige m30571h(ige igeVar, ige igeVar2) {
            Object key = igeVar.getKey();
            if (key == null) {
                return null;
            }
            b0 valueReference = igeVar.getValueReference();
            Object obj = valueReference.get();
            if (obj == null && valueReference.mo30512a()) {
                return null;
            }
            ige igeVarCopyEntry = this.f26957a.f26878X.copyEntry(this, igeVar, igeVar2, key);
            igeVarCopyEntry.setValueReference(valueReference.mo30515d(this.f26965q, obj, igeVarCopyEntry));
            return igeVarCopyEntry;
        }

        public Object h0(ige igeVar, Object obj, int i, Object obj2, long j, cs1 cs1Var) {
            Object objM30560U;
            return (!this.f26957a.m30482L() || j - igeVar.getWriteTime() <= this.f26957a.f26874H || igeVar.getValueReference().mo30513b() || (objM30560U = m30560U(obj, i, cs1Var, true)) == null) ? obj2 : objM30560U;
        }

        /* renamed from: i */
        public void m30572i() {
            int i = 0;
            do {
                Object objPoll = this.f26964h.poll();
                if (objPoll == null) {
                    return;
                }
                this.f26957a.m30476F((ige) objPoll);
                i++;
            } while (i != 16);
        }

        public void i0(ige igeVar, Object obj, Object obj2, long j) {
            b0 valueReference = igeVar.getValueReference();
            int iWeigh = this.f26957a.f26890s.weigh(obj, obj2);
            dgd.m23069v(iWeigh >= 0, "Weights must be non-negative");
            igeVar.setValueReference(this.f26957a.f26888h.referenceValue(this, igeVar, obj2, iWeigh));
            m30559T(igeVar, iWeigh, j);
            valueReference.mo30514c(obj2);
        }

        /* renamed from: j */
        public void m30573j() {
            while (true) {
                ige igeVar = (ige) this.f26966s.poll();
                if (igeVar == null) {
                    return;
                }
                if (this.f26955H.contains(igeVar)) {
                    this.f26955H.add(igeVar);
                }
            }
        }

        public boolean j0(Object obj, int i, C13959o c13959o, Object obj2) {
            lock();
            try {
                long jMo46948a = this.f26957a.f26877Q.mo46948a();
                m30553N(jMo46948a);
                int i2 = this.f26958b + 1;
                if (i2 > this.f26961e) {
                    m30578p();
                    i2 = this.f26958b + 1;
                }
                int i3 = i2;
                AtomicReferenceArray atomicReferenceArray = this.f26962f;
                int length = i & (atomicReferenceArray.length() - 1);
                ige igeVar = (ige) atomicReferenceArray.get(length);
                ige next = igeVar;
                while (true) {
                    if (next == null) {
                        this.f26960d++;
                        ige igeVarM30549I = m30549I(obj, i, igeVar);
                        i0(igeVarM30549I, obj, obj2, jMo46948a);
                        atomicReferenceArray.set(length, igeVarM30549I);
                        this.f26958b = i3;
                        m30577o(igeVarM30549I);
                        break;
                    }
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.f26957a.f26885e.m25128d(obj, key)) {
                        b0 valueReference = next.getValueReference();
                        Object obj3 = valueReference.get();
                        if (c13959o != valueReference && (obj3 != null || valueReference == hha.l0)) {
                            m30576m(obj, i, obj2, 0, mie.REPLACED);
                            unlock();
                            m30552M();
                            return false;
                        }
                        this.f26960d++;
                        if (c13959o.mo30512a()) {
                            m30576m(obj, i, obj3, c13959o.getWeight(), obj3 == null ? mie.COLLECTED : mie.REPLACED);
                            i3--;
                        }
                        i0(next, obj, obj2, jMo46948a);
                        this.f26958b = i3;
                        m30577o(next);
                    } else {
                        next = next.getNext();
                    }
                }
                return true;
            } finally {
                unlock();
                m30552M();
            }
        }

        /* renamed from: k */
        public void m30574k() {
            if (this.f26957a.m30486S()) {
                m30572i();
            }
            if (this.f26957a.m30487T()) {
                m30575l();
            }
        }

        public void k0() {
            if (tryLock()) {
                try {
                    m30574k();
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: l */
        public void m30575l() {
            int i = 0;
            do {
                Object objPoll = this.f26965q.poll();
                if (objPoll == null) {
                    return;
                }
                this.f26957a.m30477G((b0) objPoll);
                i++;
            } while (i != 16);
        }

        public void l0(long j) {
            if (tryLock()) {
                try {
                    m30579q(j);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: m */
        public void m30576m(Object obj, int i, Object obj2, int i2, mie mieVar) {
            this.f26959c -= i2;
            if (mieVar.wasEvicted()) {
                this.f26956L.mo53331c();
            }
            if (this.f26957a.f26875L != hha.m0) {
                this.f26957a.f26875L.offer(oie.m42269a(obj, obj2, mieVar));
            }
        }

        public Object m0(ige igeVar, Object obj, b0 b0Var) {
            if (!b0Var.mo30513b()) {
                throw new AssertionError();
            }
            if (b0Var instanceof C13959o) {
                dgd.m23072y(((C13959o) b0Var).m30532j() != Thread.currentThread(), "Recursive load of: %s", obj);
            }
            try {
                Object objMo30517f = b0Var.mo30517f();
                if (objMo30517f != null) {
                    m30558S(igeVar, this.f26957a.f26877Q.mo46948a());
                    return objMo30517f;
                }
                throw new cs1.C12735a("CacheLoader returned null for key " + obj + ".");
            } finally {
                this.f26956L.mo53330b(1);
            }
        }

        /* renamed from: o */
        public void m30577o(ige igeVar) {
            if (this.f26957a.m30492h()) {
                m30573j();
                if (igeVar.getValueReference().getWeight() > this.f26963g && !m30564Z(igeVar, igeVar.getHash(), mie.SIZE)) {
                    throw new AssertionError();
                }
                while (this.f26959c > this.f26963g) {
                    ige igeVarM30543A = m30543A();
                    if (!m30564Z(igeVarM30543A, igeVarM30543A.getHash(), mie.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        /* renamed from: p */
        public void m30578p() {
            AtomicReferenceArray atomicReferenceArray = this.f26962f;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.f26958b;
            AtomicReferenceArray atomicReferenceArrayM30550J = m30550J(length << 1);
            this.f26961e = (atomicReferenceArrayM30550J.length() * 3) / 4;
            int length2 = atomicReferenceArrayM30550J.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                ige next = (ige) atomicReferenceArray.get(i2);
                if (next != null) {
                    ige next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayM30550J.set(hash, next);
                    } else {
                        ige igeVar = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                igeVar = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayM30550J.set(hash, igeVar);
                        while (next != igeVar) {
                            int hash3 = next.getHash() & length2;
                            ige igeVarM30571h = m30571h(next, (ige) atomicReferenceArrayM30550J.get(hash3));
                            if (igeVarM30571h != null) {
                                atomicReferenceArrayM30550J.set(hash3, igeVarM30571h);
                            } else {
                                m30563Y(next);
                                i--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.f26962f = atomicReferenceArrayM30550J;
            this.f26958b = i;
        }

        /* renamed from: q */
        public void m30579q(long j) {
            ige igeVar;
            ige igeVar2;
            m30573j();
            do {
                igeVar = (ige) this.f26968y.peek();
                if (igeVar == null || !this.f26957a.m30500v(igeVar, j)) {
                    do {
                        igeVar2 = (ige) this.f26955H.peek();
                        if (igeVar2 == null || !this.f26957a.m30500v(igeVar2, j)) {
                            return;
                        }
                    } while (m30564Z(igeVar2, igeVar2.getHash(), mie.EXPIRED));
                    throw new AssertionError();
                }
            } while (m30564Z(igeVar, igeVar.getHash(), mie.EXPIRED));
            throw new AssertionError();
        }

        /* renamed from: r */
        public Object m30580r(Object obj, int i) {
            try {
                if (this.f26958b != 0) {
                    long jMo46948a = this.f26957a.f26877Q.mo46948a();
                    ige igeVarM30585y = m30585y(obj, i, jMo46948a);
                    if (igeVarM30585y == null) {
                        return null;
                    }
                    Object obj2 = igeVarM30585y.getValueReference().get();
                    if (obj2 != null) {
                        m30558S(igeVarM30585y, jMo46948a);
                        return h0(igeVarM30585y, igeVarM30585y.getKey(), i, obj2, jMo46948a, this.f26957a.f26880Z);
                    }
                    k0();
                }
                return null;
            } finally {
                m30551L();
            }
        }

        /* renamed from: s */
        public Object m30581s(Object obj, int i, cs1 cs1Var) {
            ige igeVarM30583u;
            dgd.m23062o(obj);
            dgd.m23062o(cs1Var);
            try {
                try {
                    if (this.f26958b != 0 && (igeVarM30583u = m30583u(obj, i)) != null) {
                        long jMo46948a = this.f26957a.f26877Q.mo46948a();
                        Object objM30586z = m30586z(igeVarM30583u, jMo46948a);
                        if (objM30586z != null) {
                            m30558S(igeVarM30583u, jMo46948a);
                            this.f26956L.mo53329a(1);
                            return h0(igeVarM30583u, obj, i, objM30586z, jMo46948a, cs1Var);
                        }
                        b0 valueReference = igeVarM30583u.getValueReference();
                        if (valueReference.mo30513b()) {
                            return m0(igeVarM30583u, obj, valueReference);
                        }
                    }
                    return m30548H(obj, i, cs1Var);
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof Error) {
                        throw new ll6((Error) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw new c3i(cause);
                    }
                    throw e;
                }
            } finally {
                m30551L();
            }
        }

        /* renamed from: t */
        public Object m30582t(Object obj, int i, C13959o c13959o, zfa zfaVar) throws Throwable {
            Object objM55622a;
            try {
                objM55622a = x3i.m55622a(zfaVar);
            } catch (Throwable th) {
                th = th;
                objM55622a = null;
            }
            try {
                if (objM55622a != null) {
                    this.f26956L.mo53333e(c13959o.m30530h());
                    j0(obj, i, c13959o, objM55622a);
                    return objM55622a;
                }
                throw new cs1.C12735a("CacheLoader returned null for key " + obj + ".");
            } catch (Throwable th2) {
                th = th2;
                if (objM55622a == null) {
                    this.f26956L.mo53332d(c13959o.m30530h());
                    b0(obj, i, c13959o);
                }
                throw th;
            }
        }

        /* renamed from: u */
        public ige m30583u(Object obj, int i) {
            for (ige igeVarM30584x = m30584x(i); igeVarM30584x != null; igeVarM30584x = igeVarM30584x.getNext()) {
                if (igeVarM30584x.getHash() == i) {
                    Object key = igeVarM30584x.getKey();
                    if (key == null) {
                        k0();
                    } else if (this.f26957a.f26885e.m25128d(obj, key)) {
                        return igeVarM30584x;
                    }
                }
            }
            return null;
        }

        /* renamed from: x */
        public ige m30584x(int i) {
            return (ige) this.f26962f.get(i & (r0.length() - 1));
        }

        /* renamed from: y */
        public ige m30585y(Object obj, int i, long j) {
            ige igeVarM30583u = m30583u(obj, i);
            if (igeVarM30583u == null) {
                return null;
            }
            if (!this.f26957a.m30500v(igeVarM30583u, j)) {
                return igeVarM30583u;
            }
            l0(j);
            return null;
        }

        /* renamed from: z */
        public Object m30586z(ige igeVar, long j) {
            if (igeVar.getKey() == null) {
                k0();
                return null;
            }
            Object obj = igeVar.getValueReference().get();
            if (obj == null) {
                k0();
                return null;
            }
            if (!this.f26957a.m30500v(igeVar, j)) {
                return obj;
            }
            l0(j);
            return null;
        }
    }

    /* renamed from: o.hha$t */
    public static class C13964t extends SoftReference implements b0 {

        /* renamed from: a */
        public final ige f26969a;

        public C13964t(ReferenceQueue referenceQueue, Object obj, ige igeVar) {
            super(obj, referenceQueue);
            this.f26969a = igeVar;
        }

        @Override // o.hha.b0
        /* renamed from: a */
        public boolean mo30512a() {
            return true;
        }

        @Override // o.hha.b0
        /* renamed from: b */
        public boolean mo30513b() {
            return false;
        }

        @Override // o.hha.b0
        /* renamed from: c */
        public void mo30514c(Object obj) {
        }

        /* renamed from: d */
        public b0 mo30515d(ReferenceQueue referenceQueue, Object obj, ige igeVar) {
            return new C13964t(referenceQueue, obj, igeVar);
        }

        @Override // o.hha.b0
        /* renamed from: e */
        public ige mo30516e() {
            return this.f26969a;
        }

        @Override // o.hha.b0
        /* renamed from: f */
        public Object mo30517f() {
            return get();
        }

        public int getWeight() {
            return 1;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.hha$u */
    public static abstract class EnumC13965u {
        public static final EnumC13965u STRONG = new a("STRONG", 0);
        public static final EnumC13965u SOFT = new b("SOFT", 1);
        public static final EnumC13965u WEAK = new c("WEAK", 2);
        private static final /* synthetic */ EnumC13965u[] $VALUES = $values();

        /* renamed from: o.hha$u$a */
        public enum a extends EnumC13965u {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // p001o.hha.EnumC13965u
            public ej6 defaultEquivalence() {
                return ej6.m25124c();
            }

            @Override // p001o.hha.EnumC13965u
            public <K, V> b0 referenceValue(C13963s c13963s, ige igeVar, V v, int i) {
                return i == 1 ? new C13969y(v) : new j0(v, i);
            }
        }

        /* renamed from: o.hha$u$b */
        public enum b extends EnumC13965u {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // p001o.hha.EnumC13965u
            public ej6 defaultEquivalence() {
                return ej6.m25125f();
            }

            @Override // p001o.hha.EnumC13965u
            public <K, V> b0 referenceValue(C13963s c13963s, ige igeVar, V v, int i) {
                return i == 1 ? new C13964t(c13963s.f26965q, v, igeVar) : new i0(c13963s.f26965q, v, igeVar, i);
            }
        }

        /* renamed from: o.hha$u$c */
        public enum c extends EnumC13965u {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // p001o.hha.EnumC13965u
            public ej6 defaultEquivalence() {
                return ej6.m25125f();
            }

            @Override // p001o.hha.EnumC13965u
            public <K, V> b0 referenceValue(C13963s c13963s, ige igeVar, V v, int i) {
                return i == 1 ? new g0(c13963s.f26965q, v, igeVar) : new k0(c13963s.f26965q, v, igeVar, i);
            }
        }

        private static /* synthetic */ EnumC13965u[] $values() {
            return new EnumC13965u[]{STRONG, SOFT, WEAK};
        }

        private EnumC13965u(String str, int i) {
        }

        public static EnumC13965u valueOf(String str) {
            return (EnumC13965u) Enum.valueOf(EnumC13965u.class, str);
        }

        public static EnumC13965u[] values() {
            return (EnumC13965u[]) $VALUES.clone();
        }

        public abstract ej6 defaultEquivalence();

        public abstract <K, V> b0 referenceValue(C13963s c13963s, ige igeVar, V v, int i);

        public /* synthetic */ EnumC13965u(String str, int i, C13948d c13948d) {
            this(str, i);
        }
    }

    /* renamed from: o.hha$v */
    public static final class C13966v extends C13968x {

        /* renamed from: e */
        public volatile long f26970e;

        /* renamed from: f */
        public ige f26971f;

        /* renamed from: g */
        public ige f26972g;

        public C13966v(Object obj, int i, ige igeVar) {
            super(obj, i, igeVar);
            this.f26970e = Long.MAX_VALUE;
            this.f26971f = hha.m30465A();
            this.f26972g = hha.m30465A();
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public long getAccessTime() {
            return this.f26970e;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public ige getNextInAccessQueue() {
            return this.f26971f;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public ige getPreviousInAccessQueue() {
            return this.f26972g;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public void setAccessTime(long j) {
            this.f26970e = j;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public void setNextInAccessQueue(ige igeVar) {
            this.f26971f = igeVar;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public void setPreviousInAccessQueue(ige igeVar) {
            this.f26972g = igeVar;
        }
    }

    /* renamed from: o.hha$w */
    public static final class C13967w extends C13968x {

        /* renamed from: e */
        public volatile long f26973e;

        /* renamed from: f */
        public ige f26974f;

        /* renamed from: g */
        public ige f26975g;

        /* renamed from: h */
        public volatile long f26976h;

        /* renamed from: q */
        public ige f26977q;

        /* renamed from: s */
        public ige f26978s;

        public C13967w(Object obj, int i, ige igeVar) {
            super(obj, i, igeVar);
            this.f26973e = Long.MAX_VALUE;
            this.f26974f = hha.m30465A();
            this.f26975g = hha.m30465A();
            this.f26976h = Long.MAX_VALUE;
            this.f26977q = hha.m30465A();
            this.f26978s = hha.m30465A();
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public long getAccessTime() {
            return this.f26973e;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public ige getNextInAccessQueue() {
            return this.f26974f;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public ige getNextInWriteQueue() {
            return this.f26977q;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public ige getPreviousInAccessQueue() {
            return this.f26975g;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public ige getPreviousInWriteQueue() {
            return this.f26978s;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public long getWriteTime() {
            return this.f26976h;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public void setAccessTime(long j) {
            this.f26973e = j;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public void setNextInAccessQueue(ige igeVar) {
            this.f26974f = igeVar;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public void setNextInWriteQueue(ige igeVar) {
            this.f26977q = igeVar;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public void setPreviousInAccessQueue(ige igeVar) {
            this.f26975g = igeVar;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public void setPreviousInWriteQueue(ige igeVar) {
            this.f26978s = igeVar;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public void setWriteTime(long j) {
            this.f26976h = j;
        }
    }

    /* renamed from: o.hha$x */
    public static class C13968x extends AbstractC13951g {

        /* renamed from: a */
        public final Object f26979a;

        /* renamed from: b */
        public final int f26980b;

        /* renamed from: c */
        public final ige f26981c;

        /* renamed from: d */
        public volatile b0 f26982d = hha.m30470P();

        public C13968x(Object obj, int i, ige igeVar) {
            this.f26979a = obj;
            this.f26980b = i;
            this.f26981c = igeVar;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public int getHash() {
            return this.f26980b;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public Object getKey() {
            return this.f26979a;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public ige getNext() {
            return this.f26981c;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public b0 getValueReference() {
            return this.f26982d;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public void setValueReference(b0 b0Var) {
            this.f26982d = b0Var;
        }
    }

    /* renamed from: o.hha$y */
    public static class C13969y implements b0 {

        /* renamed from: a */
        public final Object f26983a;

        public C13969y(Object obj) {
            this.f26983a = obj;
        }

        @Override // o.hha.b0
        /* renamed from: a */
        public boolean mo30512a() {
            return true;
        }

        @Override // o.hha.b0
        /* renamed from: b */
        public boolean mo30513b() {
            return false;
        }

        @Override // o.hha.b0
        /* renamed from: c */
        public void mo30514c(Object obj) {
        }

        @Override // o.hha.b0
        /* renamed from: d */
        public b0 mo30515d(ReferenceQueue referenceQueue, Object obj, ige igeVar) {
            return this;
        }

        @Override // o.hha.b0
        /* renamed from: e */
        public ige mo30516e() {
            return null;
        }

        @Override // o.hha.b0
        /* renamed from: f */
        public Object mo30517f() {
            return get();
        }

        @Override // o.hha.b0
        public Object get() {
            return this.f26983a;
        }

        @Override // o.hha.b0
        public int getWeight() {
            return 1;
        }
    }

    /* renamed from: o.hha$z */
    public static final class C13970z extends C13968x {

        /* renamed from: e */
        public volatile long f26984e;

        /* renamed from: f */
        public ige f26985f;

        /* renamed from: g */
        public ige f26986g;

        public C13970z(Object obj, int i, ige igeVar) {
            super(obj, i, igeVar);
            this.f26984e = Long.MAX_VALUE;
            this.f26985f = hha.m30465A();
            this.f26986g = hha.m30465A();
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public ige getNextInWriteQueue() {
            return this.f26985f;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public ige getPreviousInWriteQueue() {
            return this.f26986g;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public long getWriteTime() {
            return this.f26984e;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public void setNextInWriteQueue(ige igeVar) {
            this.f26985f = igeVar;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public void setPreviousInWriteQueue(ige igeVar) {
            this.f26986g = igeVar;
        }

        @Override // p001o.hha.AbstractC13951g, p001o.ige
        public void setWriteTime(long j) {
            this.f26984e = j;
        }
    }

    public hha(vr1 vr1Var, cs1 cs1Var) {
        this.f26884d = Math.min(vr1Var.m53311h(), 65536);
        EnumC13965u enumC13965uM53316m = vr1Var.m53316m();
        this.f26887g = enumC13965uM53316m;
        this.f26888h = vr1Var.m53323t();
        this.f26885e = vr1Var.m53315l();
        this.f26886f = vr1Var.m53322s();
        long jM53317n = vr1Var.m53317n();
        this.f26889q = jM53317n;
        this.f26890s = vr1Var.m53324u();
        this.f26891x = vr1Var.m53312i();
        this.f26892y = vr1Var.m53313j();
        this.f26874H = vr1Var.m53318o();
        nie nieVarM53319p = vr1Var.m53319p();
        this.f26876M = nieVarM53319p;
        this.f26875L = nieVarM53319p == vr1.EnumC17661e.INSTANCE ? m30474g() : new ConcurrentLinkedQueue();
        this.f26877Q = vr1Var.m53321r(m30479I());
        this.f26878X = EnumC13952h.getFactory(enumC13965uM53316m, m30484Q(), m30488U());
        this.f26879Y = (z6) vr1Var.m53320q().get();
        this.f26880Z = cs1Var;
        int iMin = Math.min(vr1Var.m53314k(), 1073741824);
        if (m30492h() && !m30491f()) {
            iMin = (int) Math.min(iMin, jM53317n);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.f26884d && (!m30492h() || i4 * 20 <= this.f26889q)) {
            i3++;
            i4 <<= 1;
        }
        this.f26882b = 32 - i3;
        this.f26881a = i4 - 1;
        this.f26883c = m30502y(i4);
        int i5 = iMin / i4;
        while (i2 < (i5 * i4 < iMin ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        if (m30492h()) {
            long j = this.f26889q;
            long j2 = i4;
            long j3 = (j / j2) + 1;
            long j4 = j % j2;
            while (true) {
                C13963s[] c13963sArr = this.f26883c;
                if (i >= c13963sArr.length) {
                    return;
                }
                if (i == j4) {
                    j3--;
                }
                c13963sArr[i] = m30490e(i2, j3, (z6) vr1Var.m53320q().get());
                i++;
            }
        } else {
            while (true) {
                C13963s[] c13963sArr2 = this.f26883c;
                if (i >= c13963sArr2.length) {
                    return;
                }
                c13963sArr2[i] = m30490e(i2, -1L, (z6) vr1Var.m53320q().get());
                i++;
            }
        }
    }

    /* renamed from: A */
    public static ige m30465A() {
        return EnumC13962r.INSTANCE;
    }

    /* renamed from: B */
    public static void m30466B(ige igeVar) {
        ige igeVarM30465A = m30465A();
        igeVar.setNextInAccessQueue(igeVarM30465A);
        igeVar.setPreviousInAccessQueue(igeVarM30465A);
    }

    /* renamed from: C */
    public static void m30467C(ige igeVar) {
        ige igeVarM30465A = m30465A();
        igeVar.setNextInWriteQueue(igeVarM30465A);
        igeVar.setPreviousInWriteQueue(igeVarM30465A);
    }

    /* renamed from: M */
    public static int m30468M(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* renamed from: O */
    public static ArrayList m30469O(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        e69.m24377a(arrayList, collection.iterator());
        return arrayList;
    }

    /* renamed from: P */
    public static b0 m30470P() {
        return l0;
    }

    /* renamed from: c */
    public static void m30472c(ige igeVar, ige igeVar2) {
        igeVar.setNextInAccessQueue(igeVar2);
        igeVar2.setPreviousInAccessQueue(igeVar);
    }

    /* renamed from: d */
    public static void m30473d(ige igeVar, ige igeVar2) {
        igeVar.setNextInWriteQueue(igeVar2);
        igeVar2.setPreviousInWriteQueue(igeVar);
    }

    /* renamed from: g */
    public static Queue m30474g() {
        return m0;
    }

    /* renamed from: D */
    public void m30475D() {
        while (true) {
            oie oieVar = (oie) this.f26875L.poll();
            if (oieVar == null) {
                return;
            }
            try {
                this.f26876M.onRemoval(oieVar);
            } catch (Throwable th) {
                k0.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }

    /* renamed from: F */
    public void m30476F(ige igeVar) {
        int hash = igeVar.getHash();
        m30483N(hash).m30555P(igeVar, hash);
    }

    /* renamed from: G */
    public void m30477G(b0 b0Var) {
        ige igeVarMo30516e = b0Var.mo30516e();
        int hash = igeVarMo30516e.getHash();
        m30483N(hash).m30556Q(igeVarMo30516e.getKey(), hash, b0Var);
    }

    /* renamed from: H */
    public boolean m30478H() {
        return m30493k();
    }

    /* renamed from: I */
    public boolean m30479I() {
        return m30480J() || m30478H();
    }

    /* renamed from: J */
    public boolean m30480J() {
        return m30494n() || m30482L();
    }

    /* renamed from: K */
    public void m30481K(Object obj) {
        int iM30499u = m30499u(dgd.m23062o(obj));
        m30483N(iM30499u).m30560U(obj, iM30499u, this.f26880Z, false);
    }

    /* renamed from: L */
    public boolean m30482L() {
        return this.f26874H > 0;
    }

    /* renamed from: N */
    public C13963s m30483N(int i) {
        return this.f26883c[(i >>> this.f26882b) & this.f26881a];
    }

    /* renamed from: Q */
    public boolean m30484Q() {
        return m30485R() || m30478H();
    }

    /* renamed from: R */
    public boolean m30485R() {
        return m30493k() || m30492h();
    }

    /* renamed from: S */
    public boolean m30486S() {
        return this.f26887g != EnumC13965u.STRONG;
    }

    /* renamed from: T */
    public boolean m30487T() {
        return this.f26888h != EnumC13965u.STRONG;
    }

    /* renamed from: U */
    public boolean m30488U() {
        return m30489V() || m30480J();
    }

    /* renamed from: V */
    public boolean m30489V() {
        return m30494n();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (C13963s c13963s : this.f26883c) {
            c13963s.m30566c();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iM30499u = m30499u(obj);
        return m30483N(iM30499u).m30570g(obj, iM30499u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        long jMo46948a = this.f26877Q.mo46948a();
        C13963s[] c13963sArr = this.f26883c;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = c13963sArr.length;
            long j2 = 0;
            for (?? r12 = z; r12 < length; r12++) {
                C13963s c13963s = c13963sArr[r12];
                int i2 = c13963s.f26958b;
                ?? r14 = c13963s.f26962f;
                for (?? r15 = z; r15 < r14.length(); r15++) {
                    ige next = (ige) r14.get(r15);
                    while (next != null) {
                        C13963s[] c13963sArr2 = c13963sArr;
                        Object objM30586z = c13963s.m30586z(next, jMo46948a);
                        long j3 = jMo46948a;
                        if (objM30586z != null && this.f26886f.m25128d(obj, objM30586z)) {
                            return true;
                        }
                        next = next.getNext();
                        c13963sArr = c13963sArr2;
                        jMo46948a = j3;
                    }
                }
                j2 += c13963s.f26960d;
                jMo46948a = jMo46948a;
                z = false;
            }
            long j4 = jMo46948a;
            C13963s[] c13963sArr3 = c13963sArr;
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            c13963sArr = c13963sArr3;
            jMo46948a = j4;
            z = false;
        }
        return z;
    }

    /* renamed from: e */
    public C13963s m30490e(int i, long j, z6 z6Var) {
        return new C13963s(this, i, j, z6Var);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.j0;
        if (set != null) {
            return set;
        }
        C13954j c13954j = new C13954j();
        this.j0 = c13954j;
        return c13954j;
    }

    /* renamed from: f */
    public boolean m30491f() {
        return this.f26890s != vr1.EnumC17662f.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iM30499u = m30499u(obj);
        return m30483N(iM30499u).m30580r(obj, iM30499u);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* renamed from: h */
    public boolean m30492h() {
        return this.f26889q >= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        C13963s[] c13963sArr = this.f26883c;
        long j = 0;
        for (C13963s c13963s : c13963sArr) {
            if (c13963s.f26958b != 0) {
                return false;
            }
            j += r8.f26960d;
        }
        if (j == 0) {
            return true;
        }
        for (C13963s c13963s2 : c13963sArr) {
            if (c13963s2.f26958b != 0) {
                return false;
            }
            j -= r9.f26960d;
        }
        return j == 0;
    }

    /* renamed from: k */
    public boolean m30493k() {
        return this.f26891x > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.h0;
        if (set != null) {
            return set;
        }
        C13957m c13957m = new C13957m();
        this.h0 = c13957m;
        return c13957m;
    }

    /* renamed from: n */
    public boolean m30494n() {
        return this.f26892y > 0;
    }

    /* renamed from: o */
    public Object m30495o(Object obj, cs1 cs1Var) {
        int iM30499u = m30499u(dgd.m23062o(obj));
        return m30483N(iM30499u).m30581s(obj, iM30499u, cs1Var);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        dgd.m23062o(obj);
        dgd.m23062o(obj2);
        int iM30499u = m30499u(obj);
        return m30483N(iM30499u).m30554O(obj, iM30499u, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object putIfAbsent(Object obj, Object obj2) {
        dgd.m23062o(obj);
        dgd.m23062o(obj2);
        int iM30499u = m30499u(obj);
        return m30483N(iM30499u).m30554O(obj, iM30499u, obj2, true);
    }

    /* renamed from: r */
    public Object m30496r(Object obj) {
        int iM30499u = m30499u(dgd.m23062o(obj));
        Object objM30580r = m30483N(iM30499u).m30580r(obj, iM30499u);
        if (objM30580r == null) {
            this.f26879Y.mo53330b(1);
        } else {
            this.f26879Y.mo53329a(1);
        }
        return objM30580r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iM30499u = m30499u(obj);
        return m30483N(iM30499u).m30561V(obj, iM30499u);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(Object obj, Object obj2, Object obj3) {
        dgd.m23062o(obj);
        dgd.m23062o(obj3);
        if (obj2 == null) {
            return false;
        }
        int iM30499u = m30499u(obj);
        return m30483N(iM30499u).e0(obj, iM30499u, obj2, obj3);
    }

    /* renamed from: s */
    public Object m30497s(ige igeVar, long j) {
        Object obj;
        if (igeVar.getKey() == null || (obj = igeVar.getValueReference().get()) == null || m30500v(igeVar, j)) {
            return null;
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return br8.m19645l(m30501w());
    }

    /* renamed from: t */
    public Object m30498t(Object obj) {
        return m30495o(obj, this.f26880Z);
    }

    /* renamed from: u */
    public int m30499u(Object obj) {
        return m30468M(this.f26885e.m25129e(obj));
    }

    /* renamed from: v */
    public boolean m30500v(ige igeVar, long j) {
        dgd.m23062o(igeVar);
        if (!m30493k() || j - igeVar.getAccessTime() < this.f26891x) {
            return m30494n() && j - igeVar.getWriteTime() >= this.f26892y;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.i0;
        if (collection != null) {
            return collection;
        }
        c0 c0Var = new c0();
        this.i0 = c0Var;
        return c0Var;
    }

    /* renamed from: w */
    public long m30501w() {
        long jMax = 0;
        for (int i = 0; i < this.f26883c.length; i++) {
            jMax += Math.max(0, r0[i].f26958b);
        }
        return jMax;
    }

    /* renamed from: y */
    public final C13963s[] m30502y(int i) {
        return new C13963s[i];
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iM30499u = m30499u(obj);
        return m30483N(iM30499u).m30562W(obj, iM30499u, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object replace(Object obj, Object obj2) {
        dgd.m23062o(obj);
        dgd.m23062o(obj2);
        int iM30499u = m30499u(obj);
        return m30483N(iM30499u).d0(obj, iM30499u, obj2);
    }
}
