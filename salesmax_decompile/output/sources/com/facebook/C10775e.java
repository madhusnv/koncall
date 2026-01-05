package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p001o.fp0;
import p001o.id5;
import p001o.sq8;

/* renamed from: com.facebook.e */
/* loaded from: classes5.dex */
public final class C10775e extends AbstractList {

    /* renamed from: g */
    public static final b f11425g = new b(null);

    /* renamed from: h */
    public static final AtomicInteger f11426h = new AtomicInteger();

    /* renamed from: a */
    public Handler f11427a;

    /* renamed from: b */
    public int f11428b;

    /* renamed from: c */
    public final String f11429c;

    /* renamed from: d */
    public List f11430d;

    /* renamed from: e */
    public List f11431e;

    /* renamed from: f */
    public String f11432f;

    /* renamed from: com.facebook.e$a */
    public interface a {
        /* renamed from: a */
        void mo13062a(C10775e c10775e);
    }

    /* renamed from: com.facebook.e$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(id5 id5Var) {
            this();
        }
    }

    public C10775e(Collection collection) {
        sq8.m48649h(collection, "requests");
        this.f11429c = String.valueOf(Integer.valueOf(f11426h.incrementAndGet()));
        this.f11431e = new ArrayList();
        this.f11430d = new ArrayList(collection);
    }

    /* renamed from: A */
    public /* bridge */ int m13039A(GraphRequest graphRequest) {
        return super.lastIndexOf(graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ GraphRequest remove(int i) {
        return m13042F(i);
    }

    /* renamed from: E */
    public /* bridge */ boolean m13041E(GraphRequest graphRequest) {
        return super.remove(graphRequest);
    }

    /* renamed from: F */
    public GraphRequest m13042F(int i) {
        return (GraphRequest) this.f11430d.remove(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public GraphRequest set(int i, GraphRequest graphRequest) {
        sq8.m48649h(graphRequest, "element");
        return (GraphRequest) this.f11430d.set(i, graphRequest);
    }

    /* renamed from: I */
    public final void m13044I(Handler handler) {
        this.f11427a = handler;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i, GraphRequest graphRequest) {
        sq8.m48649h(graphRequest, "element");
        this.f11430d.add(i, graphRequest);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f11430d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return m13048i((GraphRequest) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(GraphRequest graphRequest) {
        sq8.m48649h(graphRequest, "element");
        return this.f11430d.add(graphRequest);
    }

    /* renamed from: e */
    public final void m13047e(a aVar) {
        sq8.m48649h(aVar, "callback");
        if (this.f11431e.contains(aVar)) {
            return;
        }
        this.f11431e.add(aVar);
    }

    /* renamed from: i */
    public /* bridge */ boolean m13048i(GraphRequest graphRequest) {
        return super.contains(graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return m13061z((GraphRequest) obj);
        }
        return -1;
    }

    /* renamed from: j */
    public final List m13049j() {
        return m13050l();
    }

    /* renamed from: l */
    public final List m13050l() {
        return GraphRequest.f11338n.m12898i(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return m13039A((GraphRequest) obj);
        }
        return -1;
    }

    /* renamed from: m */
    public final AsyncTaskC10774d m13051m() {
        return m13052n();
    }

    /* renamed from: n */
    public final AsyncTaskC10774d m13052n() {
        return GraphRequest.f11338n.m12901l(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public GraphRequest get(int i) {
        return (GraphRequest) this.f11430d.get(i);
    }

    /* renamed from: p */
    public final String m13054p() {
        return this.f11432f;
    }

    /* renamed from: q */
    public final Handler m13055q() {
        return this.f11427a;
    }

    /* renamed from: r */
    public final List m13056r() {
        return this.f11431e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return m13059x();
    }

    /* renamed from: v */
    public final String m13057v() {
        return this.f11429c;
    }

    /* renamed from: w */
    public final List m13058w() {
        return this.f11430d;
    }

    /* renamed from: x */
    public int m13059x() {
        return this.f11430d.size();
    }

    /* renamed from: y */
    public final int m13060y() {
        return this.f11428b;
    }

    /* renamed from: z */
    public /* bridge */ int m13061z(GraphRequest graphRequest) {
        return super.indexOf(graphRequest);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return m13041E((GraphRequest) obj);
        }
        return false;
    }

    public C10775e(GraphRequest... graphRequestArr) {
        sq8.m48649h(graphRequestArr, "requests");
        this.f11429c = String.valueOf(Integer.valueOf(f11426h.incrementAndGet()));
        this.f11431e = new ArrayList();
        this.f11430d = new ArrayList(fp0.m27255d(graphRequestArr));
    }
}
