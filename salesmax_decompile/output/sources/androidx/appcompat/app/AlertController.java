package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import org.objectweb.asm.Opcodes;
import p001o.bbe;
import p001o.dk0;
import p001o.r8e;
import p001o.wvi;
import p001o.z5e;

/* loaded from: classes2.dex */
public class AlertController {

    /* renamed from: A */
    public NestedScrollView f5277A;

    /* renamed from: C */
    public Drawable f5279C;

    /* renamed from: D */
    public ImageView f5280D;

    /* renamed from: E */
    public TextView f5281E;

    /* renamed from: F */
    public TextView f5282F;

    /* renamed from: G */
    public View f5283G;

    /* renamed from: H */
    public ListAdapter f5284H;

    /* renamed from: J */
    public int f5286J;

    /* renamed from: K */
    public int f5287K;

    /* renamed from: L */
    public int f5288L;

    /* renamed from: M */
    public int f5289M;

    /* renamed from: N */
    public int f5290N;

    /* renamed from: O */
    public int f5291O;

    /* renamed from: P */
    public boolean f5292P;

    /* renamed from: R */
    public Handler f5294R;

    /* renamed from: a */
    public final Context f5296a;

    /* renamed from: b */
    public final dk0 f5297b;

    /* renamed from: c */
    public final Window f5298c;

    /* renamed from: d */
    public final int f5299d;

    /* renamed from: e */
    public CharSequence f5300e;

    /* renamed from: f */
    public CharSequence f5301f;

    /* renamed from: g */
    public ListView f5302g;

    /* renamed from: h */
    public View f5303h;

    /* renamed from: i */
    public int f5304i;

    /* renamed from: j */
    public int f5305j;

    /* renamed from: k */
    public int f5306k;

    /* renamed from: l */
    public int f5307l;

    /* renamed from: m */
    public int f5308m;

    /* renamed from: o */
    public Button f5310o;

    /* renamed from: p */
    public CharSequence f5311p;

    /* renamed from: q */
    public Message f5312q;

    /* renamed from: r */
    public Drawable f5313r;

    /* renamed from: s */
    public Button f5314s;

    /* renamed from: t */
    public CharSequence f5315t;

    /* renamed from: u */
    public Message f5316u;

    /* renamed from: v */
    public Drawable f5317v;

    /* renamed from: w */
    public Button f5318w;

    /* renamed from: x */
    public CharSequence f5319x;

    /* renamed from: y */
    public Message f5320y;

    /* renamed from: z */
    public Drawable f5321z;

    /* renamed from: n */
    public boolean f5309n = false;

    /* renamed from: B */
    public int f5278B = 0;

    /* renamed from: I */
    public int f5285I = -1;

    /* renamed from: Q */
    public int f5293Q = 0;

    /* renamed from: S */
    public final View.OnClickListener f5295S = new ViewOnClickListenerC1755a();

    public static class RecycleListView extends ListView {

        /* renamed from: a */
        public final int f5322a;

