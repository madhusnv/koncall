package u6;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u6.c */
/* loaded from: classes.dex */
public final class C7349c implements TextWatcher, SpanWatcher {

    /* renamed from: a */
    public final Object f34980a;

    /* renamed from: b */
    public final AtomicInteger f34981b = new AtomicInteger(0);

    public C7349c(Object obj) {
        this.f34980a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f34980a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ((TextWatcher) this.f34980a).beforeTextChanged(charSequence, i10, i11, i12);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
        this.f34981b.get();
        ((SpanWatcher) this.f34980a).onSpanAdded(spannable, obj, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014 A[PHI: r11
      0x0014: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:3:0x0009, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSpanChanged(android.text.Spannable r9, java.lang.Object r10, int r11, int r12, int r13, int r14) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r8.f34981b
            r0.get()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L14
            r0 = 0
            if (r11 <= r12) goto Lf
            r11 = r0
        Lf:
            if (r13 <= r14) goto L14
            r4 = r11
            r6 = r0
            goto L16
        L14:
            r4 = r11
            r6 = r13
        L16:
            java.lang.Object r11 = r8.f34980a
            r1 = r11
            android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
            r2 = r9
            r3 = r10
            r5 = r12
            r7 = r14
            r1.onSpanChanged(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.C7349c.onSpanChanged(android.text.Spannable, java.lang.Object, int, int, int, int):void");
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
        this.f34981b.get();
        ((SpanWatcher) this.f34980a).onSpanRemoved(spannable, obj, i10, i11);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ((TextWatcher) this.f34980a).onTextChanged(charSequence, i10, i11, i12);
    }
}
