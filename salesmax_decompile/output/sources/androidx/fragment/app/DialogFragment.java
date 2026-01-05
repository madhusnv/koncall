package androidx.fragment.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import p001o.fn3;
import p001o.n9c;
import p001o.qg7;
import p001o.rzi;
import p001o.tzi;
import p001o.uzi;
import p001o.xca;

/* loaded from: classes2.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDismissed;
    private Handler mHandler;
    private boolean mShownByMe;
    private boolean mViewDestroyed;
    private Runnable mDismissRunnable = new RunnableC2072a();
    private DialogInterface.OnCancelListener mOnCancelListener = new DialogInterfaceOnCancelListenerC2073b();
    private DialogInterface.OnDismissListener mOnDismissListener = new DialogInterfaceOnDismissListenerC2074c();
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mCancelable = true;
    private boolean mShowsDialog = true;
    private int mBackStackId = -1;
    private n9c mObserver = new C2075d();
    private boolean mDialogCreated = false;

    /* renamed from: androidx.fragment.app.DialogFragment$a */
    public class RunnableC2072a implements Runnable {
        public RunnableC2072a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogFragment.this.mOnDismissListener.onDismiss(DialogFragment.this.mDialog);
        }
    }

    /* renamed from: androidx.fragment.app.DialogFragment$b */
    public class DialogInterfaceOnCancelListenerC2073b implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC2073b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogFragment.this.mDialog != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onCancel(dialogFragment.mDialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.DialogFragment$c */
    public class DialogInterfaceOnDismissListenerC2074c implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC2074c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogFragment.this.mDialog != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onDismiss(dialogFragment.mDialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.DialogFragment$d */
    public class C2075d implements n9c {
        public C2075d() {
        }

        @Override // p001o.n9c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(xca xcaVar) {
            if (xcaVar == null || !DialogFragment.this.mShowsDialog) {
                return;
            }
            View viewRequireView = DialogFragment.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogFragment.this.mDialog != null) {
                if (FragmentManager.P0(3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DialogFragment ");
                    sb.append(this);
                    sb.append(" setting the content view on ");
                    sb.append(DialogFragment.this.mDialog);
                }
                DialogFragment.this.mDialog.setContentView(viewRequireView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.DialogFragment$e */
    public class C2076e extends qg7 {

        /* renamed from: a */
        public final /* synthetic */ qg7 f7346a;

        public C2076e(qg7 qg7Var) {
            this.f7346a = qg7Var;
        }

        @Override // p001o.qg7
        /* renamed from: c */
        public View mo6142c(int i) {
            return this.f7346a.mo6143d() ? this.f7346a.mo6142c(i) : DialogFragment.this.onFindViewById(i);
        }

        @Override // p001o.qg7
        /* renamed from: d */
        public boolean mo6143d() {
            return this.f7346a.mo6143d() || DialogFragment.this.onHasView();
        }
    }

    public final void F0(boolean z, boolean z2, boolean z3) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z3) {
                getParentFragmentManager().o1(this.mBackStackId, 1);
            } else {
                getParentFragmentManager().l1(this.mBackStackId, 1, z);
            }
            this.mBackStackId = -1;
            return;
        }
        AbstractC2124j abstractC2124jM6205q = getParentFragmentManager().m6205q();
        abstractC2124jM6205q.m6429v(true);
        abstractC2124jM6205q.mo6266o(this);
        if (z3) {
            abstractC2124jM6205q.mo6262j();
        } else if (z) {
            abstractC2124jM6205q.mo6261i();
        } else {
            abstractC2124jM6205q.mo6260h();
        }
    }

    public final void G0(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.mDialog = dialogOnCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(dialogOnCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public qg7 createFragmentContainer() {
        return new C2076e(super.createFragmentContainer());
    }

    public void dismiss() {
        F0(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        F0(true, false, false);
    }

    public void dismissNow() {
        F0(false, false, true);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
        }
        return new fn3(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDismiss called for DialogFragment ");
            sb.append(this);
        }
        F0(true, true, false);
    }

    public View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            G0(bundle);
            if (FragmentManager.P0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("get layout inflater for DialogFragment ");
                sb.append(this);
                sb.append(" from dialog context");
            }
            Dialog dialog = this.mDialog;
            return dialog != null ? layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext()) : layoutInflaterOnGetLayoutInflater;
        }
        if (FragmentManager.P0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.mShowsDialog) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mCreatingDialog = true: ");
                sb2.append(str);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("mShowsDialog = false: ");
                sb3.append(str);
            }
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(SAVED_THEME, i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean(SAVED_CANCELABLE, z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            rzi.m47366b(decorView, this);
            uzi.m52200a(decorView, this);
            tzi.m50817b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final fn3 requireComponentDialog() {
        Dialog dialogRequireDialog = requireDialog();
        if (dialogRequireDialog instanceof fn3) {
            return (fn3) dialogRequireDialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + dialogRequireDialog);
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void setStyle(int i, int i2) {
        if (FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting style and theme for DialogFragment ");
            sb.append(this);
            sb.append(" to ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    public void setupDialog(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        AbstractC2124j abstractC2124jM6205q = fragmentManager.m6205q();
        abstractC2124jM6205q.m6429v(true);
        abstractC2124jM6205q.m6421e(this, str);
        abstractC2124jM6205q.mo6260h();
    }

    public void showNow(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        AbstractC2124j abstractC2124jM6205q = fragmentManager.m6205q();
        abstractC2124jM6205q.m6429v(true);
        abstractC2124jM6205q.m6421e(this, str);
        abstractC2124jM6205q.mo6262j();
    }

    public int show(AbstractC2124j abstractC2124j, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC2124j.m6421e(this, str);
        this.mViewDestroyed = false;
        int iMo6260h = abstractC2124j.mo6260h();
        this.mBackStackId = iMo6260h;
        return iMo6260h;
    }
}
