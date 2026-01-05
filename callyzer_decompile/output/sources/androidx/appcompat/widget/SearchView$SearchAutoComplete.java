package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import bk.RunnableC0683n;
import org.bouncycastle.asn1.BERTags;
import p013o.AbstractC5227m;
import p013o.u1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends AbstractC5227m {

    /* renamed from: e */
    public int f1771e;

    /* renamed from: f */
    public boolean f1772f;

    /* renamed from: g */
    public final RunnableC0683n f1773g;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1773g = new RunnableC0683n(9, this);
        this.f1771e = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i10 >= 600) {
            return BERTags.PRIVATE;
        }
        if (i10 < 640 || i11 < 480) {
            return 160;
        }
        return BERTags.PRIVATE;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f1771e <= 0 || super.enoughToFilter();
    }

    @Override // p013o.AbstractC5227m, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f1772f) {
            RunnableC0683n runnableC0683n = this.f1773g;
            removeCallbacks(runnableC0683n);
            post(runnableC0683n);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z6, int i10, Rect rect) {
        super.onFocusChanged(z6, i10, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i10, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        if (z6) {
            throw null;
        }
    }

    public void setImeVisibility(boolean z6) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        RunnableC0683n runnableC0683n = this.f1773g;
        if (!z6) {
            this.f1772f = false;
            removeCallbacks(runnableC0683n);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.f1772f = true;
                return;
            }
            this.f1772f = false;
            removeCallbacks(runnableC0683n);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i10) {
        super.setThreshold(i10);
        this.f1771e = i10;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setSearchView(u1 u1Var) {
    }
}
