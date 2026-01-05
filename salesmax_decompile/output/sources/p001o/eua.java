package p001o;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.DialogInterfaceC1782a;
import androidx.recyclerview.widget.RecyclerView;
import com.github.dhaval2404.colorpicker.model.ColorShape;
import com.github.dhaval2404.colorpicker.model.ColorSwatch;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.List;

/* loaded from: classes5.dex */
public final class eua {

    /* renamed from: a */
    public final Context f22170a;

    /* renamed from: b */
    public final String f22171b;

    /* renamed from: c */
    public final String f22172c;

    /* renamed from: d */
    public final String f22173d;

    /* renamed from: e */
    public final sh3 f22174e;

    /* renamed from: f */
    public final String f22175f;

    /* renamed from: g */
    public final ColorSwatch f22176g;

    /* renamed from: h */
    public ColorShape f22177h;

    /* renamed from: i */
    public final List f22178i;

    /* renamed from: j */
    public boolean f22179j;

    /* renamed from: o.eua$a */
    public static final class C13261a {

        /* renamed from: a */
        public final Context f22180a;

        /* renamed from: b */
        public String f22181b;

        /* renamed from: c */
        public String f22182c;

        /* renamed from: d */
        public String f22183d;

        /* renamed from: e */
        public sh3 f22184e;

        /* renamed from: f */
        public String f22185f;

        /* renamed from: g */
        public ColorSwatch f22186g;

        /* renamed from: h */
        public ColorShape f22187h;

        /* renamed from: i */
        public List f22188i;

        /* renamed from: j */
        public boolean f22189j;

        /* renamed from: o.eua$a$a */
        public static final class a implements sh3 {

            /* renamed from: a */
            public final /* synthetic */ nl7 f22190a;

            public a(nl7 nl7Var) {
                this.f22190a = nl7Var;
            }

            @Override // p001o.sh3
            /* renamed from: a */
            public void mo13634a(int i, String str) {
                sq8.m48649h(str, "colorHex");
                this.f22190a.invoke(Integer.valueOf(i), str);
            }
        }

        public C13261a(Context context) {
            sq8.m48649h(context, "context");
            this.f22180a = context;
            String string = context.getString(gae.material_dialog_title);
            sq8.m48648g(string, "context.getString(R.string.material_dialog_title)");
            this.f22181b = string;
            String string2 = context.getString(gae.material_dialog_positive_button);
            sq8.m48648g(string2, "context.getString(R.string.material_dialog_positive_button)");
            this.f22182c = string2;
            String string3 = context.getString(gae.material_dialog_negative_button);
            sq8.m48648g(string3, "context.getString(R.string.material_dialog_negative_button)");
            this.f22183d = string3;
            this.f22186g = ColorSwatch._300;
            this.f22187h = ColorShape.CIRCLE;
        }

        /* renamed from: a */
        public final eua m25620a() {
            return new eua(this.f22180a, this.f22181b, this.f22182c, this.f22183d, this.f22184e, null, this.f22185f, this.f22186g, this.f22187h, this.f22188i, this.f22189j, null);
        }

        /* renamed from: b */
        public final C13261a m25621b(nl7 nl7Var) {
            sq8.m48649h(nl7Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f22184e = new a(nl7Var);
            return this;
        }

        /* renamed from: c */
        public final C13261a m25622c(ColorShape colorShape) {
            sq8.m48649h(colorShape, "colorShape");
            this.f22187h = colorShape;
            return this;
        }

        /* renamed from: d */
        public final C13261a m25623d(ColorSwatch colorSwatch) {
            sq8.m48649h(colorSwatch, "colorSwatch");
            this.f22186g = colorSwatch;
            return this;
        }

        /* renamed from: e */
        public final C13261a m25624e(String str) {
            sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
            this.f22181b = str;
            return this;
        }

        /* renamed from: f */
        public final void m25625f() {
            m25620a().m25619c();
        }
    }

    public /* synthetic */ eua(Context context, String str, String str2, String str3, sh3 sh3Var, xt5 xt5Var, String str4, ColorSwatch colorSwatch, ColorShape colorShape, List list, boolean z, id5 id5Var) {
        this(context, str, str2, str3, sh3Var, xt5Var, str4, colorSwatch, colorShape, list, z);
    }

    /* renamed from: d */
    public static final void m25617d(cua cuaVar, eua euaVar, DialogInterface dialogInterface, int i) {
        sh3 sh3VarM25618b;
        sq8.m48649h(cuaVar, "$adapter");
        sq8.m48649h(euaVar, "this$0");
        String strM21826k = cuaVar.m21826k();
        if (!(!f9g.d0(strM21826k)) || (sh3VarM25618b = euaVar.m25618b()) == null) {
            return;
        }
        sh3VarM25618b.mo13634a(li3.m37263f(strM21826k), strM21826k);
    }

    /* renamed from: b */
    public final sh3 m25618b() {
        return this.f22174e;
    }

    /* renamed from: c */
    public final void m25619c() {
        DialogInterfaceC1782a.a aVarMo3874g = new DialogInterfaceC1782a.a(this.f22170a).setTitle(this.f22171b).mo3874g(this.f22173d, null);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f22170a);
        sq8.m48648g(layoutInflaterFrom, "from(context)");
        View viewInflate = layoutInflaterFrom.inflate(m9e.dialog_material_color_picker, (ViewGroup) null);
        if (viewInflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        aVarMo3874g.setView(viewInflate);
        List listM37265c = this.f22178i;
        if (listM37265c == null) {
            listM37265c = li3.f33873a.m37265c(this.f22170a, this.f22176g.getValue());
        }
        final cua cuaVar = new cua(listM37265c);
        cuaVar.m21829n(this.f22177h);
        cuaVar.m21831p(this.f22179j);
        String str = this.f22175f;
        if (!(str == null || f9g.d0(str))) {
            cuaVar.m21830o(this.f22175f);
        }
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(m8e.materialColorRV);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new FlexboxLayoutManager(this.f22170a));
        recyclerView.setAdapter(cuaVar);
        aVarMo3874g.mo3878k(this.f22172c, new DialogInterface.OnClickListener() { // from class: o.dua
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                eua.m25617d(cuaVar, this, dialogInterface, i);
            }
        });
        DialogInterfaceC1782a dialogInterfaceC1782aCreate = aVarMo3874g.create();
        sq8.m48648g(dialogInterfaceC1782aCreate, "dialog.create()");
        dialogInterfaceC1782aCreate.show();
        yr5.m58132a(dialogInterfaceC1782aCreate);
    }

    public eua(Context context, String str, String str2, String str3, sh3 sh3Var, xt5 xt5Var, String str4, ColorSwatch colorSwatch, ColorShape colorShape, List list, boolean z) {
        this.f22170a = context;
        this.f22171b = str;
        this.f22172c = str2;
        this.f22173d = str3;
        this.f22174e = sh3Var;
        this.f22175f = str4;
        this.f22176g = colorSwatch;
        this.f22177h = colorShape;
        this.f22178i = list;
        this.f22179j = z;
    }
}
