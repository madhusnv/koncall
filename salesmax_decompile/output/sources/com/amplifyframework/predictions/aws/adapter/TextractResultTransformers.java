package com.amplifyframework.predictions.aws.adapter;

import android.graphics.PointF;
import android.graphics.RectF;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.aws.adapter.TextractResultTransformers;
import com.amplifyframework.predictions.models.BoundedKeyValue;
import com.amplifyframework.predictions.models.Cell;
import com.amplifyframework.predictions.models.IdentifiedText;
import com.amplifyframework.predictions.models.Polygon;
import com.amplifyframework.predictions.models.Selection;
import com.amplifyframework.predictions.models.Table;
import com.amplifyframework.util.Empty;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.acd;
import p001o.bi6;
import p001o.dj1;
import p001o.hl1;
import p001o.icf;
import p001o.qhe;
import p001o.vi1;

/* loaded from: classes5.dex */
public final class TextractResultTransformers {
    private TextractResultTransformers() {
    }

    private static void doForEachRelatedBlock(vi1 vi1Var, Map<String, vi1> map, Consumer<vi1> consumer) {
        if (vi1Var == null || vi1Var.m52802h() == null) {
            return;
        }
        Iterator it = vi1Var.m52802h().iterator();
        while (it.hasNext()) {
            List listM45497a = ((qhe) it.next()).m45497a();
            if (listM45497a != null) {
                Iterator it2 = listM45497a.iterator();
                while (it2.hasNext()) {
                    vi1 vi1Var2 = map.get((String) it2.next());
                    if (vi1Var2 != null) {
                        consumer.accept(vi1Var2);
                    }
                }
            }
        }
    }

    public static IdentifiedText fetchIdentifiedText(vi1 vi1Var) {
        if (vi1Var == null || vi1Var.m52805k() == null || vi1Var.m52797c() == null) {
            return null;
        }
        return ((IdentifiedText.Builder) ((IdentifiedText.Builder) ((IdentifiedText.Builder) IdentifiedText.builder().text(vi1Var.m52805k()).confidence(vi1Var.m52797c().floatValue())).box(vi1Var.m52799e() != null ? fromBoundingBox(vi1Var.m52799e().m32520a()) : null)).polygon(fromPoints(vi1Var.m52799e() != null ? vi1Var.m52799e().m32521b() : null))).page(vi1Var.m52801g() != null ? vi1Var.m52801g().intValue() : 0).build();
    }