        /* renamed from: b */
        public final int f5323b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void setHasDecor(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f5322a, getPaddingRight(), z2 ? getPaddingBottom() : this.f5323b);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bbe.RecycleListView);
            this.f5323b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(bbe.RecycleListView_paddingBottomNoButtons, -1);
            this.f5322a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(bbe.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public class ViewOnClickListenerC1755a implements View.OnClickListener {
        public ViewOnClickListenerC1755a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f5310o || (message3 = alertController.f5312q) == null) ? (view != alertController.f5314s || (message2 = alertController.f5316u) == null) ? (view != alertController.f5318w || (message = alertController.f5320y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f5294R.obtainMessage(1, alertController2.f5297b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public static class C1756b {

        /* renamed from: A */
        public int f5325A;

        /* renamed from: B */
        public int f5326B;

        /* renamed from: C */
        public int f5327C;

        /* renamed from: D */
        public int f5328D;

        /* renamed from: F */
        public boolean[] f5330F;

        /* renamed from: G */
        public boolean f5331G;

        /* renamed from: H */
        public boolean f5332H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f5334J;

        /* renamed from: K */
        public Cursor f5335K;

        /* renamed from: L */
        public String f5336L;

        /* renamed from: M */
        public String f5337M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f5338N;

        /* renamed from: a */
        public final Context f5340a;

        /* renamed from: b */
        public final LayoutInflater f5341b;

        /* renamed from: d */
        public Drawable f5343d;

        /* renamed from: f */
        public CharSequence f5345f;

        /* renamed from: g */
        public View f5346g;

        /* renamed from: h */
        public CharSequence f5347h;

        /* renamed from: i */
        public CharSequence f5348i;

        /* renamed from: j */
        public Drawable f5349j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f5350k;

        /* renamed from: l */
        public CharSequence f5351l;

        /* renamed from: m */
        public Drawable f5352m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f5353n;

        /* renamed from: o */
        public CharSequence f5354o;

        /* renamed from: p */
        public Drawable f5355p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f5356q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f5358s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f5359t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f5360u;

        /* renamed from: v */
        public CharSequence[] f5361v;

        /* renamed from: w */
        public ListAdapter f5362w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f5363x;

        /* renamed from: y */
        public int f5364y;

        /* renamed from: z */
        public View f5365z;

        /* renamed from: c */
        public int f5342c = 0;

        /* renamed from: e */
        public int f5344e = 0;

        /* renamed from: E */
        public boolean f5329E = false;

        /* renamed from: I */
        public int f5333I = -1;

        /* renamed from: O */
        public boolean f5339O = true;

        /* renamed from: r */
        public boolean f5357r = true;

        /* renamed from: androidx.appcompat.app.AlertController$b$a */
        public class a extends ArrayAdapter {

            /* renamed from: a */
            public final /* synthetic */ RecycleListView f5366a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f5366a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C1756b.this.f5330F;
                if (zArr != null && zArr[i]) {
                    this.f5366a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b */
        public class b extends CursorAdapter {

            /* renamed from: a */
            public final int f5368a;

            /* renamed from: b */
            public final int f5369b;

            /* renamed from: c */
            public final /* synthetic */ RecycleListView f5370c;

            /* renamed from: d */
            public final /* synthetic */ AlertController f5371d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f5370c = recycleListView;
                this.f5371d = alertController;
                Cursor cursor2 = getCursor();
                this.f5368a = cursor2.getColumnIndexOrThrow(C1756b.this.f5336L);
                this.f5369b = cursor2.getColumnIndexOrThrow(C1756b.this.f5337M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f5368a));
                this.f5370c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f5369b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C1756b.this.f5341b.inflate(this.f5371d.f5289M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$c */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ AlertController f5373a;

            public c(AlertController alertController) {
                this.f5373a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                C1756b.this.f5363x.onClick(this.f5373a.f5297b, i);
                if (C1756b.this.f5332H) {
                    return;
                }
                this.f5373a.f5297b.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$d */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ RecycleListView f5375a;

            /* renamed from: b */
            public final /* synthetic */ AlertController f5376b;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f5375a = recycleListView;
                this.f5376b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                boolean[] zArr = C1756b.this.f5330F;
                if (zArr != null) {
                    zArr[i] = this.f5375a.isItemChecked(i);
                }
                C1756b.this.f5334J.onClick(this.f5376b.f5297b, i, this.f5375a.isItemChecked(i));
            }
        }

        public C1756b(Context context) {
            this.f5340a = context;
            this.f5341b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public void m3783a(AlertController alertController) {
            View view = this.f5346g;
            if (view != null) {
                alertController.m3769l(view);
            } else {
                CharSequence charSequence = this.f5345f;
                if (charSequence != null) {
                    alertController.m3774q(charSequence);
                }
                Drawable drawable = this.f5343d;
                if (drawable != null) {
                    alertController.m3771n(drawable);
                }
                int i = this.f5342c;
                if (i != 0) {
                    alertController.m3770m(i);
                }
                int i2 = this.f5344e;
                if (i2 != 0) {
                    alertController.m3770m(alertController.m3761d(i2));
                }
            }
            CharSequence charSequence2 = this.f5347h;
            if (charSequence2 != null) {
                alertController.m3772o(charSequence2);
            }
            CharSequence charSequence3 = this.f5348i;
            if (charSequence3 != null || this.f5349j != null) {
                alertController.m3768k(-1, charSequence3, this.f5350k, null, this.f5349j);
            }
            CharSequence charSequence4 = this.f5351l;
            if (charSequence4 != null || this.f5352m != null) {
                alertController.m3768k(-2, charSequence4, this.f5353n, null, this.f5352m);
            }
            CharSequence charSequence5 = this.f5354o;
            if (charSequence5 != null || this.f5355p != null) {
                alertController.m3768k(-3, charSequence5, this.f5356q, null, this.f5355p);
            }
            if (this.f5361v != null || this.f5335K != null || this.f5362w != null) {
                m3784b(alertController);
            }
            View view2 = this.f5365z;
            if (view2 != null) {
                if (this.f5329E) {
                    alertController.m3777t(view2, this.f5325A, this.f5326B, this.f5327C, this.f5328D);
                    return;
                } else {
                    alertController.m3776s(view2);
                    return;
                }
            }
            int i3 = this.f5364y;
            if (i3 != 0) {
                alertController.m3775r(i3);
            }
        }

        /* renamed from: b */
        public final void m3784b(AlertController alertController) {
            ListAdapter c1758d;
            RecycleListView recycleListView = (RecycleListView) this.f5341b.inflate(alertController.f5288L, (ViewGroup) null);
            if (this.f5331G) {
                c1758d = this.f5335K == null ? new a(this.f5340a, alertController.f5289M, R.id.text1, this.f5361v, recycleListView) : new b(this.f5340a, this.f5335K, false, recycleListView, alertController);
            } else {
                int i = this.f5332H ? alertController.f5290N : alertController.f5291O;
                if (this.f5335K != null) {
                    c1758d = new SimpleCursorAdapter(this.f5340a, i, this.f5335K, new String[]{this.f5336L}, new int[]{R.id.text1});
                } else {
                    c1758d = this.f5362w;
                    if (c1758d == null) {
                        c1758d = new C1758d(this.f5340a, i, R.id.text1, this.f5361v);
                    }
                }
            }
            alertController.f5284H = c1758d;
            alertController.f5285I = this.f5333I;
            if (this.f5363x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.f5334J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f5338N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f5332H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f5331G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f5302g = recycleListView;
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    public static final class HandlerC1757c extends Handler {

        /* renamed from: a */
        public WeakReference f5378a;

        public HandlerC1757c(DialogInterface dialogInterface) {
            this.f5378a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f5378a.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    public static class C1758d extends ArrayAdapter {
        public C1758d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, dk0 dk0Var, Window window) {
        this.f5296a = context;
        this.f5297b = dk0Var;
        this.f5298c = window;
        this.f5294R = new HandlerC1757c(dk0Var);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, bbe.AlertDialog, z5e.alertDialogStyle, 0);
        this.f5286J = typedArrayObtainStyledAttributes.getResourceId(bbe.AlertDialog_android_layout, 0);
        this.f5287K = typedArrayObtainStyledAttributes.getResourceId(bbe.AlertDialog_buttonPanelSideLayout, 0);
        this.f5288L = typedArrayObtainStyledAttributes.getResourceId(bbe.AlertDialog_listLayout, 0);
        this.f5289M = typedArrayObtainStyledAttributes.getResourceId(bbe.AlertDialog_multiChoiceItemLayout, 0);
        this.f5290N = typedArrayObtainStyledAttributes.getResourceId(bbe.AlertDialog_singleChoiceItemLayout, 0);
        this.f5291O = typedArrayObtainStyledAttributes.getResourceId(bbe.AlertDialog_listItemLayout, 0);
        this.f5292P = typedArrayObtainStyledAttributes.getBoolean(bbe.AlertDialog_showTitle, true);
        this.f5299d = typedArrayObtainStyledAttributes.getDimensionPixelSize(bbe.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        dk0Var.supportRequestWindowFeature(1);
    }

    /* renamed from: a */
    public static boolean m3757a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m3757a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public static boolean m3758z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(z5e.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: b */
    public final void m3759b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public Button m3760c(int i) {
        if (i == -3) {
            return this.f5318w;
        }
        if (i == -2) {
            return this.f5314s;
        }
        if (i != -1) {
            return null;
        }
        return this.f5310o;
    }

    /* renamed from: d */
    public int m3761d(int i) {
        TypedValue typedValue = new TypedValue();
        this.f5296a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView m3762e() {
        return this.f5302g;
    }

    /* renamed from: f */
    public void m3763f() {
        this.f5297b.setContentView(m3767j());
        m3782y();
    }

    /* renamed from: g */
    public boolean m3764g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f5277A;
        return nestedScrollView != null && nestedScrollView.m5928t(keyEvent);
    }

    /* renamed from: h */
    public boolean m3765h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f5277A;
        return nestedScrollView != null && nestedScrollView.m5928t(keyEvent);
    }

    /* renamed from: i */
    public final ViewGroup m3766i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: j */
    public final int m3767j() {
        int i = this.f5287K;
        return i == 0 ? this.f5286J : this.f5293Q == 1 ? i : this.f5286J;
    }

    /* renamed from: k */
    public void m3768k(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f5294R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f5319x = charSequence;
            this.f5320y = message;
            this.f5321z = drawable;
        } else if (i == -2) {
            this.f5315t = charSequence;
            this.f5316u = message;
            this.f5317v = drawable;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f5311p = charSequence;
            this.f5312q = message;
            this.f5313r = drawable;
        }
    }

    /* renamed from: l */
    public void m3769l(View view) {
        this.f5283G = view;
    }

    /* renamed from: m */
    public void m3770m(int i) {
        this.f5279C = null;
        this.f5278B = i;
        ImageView imageView = this.f5280D;
        if (imageView != null) {
            if (i == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f5280D.setImageResource(this.f5278B);
            }
        }
    }

    /* renamed from: n */
    public void m3771n(Drawable drawable) {
        this.f5279C = drawable;
        this.f5278B = 0;
        ImageView imageView = this.f5280D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f5280D.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: o */
    public void m3772o(CharSequence charSequence) {
        this.f5301f = charSequence;
        TextView textView = this.f5282F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: p */
    public final void m3773p(ViewGroup viewGroup, View view, int i, int i2) {
        View viewFindViewById = this.f5298c.findViewById(r8e.scrollIndicatorUp);
        View viewFindViewById2 = this.f5298c.findViewById(r8e.scrollIndicatorDown);
        wvi.A0(view, i, i2);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    /* renamed from: q */
    public void m3774q(CharSequence charSequence) {
        this.f5300e = charSequence;
        TextView textView = this.f5281E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void m3775r(int i) {
        this.f5303h = null;
        this.f5304i = i;
        this.f5309n = false;
    }

    /* renamed from: s */
    public void m3776s(View view) {
        this.f5303h = view;
        this.f5304i = 0;
        this.f5309n = false;
    }

    /* renamed from: t */
    public void m3777t(View view, int i, int i2, int i3, int i4) {
        this.f5303h = view;
        this.f5304i = 0;
        this.f5309n = true;
        this.f5305j = i;
        this.f5306k = i2;
        this.f5307l = i3;
        this.f5308m = i4;
    }

    /* renamed from: u */
    public final void m3778u(ViewGroup viewGroup) {
        int i;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f5310o = button;
        button.setOnClickListener(this.f5295S);
        if (TextUtils.isEmpty(this.f5311p) && this.f5313r == null) {
            this.f5310o.setVisibility(8);
            i = 0;
        } else {
            this.f5310o.setText(this.f5311p);
            Drawable drawable = this.f5313r;
            if (drawable != null) {
                int i2 = this.f5299d;
                drawable.setBounds(0, 0, i2, i2);
                this.f5310o.setCompoundDrawables(this.f5313r, null, null, null);
            }
            this.f5310o.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f5314s = button2;
        button2.setOnClickListener(this.f5295S);
        if (TextUtils.isEmpty(this.f5315t) && this.f5317v == null) {
            this.f5314s.setVisibility(8);
        } else {
            this.f5314s.setText(this.f5315t);
            Drawable drawable2 = this.f5317v;
            if (drawable2 != null) {
                int i3 = this.f5299d;
                drawable2.setBounds(0, 0, i3, i3);
                this.f5314s.setCompoundDrawables(this.f5317v, null, null, null);
            }
            this.f5314s.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f5318w = button3;
        button3.setOnClickListener(this.f5295S);
        if (TextUtils.isEmpty(this.f5319x) && this.f5321z == null) {
            this.f5318w.setVisibility(8);
        } else {
            this.f5318w.setText(this.f5319x);
            Drawable drawable3 = this.f5321z;
            if (drawable3 != null) {
                int i4 = this.f5299d;
                drawable3.setBounds(0, 0, i4, i4);
                this.f5318w.setCompoundDrawables(this.f5321z, null, null, null);
            }
            this.f5318w.setVisibility(0);
            i |= 4;
        }
        if (m3758z(this.f5296a)) {
            if (i == 1) {
                m3759b(this.f5310o);
            } else if (i == 2) {
                m3759b(this.f5314s);
            } else if (i == 4) {
                m3759b(this.f5318w);
            }
        }
        if (i != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: v */
    public final void m3779v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f5298c.findViewById(r8e.scrollView);
        this.f5277A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f5277A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f5282F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f5301f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f5277A.removeView(this.f5282F);
        if (this.f5302g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f5277A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f5277A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f5302g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: w */
    public final void m3780w(ViewGroup viewGroup) {
        View viewInflate = this.f5303h;
        if (viewInflate == null) {
            viewInflate = this.f5304i != 0 ? LayoutInflater.from(this.f5296a).inflate(this.f5304i, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !m3757a(viewInflate)) {
            this.f5298c.setFlags(Opcodes.ACC_DEPRECATED, Opcodes.ACC_DEPRECATED);
        }
        if (!z) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f5298c.findViewById(r8e.custom);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f5309n) {
            frameLayout.setPadding(this.f5305j, this.f5306k, this.f5307l, this.f5308m);
        }
        if (this.f5302g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    /* renamed from: x */
    public final void m3781x(ViewGroup viewGroup) {
        if (this.f5283G != null) {
            viewGroup.addView(this.f5283G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f5298c.findViewById(r8e.title_template).setVisibility(8);
            return;
        }
        this.f5280D = (ImageView) this.f5298c.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.f5300e)) || !this.f5292P) {
            this.f5298c.findViewById(r8e.title_template).setVisibility(8);
            this.f5280D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f5298c.findViewById(r8e.alertTitle);
        this.f5281E = textView;
        textView.setText(this.f5300e);
        int i = this.f5278B;
        if (i != 0) {
            this.f5280D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f5279C;
        if (drawable != null) {
            this.f5280D.setImageDrawable(drawable);
        } else {
            this.f5281E.setPadding(this.f5280D.getPaddingLeft(), this.f5280D.getPaddingTop(), this.f5280D.getPaddingRight(), this.f5280D.getPaddingBottom());
            this.f5280D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public final void m3782y() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f5298c.findViewById(r8e.parentPanel);
        View viewFindViewById4 = viewFindViewById3.findViewById(r8e.topPanel);
        View viewFindViewById5 = viewFindViewById3.findViewById(r8e.contentPanel);
        View viewFindViewById6 = viewFindViewById3.findViewById(r8e.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(r8e.customPanel);
        m3780w(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(r8e.topPanel);
        View viewFindViewById8 = viewGroup.findViewById(r8e.contentPanel);
        View viewFindViewById9 = viewGroup.findViewById(r8e.buttonPanel);
        ViewGroup viewGroupM3766i = m3766i(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM3766i2 = m3766i(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupM3766i3 = m3766i(viewFindViewById9, viewFindViewById6);
        m3779v(viewGroupM3766i2);
        m3778u(viewGroupM3766i3);
        m3781x(viewGroupM3766i);
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (viewGroupM3766i == null || viewGroupM3766i.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (viewGroupM3766i3 == null || viewGroupM3766i3.getVisibility() == 8) ? false : true;
        if (!z3 && viewGroupM3766i2 != null && (viewFindViewById2 = viewGroupM3766i2.findViewById(r8e.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z2 != 0) {
            NestedScrollView nestedScrollView = this.f5277A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f5301f == null && this.f5302g == null) ? null : viewGroupM3766i.findViewById(r8e.titleDividerNoCustom);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupM3766i2 != null && (viewFindViewById = viewGroupM3766i2.findViewById(r8e.textSpacerNoTitle)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f5302g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).setHasDecor(z2, z3);
        }
        if (!z) {
            View view = this.f5302g;
            if (view == null) {
                view = this.f5277A;
            }
            if (view != null) {
                m3773p(viewGroupM3766i2, view, z2 | (z3 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f5302g;
        if (listView2 == null || (listAdapter = this.f5284H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i = this.f5285I;
        if (i > -1) {
            listView2.setItemChecked(i, true);
            listView2.setSelection(i);
        }
    }
}
