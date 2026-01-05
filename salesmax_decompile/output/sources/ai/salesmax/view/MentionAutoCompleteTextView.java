package ai.salesmax.view;

import ai.salesmax.model.CommentSummary;
import ai.salesmax.model.LeadsUser;
import ai.salesmax.view.MentionAutoCompleteTextView;
import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p001o.c64;
import p001o.ck6;
import p001o.e9g;
import p001o.f9g;
import p001o.gh3;
import p001o.n11;
import p001o.nr1;
import p001o.ot3;
import p001o.p9e;
import p001o.sq8;
import p001o.uk3;
import p001o.wi0;

/* loaded from: classes2.dex */
public final class MentionAutoCompleteTextView extends MaterialAutoCompleteTextView {

    /* renamed from: H */
    public int f5037H;

    /* renamed from: L */
    public CommentSummary f5038L;

    /* renamed from: M */
    public List f5039M;

    /* renamed from: Q */
    public final List f5040Q;
    public int h0;
    public String i0;
    public ck6 j0;

    /* renamed from: ai.salesmax.view.MentionAutoCompleteTextView$a */
    public interface InterfaceC1672a {
        /* renamed from: a */
        void mo2927a(String str, CommentSummary commentSummary);
    }

    /* renamed from: ai.salesmax.view.MentionAutoCompleteTextView$b */
    public static final class C1673b implements ck6 {
        public C1673b() {
        }

        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            return ck6.C12696a.m21336b(this, view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            sq8.m48649h(view, "view");
            MentionAutoCompleteTextView.this.dismissDropDown();
            LeadsUser leadsUser = (LeadsUser) MentionAutoCompleteTextView.this.getUserList().get(i);
            if (leadsUser.getId() != null) {
                MentionAutoCompleteTextView mentionAutoCompleteTextView = MentionAutoCompleteTextView.this;
                mentionAutoCompleteTextView.setLastIndexOfAt(f9g.g0(mentionAutoCompleteTextView.i0, '@', 0, false, 6, null));
                if (MentionAutoCompleteTextView.this.getLastIndexOfAt() != -1) {
                    String id = leadsUser.getId();
                    sq8.m48646e(id);
                    MentionAutoCompleteTextView.this.f5039M.add(new CommentSummary.MentionedEntity(id, "USER"));
                    String strSubstring = e9g.m24593G(MentionAutoCompleteTextView.this.i0, "\n", " ", false, 4, null).substring(MentionAutoCompleteTextView.this.getLastIndexOfAt());
                    sq8.m48648g(strSubstring, "substring(...)");
                    String strM24593G = e9g.m24593G(MentionAutoCompleteTextView.this.i0, strSubstring, "", false, 4, null);
                    MentionAutoCompleteTextView.this.setText(strM24593G + " " + leadsUser.getName());
                }
            }
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: ai.salesmax.view.MentionAutoCompleteTextView$c */
    public static final class C1674c implements TextWatcher {

        /* renamed from: b */
        public final /* synthetic */ TextInputLayout f5043b;

        public C1674c(TextInputLayout textInputLayout) {
            this.f5043b = textInputLayout;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            MentionAutoCompleteTextView.this.h0 = (editable == null || !(f9g.d0(f9g.Z0(editable.toString()).toString()) ^ true)) ? ot3.m42647c() : ot3.m42648d();
            this.f5043b.setEndIconDrawable(c64.getDrawable(MentionAutoCompleteTextView.this.getContext(), MentionAutoCompleteTextView.this.h0));
            String string = f9g.Z0(String.valueOf(editable)).toString();
            if (!sq8.m48644c(MentionAutoCompleteTextView.this.i0, string)) {
                MentionAutoCompleteTextView.this.i0 = string;
                MentionAutoCompleteTextView mentionAutoCompleteTextView = MentionAutoCompleteTextView.this;
                mentionAutoCompleteTextView.setText(mentionAutoCompleteTextView.i0);
            }
            if (editable != null) {
                MentionAutoCompleteTextView mentionAutoCompleteTextView2 = MentionAutoCompleteTextView.this;
                mentionAutoCompleteTextView2.m3366v(mentionAutoCompleteTextView2.i0);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ai.salesmax.view.MentionAutoCompleteTextView$d */
    public static final class C1675d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return uk3.m51674d(((LeadsUser) obj).getName(), ((LeadsUser) obj2).getName());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MentionAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48646e(context);
        this.f5037H = -1;
        this.f5038L = new CommentSummary(null, 1, null);
        this.f5039M = new ArrayList();
        this.f5040Q = wi0.m54448N("");
        this.h0 = ot3.m42648d();
        this.i0 = "";
        this.j0 = new C1673b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<LeadsUser> getUserList() {
        return this.f5040Q;
    }

    /* renamed from: t */
    public static final void m3363t(MentionAutoCompleteTextView mentionAutoCompleteTextView, InterfaceC1672a interfaceC1672a, View view) {
        Object next;
        sq8.m48649h(mentionAutoCompleteTextView, "this$0");
        sq8.m48649h(interfaceC1672a, "$listener");
        String string = f9g.Z0(mentionAutoCompleteTextView.getText().toString()).toString();
        if (!f9g.d0(string)) {
            mentionAutoCompleteTextView.setText("");
            mentionAutoCompleteTextView.dismissDropDown();
            int size = mentionAutoCompleteTextView.f5039M.size();
            for (int i = 0; i < size; i++) {
                Iterator it = mentionAutoCompleteTextView.f5040Q.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (sq8.m48644c(((LeadsUser) next).getId(), ((CommentSummary.MentionedEntity) mentionAutoCompleteTextView.f5039M.get(0)).getEntityID())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                LeadsUser leadsUser = (LeadsUser) next;
                if (leadsUser == null || !f9g.m26304N(string, leadsUser.getName(), true)) {
                    mentionAutoCompleteTextView.f5039M.remove(0);
                }
            }
            if (!mentionAutoCompleteTextView.f5039M.isEmpty()) {
                mentionAutoCompleteTextView.f5038L.setMentionedEntities(mentionAutoCompleteTextView.f5039M);
            }
            interfaceC1672a.mo2927a(string, mentionAutoCompleteTextView.f5038L);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public boolean enoughToFilter() {
        return true;
    }

    public final ck6 getClickListener() {
        return this.j0;
    }

    public final int getLastIndexOfAt() {
        return this.f5037H;
    }

    public final List<LeadsUser> getList() {
        return this.f5040Q;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    /* renamed from: s */
    public final void m3364s(TextInputLayout textInputLayout, final InterfaceC1672a interfaceC1672a) {
        sq8.m48649h(textInputLayout, "taskCommentTextInputLayout");
        sq8.m48649h(interfaceC1672a, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        addTextChangedListener(new C1674c(textInputLayout));
        textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: o.lab
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MentionAutoCompleteTextView.m3363t(this.f33532a, interfaceC1672a, view);
            }
        });
    }

    public final void setClickListener(ck6 ck6Var) {
        sq8.m48649h(ck6Var, "<set-?>");
        this.j0 = ck6Var;
    }

    public final void setLastIndexOfAt(int i) {
        this.f5037H = i;
    }

    public final void setText(String str) {
        sq8.m48649h(str, "text");
        List list = this.f5039M;
        sq8.m48647f(list, "null cannot be cast to non-null type java.util.ArrayList<ai.salesmax.model.CommentSummary.MentionedEntity>{ kotlin.collections.TypeAliasesKt.ArrayList<ai.salesmax.model.CommentSummary.MentionedEntity> }");
        nr1.m40954Y(this, str, (ArrayList) list);
        setSelection(f9g.Z0(getText().toString()).toString().length());
    }

    /* renamed from: u */
    public final void m3365u() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (getAdapter() == null) {
            List list = this.f5040Q;
            if (list.size() > 1) {
                gh3.m28657z(list, new C1675d());
            }
            Context context = getContext();
            sq8.m48648g(context, "getContext(...)");
            int i = p9e.item_lead_user;
            List list2 = this.f5040Q;
            sq8.m48647f(list2, "null cannot be cast to non-null type java.util.ArrayList<ai.salesmax.model.LeadsUser>{ kotlin.collections.TypeAliasesKt.ArrayList<ai.salesmax.model.LeadsUser> }");
            setAdapter(new n11(context, i, (ArrayList) list2, this.j0));
        }
        showDropDown();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
    
        if (p001o.f9g.m26306P(r3, "/n", false, 2, null) == false) goto L42;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3366v(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(str, "text");
        if (!(str.length() > 0)) {
            dismissDropDown();
            return;
        }
        int iG0 = f9g.g0(str, '@', 0, false, 6, null);
        this.f5037H = iG0;
        if (iG0 == -1) {
            dismissDropDown();
            return;
        }
        String strM24593G = e9g.m24593G(str, "\n", " ", false, 4, null);
        int iG02 = f9g.g0(strM24593G, '@', 0, false, 6, null);
        String strSubstring = strM24593G.substring(this.f5037H);
        sq8.m48648g(strSubstring, "substring(...)");
        if (iG02 != 0) {
            if (strM24593G.charAt(iG02 - 1) == ' ') {
                if (!(strSubstring.length() == 0)) {
                    int length = strSubstring.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean z2 = sq8.m48651j(strSubstring.charAt(!z ? i : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    if (strSubstring.subSequence(i, length + 1).toString().length() > 0) {
                        if (!f9g.m26306P(strSubstring, "@[", false, 2, null)) {
                        }
                    }
                }
            }
            dismissDropDown();
            return;
        }
        m3365u();
        String strSubstring2 = strSubstring.substring(1);
        sq8.m48648g(strSubstring2, "substring(...)");
        int length2 = strSubstring2.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length2) {
            boolean z4 = sq8.m48651j(strSubstring2.charAt(!z3 ? i2 : length2), 32) <= 0;
            if (z3) {
                if (!z4) {
                    break;
                } else {
                    length2--;
                }
            } else if (z4) {
                i2++;
            } else {
                z3 = true;
            }
        }
        performFiltering(strSubstring2.subSequence(i2, length2 + 1).toString(), 0);
    }
}