    public static BoundedKeyValue fetchKeyValue(vi1 vi1Var, final Map<String, vi1> map) {
        List listM52798d;
        Objects.requireNonNull(map);
        if (vi1Var == null || !dj1.C12952c.f20070c.equals(vi1Var.m52795a()) || vi1Var.m52797c() == null || (listM52798d = vi1Var.m52798d()) == null || !listM52798d.contains(bi6.C12418c.f16329c)) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        doForEachRelatedBlock(vi1Var, map, new Consumer() { // from class: o.sjh
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                TextractResultTransformers.lambda$fetchKeyValue$2(sb, map, sb2, (vi1) obj);
            }
        });
        return ((BoundedKeyValue.Builder) ((BoundedKeyValue.Builder) ((BoundedKeyValue.Builder) BoundedKeyValue.builder().keyValuePair(sb.toString().trim(), sb2.toString().trim()).confidence(vi1Var.m52797c().floatValue())).box(vi1Var.m52799e() != null ? fromBoundingBox(vi1Var.m52799e().m32520a()) : null)).polygon(fromPoints(vi1Var.m52799e() != null ? vi1Var.m52799e().m32521b() : null))).build();
    }

    public static Selection fetchSelection(vi1 vi1Var) {
        if (vi1Var == null || vi1Var.m52804j() == null) {
            return null;
        }
        return Selection.builder().box(vi1Var.m52799e() != null ? fromBoundingBox(vi1Var.m52799e().m32520a()) : null).polygon(fromPoints(vi1Var.m52799e() != null ? vi1Var.m52799e().m32521b() : null)).selected(icf.C14256d.f28464c.equals(vi1Var.m52804j())).build();
    }

    public static Table fetchTable(vi1 vi1Var, final Map<String, vi1> map) {
        Objects.requireNonNull(map);
        if (vi1Var == null || !dj1.C12971v.f20107c.equals(vi1Var.m52795a()) || vi1Var.m52797c() == null) {
            return null;
        }
        final ArrayList arrayList = new ArrayList();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        doForEachRelatedBlock(vi1Var, map, new Consumer() { // from class: o.ujh
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                TextractResultTransformers.lambda$fetchTable$0(hashSet, hashSet2, arrayList, map, (vi1) obj);
            }
        });
        return ((Table.Builder) ((Table.Builder) ((Table.Builder) Table.builder().cells(arrayList).confidence(vi1Var.m52797c().floatValue())).box(vi1Var.m52799e() != null ? fromBoundingBox(vi1Var.m52799e().m32520a()) : null)).polygon(fromPoints(vi1Var.m52799e() != null ? vi1Var.m52799e().m32521b() : null))).rowSize(hashSet.size()).columnSize(hashSet2.size()).build();
    }

    private static Cell fetchTableCell(vi1 vi1Var, Map<String, vi1> map) {
        Objects.requireNonNull(map);
        if (vi1Var != null && dj1.C12950a.f20068c.equals(vi1Var.m52795a()) && vi1Var.m52797c() != null) {
            final StringBuilder sb = new StringBuilder();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            doForEachRelatedBlock(vi1Var, map, new Consumer() { // from class: o.tjh
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    TextractResultTransformers.lambda$fetchTableCell$3(sb, atomicBoolean, (vi1) obj);
                }
            });
            List listM32521b = vi1Var.m52799e() != null ? vi1Var.m52799e().m32521b() : null;
            if (vi1Var.m52803i() != null && vi1Var.m52796b() != null) {
                return ((Cell.Builder) ((Cell.Builder) ((Cell.Builder) Cell.builder().text(sb.toString().trim()).confidence(vi1Var.m52797c().floatValue())).box(vi1Var.m52799e() != null ? fromBoundingBox(vi1Var.m52799e().m32520a()) : null)).polygon(fromPoints(listM32521b))).selected(atomicBoolean.get()).row(vi1Var.m52803i().intValue() - 1).column(vi1Var.m52796b().intValue() - 1).build();
            }
        }
        return null;
    }

    public static RectF fromBoundingBox(hl1 hl1Var) {
        if (hl1Var == null) {
            return null;
        }
        return new RectF(hl1Var.m30743b(), hl1Var.m30744c(), hl1Var.m30743b() + hl1Var.m30745d(), hl1Var.m30744c() + hl1Var.m30742a());
    }

    public static Polygon fromPoints(List<acd> list) {
        if (Empty.check(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (acd acdVar : list) {
            arrayList.add(new PointF(acdVar.m16876a(), acdVar.m16877b()));
        }
        return Polygon.fromPoints(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fetchKeyValue$1(StringBuilder sb, vi1 vi1Var) {
        sb.append(vi1Var.m52805k());
        sb.append(" ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fetchKeyValue$2(StringBuilder sb, Map map, final StringBuilder sb2, vi1 vi1Var) {
        if (vi1Var.m52805k() != null) {
            sb.append(vi1Var.m52805k());
            sb.append(" ");
        }
        doForEachRelatedBlock(vi1Var, map, new Consumer() { // from class: o.vjh
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                TextractResultTransformers.lambda$fetchKeyValue$1(sb2, (vi1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fetchTable$0(Set set, Set set2, List list, Map map, vi1 vi1Var) {
        if (vi1Var.m52803i() == null || vi1Var.m52796b() == null) {
            return;
        }
        set.add(Integer.valueOf(vi1Var.m52803i().intValue() - 1));
        set2.add(Integer.valueOf(vi1Var.m52796b().intValue() - 1));
        list.add(fetchTableCell(vi1Var, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fetchTableCell$3(StringBuilder sb, AtomicBoolean atomicBoolean, vi1 vi1Var) {
        String strM52805k = vi1Var.m52805k();
        if (strM52805k != null) {
            sb.append(strM52805k);
            sb.append(" ");
        }
        icf icfVarM52804j = vi1Var.m52804j();
        if (icfVarM52804j != null) {
            atomicBoolean.set(icf.C14256d.f28464c.equals(icfVarM52804j));
        }
    }
}
