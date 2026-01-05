package o4;

import android.text.Layout;
import android.text.TextPaint;
import cj.C0975a;
import com.skydoves.balloon.internals.DefinitionKt;
import g4.C2510z;
import g4.InterfaceC2505u;
import g4.o0;
import h4.C2832i;
import h4.C2835l;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import k4.InterfaceC3987h;
import l4.C4367l;
import qw.C6361k;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o4.d */
/* loaded from: classes.dex */
public final class C5288d implements InterfaceC2505u {

    /* renamed from: a */
    public final String f25957a;

    /* renamed from: b */
    public final o0 f25958b;

    /* renamed from: c */
    public final List f25959c;

    /* renamed from: d */
    public final List f25960d;

    /* renamed from: e */
    public final InterfaceC3987h f25961e;

    /* renamed from: f */
    public final InterfaceC6747c f25962f;

    /* renamed from: g */
    public final C5289e f25963g;

    /* renamed from: h */
    public final CharSequence f25964h;

    /* renamed from: j */
    public final C2835l f25965j;

    /* renamed from: k */
    public C4367l f25966k;

    /* renamed from: l */
    public final boolean f25967l;

    /* renamed from: m */
    public final int f25968m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004c  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5288d(java.lang.String r40, g4.o0 r41, java.util.List r42, java.util.List r43, k4.InterfaceC3987h r44, s4.InterfaceC6747c r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.C5288d.<init>(java.lang.String, g4.o0, java.util.List, java.util.List, k4.h, s4.c):void");
    }

    @Override // g4.InterfaceC2505u
    /* renamed from: a */
    public final boolean mo209a() {
        C4367l c4367l = this.f25966k;
        if (c4367l != null ? c4367l.m9122F() : false) {
            return true;
        }
        if (!this.f25967l) {
            C2510z c2510z = this.f25958b.f13690c;
        }
        return false;
    }

    @Override // g4.InterfaceC2505u
    /* renamed from: b */
    public final float mo210b() {
        float f6;
        C2835l c2835l = this.f25965j;
        float f10 = c2835l.f15820e;
        TextPaint textPaint = c2835l.f15817b;
        if (!Float.isNaN(f10)) {
            return c2835l.f15820e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = c2835l.f15816a;
        lineInstance.setText(new C2832i(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new C0975a(4));
        int i10 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C6361k(Integer.valueOf(i10), Integer.valueOf(next)));
            } else {
                C6361k c6361k = (C6361k) priorityQueue.peek();
                if (c6361k != null && ((Number) c6361k.f30756b).intValue() - ((Number) c6361k.f30755a).intValue() < next - i10) {
                    priorityQueue.poll();
                    priorityQueue.add(new C6361k(Integer.valueOf(i10), Integer.valueOf(next)));
                }
            }
            i10 = next;
        }
        if (priorityQueue.isEmpty()) {
            f6 = DefinitionKt.NO_Float_VALUE;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            C6361k c6361k2 = (C6361k) it.next();
            float desiredWidth = Layout.getDesiredWidth(c2835l.m6957b(), ((Number) c6361k2.f30755a).intValue(), ((Number) c6361k2.f30756b).intValue(), textPaint);
            while (it.hasNext()) {
                C6361k c6361k3 = (C6361k) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(c2835l.m6957b(), ((Number) c6361k3.f30755a).intValue(), ((Number) c6361k3.f30756b).intValue(), textPaint));
            }
            f6 = desiredWidth;
        }
        c2835l.f15820e = f6;
        return f6;
    }

    @Override // g4.InterfaceC2505u
    /* renamed from: f */
    public final float mo214f() {
        return this.f25965j.m6958c();
    }
}
