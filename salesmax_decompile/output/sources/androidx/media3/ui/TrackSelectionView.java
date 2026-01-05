package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.media3.common.C2181a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001o.aae;
import p001o.euh;
import p001o.h9e;
import p001o.nf8;
import p001o.op0;
import p001o.qth;
import p001o.tth;
import p001o.ui5;
import p001o.xth;

/* loaded from: classes2.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: H */
    public Comparator f8862H;

    /* renamed from: a */
    public final int f8863a;

    /* renamed from: b */
    public final LayoutInflater f8864b;

    /* renamed from: c */
    public final CheckedTextView f8865c;

    /* renamed from: d */
    public final CheckedTextView f8866d;

    /* renamed from: e */
    public final ViewOnClickListenerC2293b f8867e;

    /* renamed from: f */
    public final List f8868f;

    /* renamed from: g */
    public final Map f8869g;

    /* renamed from: h */
    public boolean f8870h;

    /* renamed from: q */
    public boolean f8871q;

    /* renamed from: s */
    public tth f8872s;

    /* renamed from: x */
    public CheckedTextView[][] f8873x;

    /* renamed from: y */
    public boolean f8874y;

    /* renamed from: androidx.media3.ui.TrackSelectionView$b */
    public class ViewOnClickListenerC2293b implements View.OnClickListener {
        public ViewOnClickListenerC2293b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.m7840c(view);
        }
    }

    /* renamed from: androidx.media3.ui.TrackSelectionView$c */
    public static final class C2294c {

        /* renamed from: a */
        public final euh.C13263a f8876a;

        /* renamed from: b */
        public final int f8877b;

        public C2294c(euh.C13263a c13263a, int i) {
            this.f8876a = c13263a;
            this.f8877b = i;
        }

        /* renamed from: a */
        public C2181a m7848a() {
            return this.f8876a.m25633b(this.f8877b);
        }
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public static Map m7839b(Map map, List list, boolean z) {
        HashMap map2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            xth xthVar = (xth) map.get(((euh.C13263a) list.get(i)).m25632a());
            if (xthVar != null && (z || map2.isEmpty())) {
                map2.put(xthVar.f54291a, xthVar);
            }
        }
        return map2;
    }

    /* renamed from: c */
    public final void m7840c(View view) {
        if (view == this.f8865c) {
            m7842e();
        } else if (view == this.f8866d) {
            m7841d();
        } else {
            m7843f(view);
        }
        m7846i();
    }

    /* renamed from: d */
    public final void m7841d() {
        this.f8874y = false;
        this.f8869g.clear();
    }

    /* renamed from: e */
    public final void m7842e() {
        this.f8874y = true;
        this.f8869g.clear();
    }

    /* renamed from: f */
    public final void m7843f(View view) {
        this.f8874y = false;
        C2294c c2294c = (C2294c) op0.m42515e(view.getTag());
        qth qthVarM25632a = c2294c.f8876a.m25632a();
        int i = c2294c.f8877b;
        xth xthVar = (xth) this.f8869g.get(qthVarM25632a);
        if (xthVar == null) {
            if (!this.f8871q && this.f8869g.size() > 0) {
                this.f8869g.clear();
            }
            this.f8869g.put(qthVarM25632a, new xth(qthVarM25632a, nf8.m40500F(Integer.valueOf(i))));
            return;
        }
        ArrayList arrayList = new ArrayList(xthVar.f54292b);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zM7844g = m7844g(c2294c.f8876a);
        boolean z = zM7844g || m7845h();
        if (zIsChecked && z) {
            arrayList.remove(Integer.valueOf(i));
            if (arrayList.isEmpty()) {
                this.f8869g.remove(qthVarM25632a);
                return;
            } else {
                this.f8869g.put(qthVarM25632a, new xth(qthVarM25632a, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zM7844g) {
            this.f8869g.put(qthVarM25632a, new xth(qthVarM25632a, nf8.m40500F(Integer.valueOf(i))));
        } else {
            arrayList.add(Integer.valueOf(i));
            this.f8869g.put(qthVarM25632a, new xth(qthVarM25632a, arrayList));
        }
    }

    /* renamed from: g */
    public final boolean m7844g(euh.C13263a c13263a) {
        return this.f8870h && c13263a.m25635d();
    }

    public boolean getIsDisabled() {
        return this.f8874y;
    }

    public Map<qth, xth> getOverrides() {
        return this.f8869g;
    }

    /* renamed from: h */
    public final boolean m7845h() {
        return this.f8871q && this.f8868f.size() > 1;
    }

    /* renamed from: i */
    public final void m7846i() {
        this.f8865c.setChecked(this.f8874y);
        this.f8866d.setChecked(!this.f8874y && this.f8869g.size() == 0);
        for (int i = 0; i < this.f8873x.length; i++) {
            xth xthVar = (xth) this.f8869g.get(((euh.C13263a) this.f8868f.get(i)).m25632a());
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f8873x[i];
                if (i2 < checkedTextViewArr.length) {
                    if (xthVar != null) {
                        this.f8873x[i][i2].setChecked(xthVar.f54292b.contains(Integer.valueOf(((C2294c) op0.m42515e(checkedTextViewArr[i2].getTag())).f8877b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    /* renamed from: j */
    public final void m7847j() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f8868f.isEmpty()) {
            this.f8865c.setEnabled(false);
            this.f8866d.setEnabled(false);
            return;
        }
        this.f8865c.setEnabled(true);
        this.f8866d.setEnabled(true);
        this.f8873x = new CheckedTextView[this.f8868f.size()][];
        boolean zM7845h = m7845h();
        for (int i = 0; i < this.f8868f.size(); i++) {
            euh.C13263a c13263a = (euh.C13263a) this.f8868f.get(i);
            boolean zM7844g = m7844g(c13263a);
            CheckedTextView[][] checkedTextViewArr = this.f8873x;
            int i2 = c13263a.f22208a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            C2294c[] c2294cArr = new C2294c[i2];
            for (int i3 = 0; i3 < c13263a.f22208a; i3++) {
                c2294cArr[i3] = new C2294c(c13263a, i3);
            }
            Comparator comparator = this.f8862H;
            if (comparator != null) {
                Arrays.sort(c2294cArr, comparator);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                if (i4 == 0) {
                    addView(this.f8864b.inflate(h9e.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f8864b.inflate((zM7844g || zM7845h) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f8863a);
                checkedTextView.setText(this.f8872s.mo50586a(c2294cArr[i4].m7848a()));
                checkedTextView.setTag(c2294cArr[i4]);
                if (c13263a.m25639h(i4)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f8867e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f8873x[i][i4] = checkedTextView;
                addView(checkedTextView);
            }
        }
        m7846i();
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f8870h != z) {
            this.f8870h = z;
            m7847j();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f8871q != z) {
            this.f8871q = z;
            if (!z && this.f8869g.size() > 1) {
                Map mapM7839b = m7839b(this.f8869g, this.f8868f, false);
                this.f8869g.clear();
                this.f8869g.putAll(mapM7839b);
            }
            m7847j();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f8865c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(tth tthVar) {
        this.f8872s = (tth) op0.m42515e(tthVar);
        m7847j();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f8863a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f8864b = layoutInflaterFrom;
        ViewOnClickListenerC2293b viewOnClickListenerC2293b = new ViewOnClickListenerC2293b();
        this.f8867e = viewOnClickListenerC2293b;
        this.f8872s = new ui5(getResources());
        this.f8868f = new ArrayList();
        this.f8869g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f8865c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(aae.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC2293b);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(h9e.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f8866d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(aae.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC2293b);
        addView(checkedTextView2);
    }
}
