package p001o;

import ai.salesmax.custom.PropertyDefinitionRepository;
import ai.salesmax.model.ActionInteractive;
import ai.salesmax.model.Activities;
import ai.salesmax.model.AttendanceInfo;
import ai.salesmax.model.AutoCompleteListModel;
import ai.salesmax.model.CallLogs;
import ai.salesmax.model.CallOutcome;
import ai.salesmax.model.ChatChannel;
import ai.salesmax.model.ChatMessages;
import ai.salesmax.model.CommentSummary;
import ai.salesmax.model.DealStageDefinition;
import ai.salesmax.model.FileData;
import ai.salesmax.model.FormField;
import ai.salesmax.model.IntegrationList;
import ai.salesmax.model.LeadInteractionsSummary;
import ai.salesmax.model.LeadTeamMember;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsDeal;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.LeadsUser;
import ai.salesmax.model.LocationObject;
import ai.salesmax.model.OpenTaskDetail;
import ai.salesmax.model.PaymentDataInfo;
import ai.salesmax.model.PaymentDetail;
import ai.salesmax.model.PropertyDefinition;
import ai.salesmax.model.PropertyOptions;
import ai.salesmax.model.RecentAction;
import ai.salesmax.model.Tasks;
import ai.salesmax.model.Template;
import ai.salesmax.model.TemplateComponent;
import ai.salesmax.model.TemplateVariable;
import ai.salesmax.model.UserContactDetail;
import ai.salesmax.model.VariableMapEntry;
import ai.salesmax.model.VideoMeeting;
import ai.salesmax.model.VisitOutcome;
import ai.salesmax.model.WaBody;
import ai.salesmax.model.WaFooter;
import ai.salesmax.model.WaHeader;
import ai.salesmax.model.WhatsAppTemplates;
import ai.salesmax.services.model.ActivityMetrics;
import ai.salesmax.view.ViewProfileData;
import ai.salesmax.view.ViewProgressCard;
import ai.salesmax.view.ViewProgressCard2;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.format.DateUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Patterns;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.AbstractC2333d;
import androidx.navigation.AbstractC2341h;
import androidx.work.PeriodicWorkRequest;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.datastore.generated.model.AccountType;
import com.amplifyframework.datastore.generated.model.EngagementStatus;
import com.amplifyframework.datastore.generated.model.User;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.ortiz.touchview.TouchImageView;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import j$.time.format.FormatStyle;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.util.DesugarDate;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import nl.dionsegijn.konfetti.xml.KonfettiView;
import org.apache.http.HttpHost;
import org.json.JSONArray;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import p000.C2674b;
import p001o.ck6;
import p001o.nr1;
import p001o.sed;
import p001o.vre;
import type.CallDirection;

/* loaded from: classes.dex */
public abstract class nr1 {

    /* renamed from: a */
    public static final DateTimeFormatter f37184a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.UK).withZone(ZoneId.systemDefault());

    /* renamed from: o.nr1$a */
    public /* synthetic */ class C15629a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37185a;

        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountType.TEAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountType.TEAM_TRIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37185a = iArr;
        }
    }

    /* renamed from: o.nr1$b */
    public static final class C15630b implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ AutoCompleteTextView f37186a;

        /* renamed from: b */
        public final /* synthetic */ TemplateVariable f37187b;

        /* renamed from: c */
        public final /* synthetic */ ck6 f37188c;

        public C15630b(AutoCompleteTextView autoCompleteTextView, TemplateVariable templateVariable, ck6 ck6Var) {
            this.f37186a = autoCompleteTextView;
            this.f37187b = templateVariable;
            this.f37188c = ck6Var;
        }

        /* renamed from: d */
        public static final void m40984d(AutoCompleteTextView autoCompleteTextView, String str) {
            sq8.m48649h(str, "$selectedItem");
            autoCompleteTextView.setText((CharSequence) str, false);
        }

        /* renamed from: e */
        public static final void m40985e(AutoCompleteTextView autoCompleteTextView, ck6 ck6Var, TemplateVariable templateVariable, AdapterView adapterView, View view, int i, long j) {
            autoCompleteTextView.getLayoutParams().width = -2;
            autoCompleteTextView.setMinWidth(0);
            autoCompleteTextView.setMinimumWidth(0);
            autoCompleteTextView.requestLayout();
            autoCompleteTextView.requestApplyInsets();
            if (ck6Var != null) {
                ck6Var.mo708b(autoCompleteTextView, i, templateVariable);
            }
        }

        @Override // p001o.gu3
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void accept(List list) {
            sq8.m48649h(list, "it");
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((VariableMapEntry) it.next()).getValue());
            }
            Context context = this.f37186a.getContext();
            sq8.m48648g(context, "getContext(...)");
            this.f37186a.setAdapter(new C2674b(context, R.layout.simple_spinner_dropdown_item, arrayList.toArray(new String[0])));
            if (this.f37187b.getMappedObject().length() > 0) {
                if (this.f37187b.getMappedProperty().length() > 0) {
                    List<VariableMapEntry> variableMap = this.f37187b.getVariableMap();
                    TemplateVariable templateVariable = this.f37187b;
                    Iterator<VariableMapEntry> it2 = variableMap.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                            break;
                        }
                        VariableMapEntry next = it2.next();
                        if (sq8.m48644c(next.getObject(), templateVariable.getMappedObject()) && sq8.m48644c(next.getKey(), templateVariable.getMappedProperty())) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i != -1) {
                        final String str = (String) arrayList.get(i);
                        final AutoCompleteTextView autoCompleteTextView = this.f37186a;
                        autoCompleteTextView.postDelayed(new Runnable() { // from class: o.or1
                            @Override // java.lang.Runnable
                            public final void run() {
                                nr1.C15630b.m40984d(autoCompleteTextView, str);
                            }
                        }, 10L);
                    }
                }
            }
            final AutoCompleteTextView autoCompleteTextView2 = this.f37186a;
            final ck6 ck6Var = this.f37188c;
            final TemplateVariable templateVariable2 = this.f37187b;
            autoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.pr1
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                    nr1.C15630b.m40985e(autoCompleteTextView2, ck6Var, templateVariable2, adapterView, view, i2, j);
                }
            });
            if (arrayList.size() > 1) {
                this.f37186a.setVisibility(0);
            } else {
                this.f37186a.setVisibility(8);
            }
        }
    }

    /* renamed from: o.nr1$c */
    public static final class C15631c implements gu3 {

        /* renamed from: a */
        public static final C15631c f37189a = new C15631c();

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
        }
    }

    /* renamed from: o.nr1$d */
    public static final class C15632d implements ck6 {
        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            return ck6.C12696a.m21336b(this, view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            sq8.m48649h(view, "view");
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: o.nr1$e */
    public static final class C15633e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return uk3.m51674d(((CallLogs) obj2).getCallDate(), ((CallLogs) obj).getCallDate());
        }
    }

    /* renamed from: o.nr1$f */
    public static final class C15634f implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return uk3.m51674d(((CallLogs) obj2).getCallDate(), ((CallLogs) obj).getCallDate());
        }
    }

    /* renamed from: o.nr1$g */
    public static final class C15635g extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C15635g f37190a = new C15635g();

        public C15635g() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(jta jtaVar) {
            sq8.m48649h(jtaVar, "it");
            return "<b>" + jtaVar.mo34493b().get(1) + "</b>";
        }
    }

    /* renamed from: o.nr1$h */
    public static final class C15636h extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C15636h f37191a = new C15636h();

        public C15636h() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(jta jtaVar) {
            sq8.m48649h(jtaVar, "it");
            return "<i>" + jtaVar.mo34493b().get(1) + "</i>";
        }
    }

    /* renamed from: o.nr1$i */
    public static final class C15637i extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C15637i f37192a = new C15637i();

        public C15637i() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(jta jtaVar) {
            sq8.m48649h(jtaVar, "it");
            return "<s>" + jtaVar.mo34493b().get(1) + "</s>";
        }
    }

    /* renamed from: o.nr1$j */
    public static final class C15638j extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C15638j f37193a = new C15638j();

        public C15638j() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(jta jtaVar) {
            sq8.m48649h(jtaVar, "it");
            return "<code>" + jtaVar.mo34493b().get(1) + "</code>";
        }
    }

    /* renamed from: o.nr1$k */
    public static final class C15639k extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ List f37194a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15639k(List list) {
            super(1);
            this.f37194a = list;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(jta jtaVar) {
            sq8.m48649h(jtaVar, "it");
            return (CharSequence) this.f37194a.get(Integer.parseInt((String) jtaVar.mo34493b().get(1)));
        }
    }

    /* renamed from: o.nr1$l */
    public static final class C15640l extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ List f37195a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15640l(List list) {
            super(1);
            this.f37195a = list;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(jta jtaVar) {
            sq8.m48649h(jtaVar, "match");
            this.f37195a.add(jtaVar.mo34493b().get(1));
            return "@@@placeholder" + (this.f37195a.size() - 1) + "@@@";
        }
    }

    /* renamed from: o.nr1$m */
    public static final class C15641m extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C15641m f37196a = new C15641m();

        public C15641m() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(jta jtaVar) {
            sq8.m48649h(jtaVar, "matchResult");
            try {
                String str = new SimpleDateFormat("dd-MMM-yy hh:mm a", Locale.getDefault()).format(DesugarDate.from(Instant.parse(jtaVar.getValue())));
                sq8.m48646e(str);
                return str;
            } catch (Exception unused) {
                return jtaVar.getValue();
            }
        }
    }

    /* renamed from: A */
    public static final void m40930A(TextView textView, Tasks tasks) {
        if (textView == null || tasks == null) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        } else if (tasks.getVisitDateInMillis() > 0) {
            textView.setText(jm7.m34026L(tasks.getVisitDateInMillis(), textView));
            textView.setVisibility(0);
        } else if (tasks.getCallStartTime() > 0) {
            String str = sq8.m48644c(tasks.getCallDirection(), "INCOMING") ? "Incoming " : "Outgoing ";
            textView.setText(str + (tasks.getCallDurationInMillis() / 1000) + " seconds");
            textView.setVisibility(0);
        }
    }

    public static final void A0(MaterialTextView materialTextView, String str) {
        if (materialTextView == null || str == null) {
            return;
        }
        if (str.length() > 0) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            materialTextView.setText(th1.m49853e(lowerCase));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void A1(ImageView imageView, RecentAction recentAction) {
        Integer numValueOf;
        if (imageView == null || recentAction == null) {
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        int color = c64.getColor(imageView.getContext(), u6e.superfone_green_70);
        String upperCase = recentAction.getEngagementType().toUpperCase(Locale.ROOT);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -1577559662:
                if (!upperCase.equals("WHATSAPP")) {
                    numValueOf = null;
                    break;
                } else {
                    numValueOf = Integer.valueOf(w7e.ic_whatsapp);
                    break;
                }
            case -1237531517:
                if (upperCase.equals("CONVERSATION")) {
                    numValueOf = Integer.valueOf(w7e.ic_conversation);
                    break;
                }
                break;
            case -68698650:
                if (upperCase.equals("PAYMENT")) {
                    numValueOf = Integer.valueOf(w7e.ic_deal_won);
                    break;
                }
                break;
            case 82233:
                if (upperCase.equals("SMS")) {
                    numValueOf = Integer.valueOf(w7e.ic_message_text);
                    break;
                }
                break;
            case 2060894:
                if (upperCase.equals("CALL")) {
                    if (!sq8.m48644c(recentAction.getCallDirection(), "OUTGOING")) {
                        if (!sq8.m48644c(recentAction.getCallConnectStatus(), "CONNECTED")) {
                            numValueOf = Integer.valueOf(w7e.ic_home_calls_missed);
                            color = c64.getColor(imageView.getContext(), u6e.superfone_red_70);
                            break;
                        } else {
                            numValueOf = Integer.valueOf(w7e.ic_call_in);
                            color = c64.getColor(imageView.getContext(), u6e.superfone_green_70);
                            break;
                        }
                    } else if (!sq8.m48644c(recentAction.getCallConnectStatus(), "CONNECTED")) {
                        numValueOf = Integer.valueOf(w7e.ic_call_missed);
                        color = c64.getColor(imageView.getContext(), u6e.superfone_red_70);
                        break;
                    } else {
                        numValueOf = Integer.valueOf(w7e.ic_call_out);
                        color = c64.getColor(imageView.getContext(), u6e.superfone_green_70);
                        break;
                    }
                }
                break;
            case 2402290:
                if (upperCase.equals("NOTE")) {
                    numValueOf = Integer.valueOf(w7e.ic_activity_notes_added);
                    break;
                }
                break;
            case 66081660:
                if (upperCase.equals("EMAIL")) {
                    numValueOf = Integer.valueOf(w7e.ic_activity_email_sent);
                    break;
                }
                break;
            case 81665115:
                if (upperCase.equals("VIDEO")) {
                    numValueOf = Integer.valueOf(w7e.ic_video_call);
                    break;
                }
                break;
            case 81679659:
                if (upperCase.equals("VISIT")) {
                    numValueOf = Integer.valueOf(w7e.ic_add_visit);
                    break;
                }
                break;
            case 140321899:
                if (!upperCase.equals("WABA_BROADCAST")) {
                }
                break;
        }
        if (numValueOf != null) {
            imageView.setImageResource(numValueOf.intValue());
        }
        imageView.setImageTintList(ColorStateList.valueOf(color));
    }

    public static final void A2(TextView textView, ChatMessages chatMessages) {
        if (textView == null || chatMessages == null) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        String strC0 = jm7.c0(chatMessages.getMessageTime(), textView);
        if (chatMessages.getMessageUserName() != null && sq8.m48644c(chatMessages.isInbound(), Boolean.FALSE)) {
            String messageUserName = chatMessages.getMessageUserName();
            sq8.m48646e(messageUserName);
            strC0 = strC0 + " by " + th1.m49850b(messageUserName);
        } else if (chatMessages.getMessageUserName() == null && chatMessages.getMessageUserId() != null && sq8.m48644c(chatMessages.isInbound(), Boolean.FALSE)) {
            strC0 = strC0 + " by " + th1.m49850b(lpi.a0(chatMessages.getMessageUserId()).getName());
        } else if (chatMessages.getContactName() != null && sq8.m48644c(chatMessages.isInbound(), Boolean.TRUE)) {
            String contactName = chatMessages.getContactName();
            sq8.m48646e(contactName);
            strC0 = strC0 + " by " + th1.m49850b(contactName);
        }
        textView.setText(strC0);
        textView.setVisibility(0);
    }

    /* renamed from: B */
    public static final void m40931B(TextView textView, ChatChannel chatChannel) {
        User userM39171u;
        if (textView == null || chatChannel == null) {
            return;
        }
        if (!sq8.m48644c(chatChannel.getParticipantScopeIfInternal(), "DIRECT")) {
            textView.setText(chatChannel.getChannelName());
            return;
        }
        mii miiVarM54444J = wi0.m54444J();
        String str = null;
        String id = (miiVarM54444J == null || (userM39171u = miiVarM54444J.m39171u()) == null) ? null : userM39171u.getId();
        String userIdsForDirectChannel = chatChannel.getUserIdsForDirectChannel();
        List listD0 = userIdsForDirectChannel != null ? f9g.D0(userIdsForDirectChannel, new String[]{ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER}, false, 0, 6, null) : null;
        if (listD0 == null || listD0.size() != 2) {
            return;
        }
        if (sq8.m48644c(listD0.get(0), id)) {
            str = (String) listD0.get(1);
        } else if (sq8.m48644c(listD0.get(1), id)) {
            str = (String) listD0.get(0);
        }
        String lowerCase = lpi.a0(str).getName().toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        textView.setText(th1.m49850b(lowerCase));
    }

    public static final void B0(TextView textView, String str) {
        if (textView != null && str != null && !StringUtils.isBlank(str)) {
            textView.setText(V2(str));
        } else {
            if (textView == null) {
                return;
            }
            textView.setText("");
        }
    }

    public static final void B1(TextView textView, Long l) {
        if (textView == null || l == null || l.longValue() <= 0) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        } else {
            String strM34039Y = jm7.m34039Y(l.longValue());
            if (strM34039Y == null) {
                textView.setVisibility(8);
            } else {
                textView.setText(strM34039Y);
                textView.setVisibility(0);
            }
        }
    }

    public static final void B2(TextView textView, Long l) {
        if (textView == null || l == null || l.longValue() <= 0) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        } else if (l.longValue() - System.currentTimeMillis() > 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    /* renamed from: C */
    public static final void m40932C(ShapeableImageView shapeableImageView, ChatChannel chatChannel) {
        String channelId;
        String upperCase;
        User userM39171u;
        if (shapeableImageView == null || chatChannel == null) {
            return;
        }
        String str = "";
        if (sq8.m48644c(chatChannel.getParticipantScopeIfInternal(), "DIRECT")) {
            mii miiVarM54444J = wi0.m54444J();
            String id = (miiVarM54444J == null || (userM39171u = miiVarM54444J.m39171u()) == null) ? null : userM39171u.getId();
            String userIdsForDirectChannel = chatChannel.getUserIdsForDirectChannel();
            List listD0 = userIdsForDirectChannel != null ? f9g.D0(userIdsForDirectChannel, new String[]{ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER}, false, 0, 6, null) : null;
            if (listD0 == null || listD0.size() != 2) {
                upperCase = "";
                channelId = null;
            } else {
                channelId = sq8.m48644c(listD0.get(0), id) ? (String) listD0.get(1) : sq8.m48644c(listD0.get(1), id) ? (String) listD0.get(0) : null;
                LeadsUser leadsUserA0 = lpi.a0(channelId);
                String profilePic = leadsUserA0.getProfilePic();
                String strValueOf = String.valueOf(f9g.Z0(leadsUserA0.getName()).toString().charAt(0));
                sq8.m48647f(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase2 = strValueOf.toUpperCase(Locale.ROOT);
                sq8.m48648g(upperCase2, "toUpperCase(...)");
                upperCase = upperCase2;
                str = profilePic;
            }
        } else {
            channelId = chatChannel.getChannelId();
            String channelName = chatChannel.getChannelName();
            if (channelName == null || channelName.length() == 0) {
                upperCase = "";
            } else {
                String channelName2 = chatChannel.getChannelName();
                sq8.m48646e(channelName2);
                String strValueOf2 = String.valueOf(f9g.Z0(channelName2).toString().charAt(0));
                sq8.m48647f(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                upperCase = strValueOf2.toUpperCase(Locale.ROOT);
                sq8.m48648g(upperCase, "toUpperCase(...)");
            }
        }
        if (!(str.length() == 0) && !f9g.m26306P(str, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null)) {
            pu5.m44193b().m44196d(shapeableImageView, str);
            return;
        }
        if (!(channelId == null || channelId.length() == 0)) {
            if (!(upperCase.length() == 0)) {
                shapeableImageView.setImageDrawable(xgh.m56281a().mo56294a(upperCase, oh3.f38348d.m42239b(channelId), 20));
                return;
            }
        }
        shapeableImageView.setImageResource(R.color.transparent);
    }

    public static final void C0(MaterialButton materialButton, IntegrationList integrationList) {
        if (materialButton == null || integrationList == null) {
            if (materialButton != null) {
                materialButton.setVisibility(8);
            }
        } else {
            if (integrationList.getConnectionCount() <= 0) {
                materialButton.setText(integrationList.getActionText());
                materialButton.setBackgroundColor(c64.getColor(materialButton.getContext(), u6e.superfone_white));
                materialButton.setTextColor(c64.getColor(materialButton.getContext(), u6e.superfone_gray));
                return;
            }
            materialButton.setText(integrationList.getConnectionCount() + " Connected");
            materialButton.setBackgroundColor(c64.getColor(materialButton.getContext(), u6e.superfone_blue));
            materialButton.setTextColor(c64.getColor(materialButton.getContext(), u6e.superfone_white));
        }
    }

    public static final void C1(TextView textView, String str) {
        jta jtaVarM38992b;
        mge mgeVar = new mge("(\\d{4}-\\d{2}-\\d{2})[A-Z]+(\\d{2}:\\d{2}:\\d{2}).([0-9+-:]+)[Z]");
        if (textView == null || str == null || f9g.d0(str)) {
            return;
        }
        textView.setText(str);
        if (!mgeVar.m38991a(str) || (jtaVarM38992b = mgeVar.m38992b(str, 0)) == null) {
            return;
        }
        TemporalAccessor temporalAccessor = DateTimeFormatter.ISO_INSTANT.parse(jtaVarM38992b.getValue());
        sq8.m48648g(temporalAccessor, "parse(...)");
        Instant instantFrom = Instant.from(temporalAccessor);
        sq8.m48648g(instantFrom, "from(...)");
        String str2 = f37184a.format(instantFrom);
        sq8.m48646e(str2);
        textView.setText(mgeVar.m38996h(str, str2));
    }

    public static final void C2(TextView textView, Long l) {
        if (textView == null || l == null || l.longValue() <= 0) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        long jLongValue = l.longValue() - System.currentTimeMillis();
        if (jLongValue <= 0) {
            textView.setVisibility(8);
            return;
        }
        h8g h8gVar = h8g.f26398a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(jLongValue)), Long.valueOf(timeUnit.toMinutes(jLongValue) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(jLongValue)))}, 2));
        sq8.m48648g(str, "format(...)");
        textView.setText(str);
        textView.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r6.longValue() < java.lang.System.currentTimeMillis()) goto L13;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m40933D(LinearLayout linearLayout, ChatChannel chatChannel) {
        if (linearLayout != null) {
            if (chatChannel == null) {
                linearLayout.setVisibility(8);
                return;
            }
            if (sq8.m48644c(chatChannel.getMessagePlatform(), "WHATSAPP")) {
                if (chatChannel.getChannelOpenUntil() != null) {
                    if (chatChannel.getChannelOpenUntil() != null) {
                        Long channelOpenUntil = chatChannel.getChannelOpenUntil();
                        sq8.m48646e(channelOpenUntil);
                    }
                }
                linearLayout.setVisibility(8);
                return;
            }
            linearLayout.setVisibility(0);
        }
    }

    public static final void D0(MaterialCardView materialCardView, ChatChannel chatChannel) {
        if (materialCardView == null || chatChannel == null) {
            return;
        }
        if (chatChannel.getUnreadMessageCount() > 0) {
            materialCardView.setCardBackgroundColor(c64.getColor(materialCardView.getContext(), u6e.superfone_blue_10));
            if (Build.VERSION.SDK_INT >= 28) {
                materialCardView.setOutlineSpotShadowColor(c64.getColor(materialCardView.getContext(), u6e.superfone_blue_30));
                materialCardView.setOutlineAmbientShadowColor(c64.getColor(materialCardView.getContext(), u6e.superfone_blue_30));
                return;
            }
            return;
        }
        materialCardView.setCardBackgroundColor(c64.getColor(materialCardView.getContext(), u6e.superfone_white));
        if (Build.VERSION.SDK_INT >= 28) {
            materialCardView.setOutlineSpotShadowColor(c64.getColor(materialCardView.getContext(), u6e.superfone_gray));
            materialCardView.setOutlineAmbientShadowColor(c64.getColor(materialCardView.getContext(), u6e.superfone_gray));
        }
    }

    public static final void D1(Button button, String str) {
        if (button != null) {
            if (!(str == null || str.length() == 0)) {
                button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str)));
                return;
            }
        }
        if (button != null) {
            if (str == null || str.length() == 0) {
                button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#768389")));
            }
        }
    }

    public static final void D2(TextView textView, Long l) {
        if (textView != null && l != null && l.longValue() > 0) {
            textView.setText(jm7.m34032R(jm7.m34034T(System.currentTimeMillis()) + l.longValue()));
            textView.setVisibility(0);
        } else {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r2.longValue() < java.lang.System.currentTimeMillis()) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m40934E(TextView textView, ChatChannel chatChannel) {
        if (textView != null) {
            if (chatChannel == null) {
                textView.setText("You can initiate conversation by sending only approved Whatsapp Template");
                textView.setVisibility(0);
                return;
            }
            if (chatChannel.getChannelOpenUntil() != null) {
                if (chatChannel.getChannelOpenUntil() != null) {
                    Long channelOpenUntil = chatChannel.getChannelOpenUntil();
                    sq8.m48646e(channelOpenUntil);
                }
                textView.setText("");
                textView.setVisibility(8);
                return;
            }
            if (chatChannel.getChannelWillBeChargedNext() != null) {
                Long channelWillBeChargedNext = chatChannel.getChannelWillBeChargedNext();
                sq8.m48646e(channelWillBeChargedNext);
                if (channelWillBeChargedNext.longValue() > System.currentTimeMillis()) {
                    textView.setText("You can continue the open conversation by sending only approved Whatsapp Template");
                } else {
                    textView.setText("You can initiate conversation by sending only approved Whatsapp Template");
                }
            }
            textView.setVisibility(0);
        }
    }

    public static final void E0(ShapeableImageView shapeableImageView, Integer num, Integer num2) {
        if (shapeableImageView == null || num == null || num2 == null) {
            return;
        }
        shapeableImageView.setImageResource(num.intValue());
        if (num2.intValue() != 17170445) {
            shapeableImageView.setImageTintList(ColorStateList.valueOf(c64.getColor(shapeableImageView.getContext(), num2.intValue())));
        }
    }

    public static final void E1(Button button, WhatsAppTemplates whatsAppTemplates) {
        String upperCase;
        TemplateComponent templateComponent;
        WaHeader waHeader;
        String waFormat;
        if (button == null || whatsAppTemplates == null) {
            if (button == null) {
                return;
            }
            button.setVisibility(8);
            return;
        }
        List<TemplateComponent> components = whatsAppTemplates.getComponents();
        if (components == null || (templateComponent = (TemplateComponent) kh3.h0(components)) == null || (waHeader = templateComponent.getWaHeader()) == null || (waFormat = waHeader.getWaFormat()) == null) {
            upperCase = null;
        } else {
            Locale locale = Locale.getDefault();
            sq8.m48648g(locale, "getDefault(...)");
            upperCase = waFormat.toUpperCase(locale);
            sq8.m48648g(upperCase, "toUpperCase(...)");
        }
        if (upperCase == null) {
            upperCase = "";
        }
        if (sq8.m48644c(upperCase, "IMAGE")) {
            button.setVisibility(0);
        } else {
            button.setVisibility(8);
        }
    }

    public static final void E2(TextView textView, LeadsDeal leadsDeal) {
        String str;
        String str2;
        if (textView == null || leadsDeal == null || leadsDeal.getDealAmount() == null) {
            if (textView != null) {
                textView.setText("Amt : 0");
                return;
            }
            return;
        }
        Double dealAmount = leadsDeal.getDealAmount();
        sq8.m48646e(dealAmount);
        int iDoubleValue = (int) dealAmount.doubleValue();
        if (iDoubleValue < 0) {
            iDoubleValue *= -1;
            str = "-";
        } else {
            str = "";
        }
        double d = iDoubleValue;
        double d2 = d / 1.0E7d;
        double d3 = d / 100000.0d;
        double d4 = d / 1000.0d;
        if (d2 > 1.0d) {
            str2 = str + d2 + " crore";
        } else if (d3 > 1.0d) {
            str2 = str + d3 + " lakh";
        } else if (d4 > 1.0d) {
            str2 = str + d4 + " thousand";
        } else {
            str2 = str + iDoubleValue;
        }
        textView.setText("Amt : " + str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r5.longValue() >= java.lang.System.currentTimeMillis()) goto L12;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m40935F(LinearLayout linearLayout, ChatChannel chatChannel) {
        if (linearLayout == null || chatChannel == null) {
            return;
        }
        if (sq8.m48644c(chatChannel.getMessagePlatform(), "WHATSAPP")) {
            if (chatChannel.getChannelOpenUntil() != null) {
                Long channelOpenUntil = chatChannel.getChannelOpenUntil();
                sq8.m48646e(channelOpenUntil);
            }
            linearLayout.setVisibility(0);
            return;
        }
        linearLayout.setVisibility(8);
    }

    public static final void F0(MaterialTextView materialTextView, String str, Boolean bool) {
        if (materialTextView != null) {
            if ((str == null || f9g.d0(str)) || bool == null) {
                return;
            }
            materialTextView.setText((bool.booleanValue() ? "↑" : "↓") + " " + str + "%");
            materialTextView.setTextColor(c64.getColor(materialTextView.getContext(), bool.booleanValue() ? u6e.superfone_green : u6e.superfone_red));
        }
    }

    public static final void F1(LinearLayout linearLayout, WhatsAppTemplates whatsAppTemplates) {
        String upperCase;
        TemplateComponent templateComponent;
        WaHeader waHeader;
        String waFormat;
        if (linearLayout == null || whatsAppTemplates == null) {
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
            return;
        }
        List<TemplateComponent> components = whatsAppTemplates.getComponents();
        if (components == null || (templateComponent = (TemplateComponent) kh3.h0(components)) == null || (waHeader = templateComponent.getWaHeader()) == null || (waFormat = waHeader.getWaFormat()) == null) {
            upperCase = null;
        } else {
            Locale locale = Locale.getDefault();
            sq8.m48648g(locale, "getDefault(...)");
            upperCase = waFormat.toUpperCase(locale);
            sq8.m48648g(upperCase, "toUpperCase(...)");
        }
        if (upperCase == null) {
            upperCase = "";
        }
        if (whatsAppTemplates.getNewFileUploaded() || !(sq8.m48644c(upperCase, "IMAGE") || sq8.m48644c(upperCase, "VIDEO") || sq8.m48644c(upperCase, "DOCUMENT"))) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
    }

    public static final void F2(TouchImageView touchImageView, String str) {
        if (touchImageView != null && str != null) {
            pu5.m44193b().m44198f(touchImageView, str);
            touchImageView.setVisibility(0);
        } else {
            if (touchImageView == null) {
                return;
            }
            touchImageView.setVisibility(8);
        }
    }

    /* renamed from: G */
    public static final void m40936G(MaterialTextView materialTextView, ChatChannel chatChannel) {
        if (materialTextView == null || chatChannel == null) {
            if (materialTextView != null) {
                materialTextView.setVisibility(8);
                return;
            }
            return;
        }
        if (chatChannel.getChannelOpenUntil() != null) {
            Long channelOpenUntil = chatChannel.getChannelOpenUntil();
            sq8.m48646e(channelOpenUntil);
            if (channelOpenUntil.longValue() > System.currentTimeMillis()) {
                if (chatChannel.getChannelWillBeChargedNext() == null) {
                    materialTextView.setVisibility(8);
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long channelWillBeChargedNext = chatChannel.getChannelWillBeChargedNext();
                sq8.m48646e(channelWillBeChargedNext);
                if ((channelWillBeChargedNext.longValue() - jCurrentTimeMillis) / 864000 >= 0) {
                    materialTextView.setVisibility(8);
                    return;
                } else {
                    materialTextView.setText("Your last conversation got over. You can still send free form message which will start a new conversation.");
                    materialTextView.setVisibility(0);
                    return;
                }
            }
        }
        materialTextView.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void G0(ImageView imageView, String str) {
        String strValueOf;
        if (imageView == null || str == null) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        if (str.length() > 0) {
            if (f9g.Z0(str).toString().length() > 0) {
                String strValueOf2 = String.valueOf(f9g.Z0(str).toString().charAt(0));
                sq8.m48647f(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf2.toUpperCase(Locale.ROOT);
                sq8.m48648g(upperCase, "toUpperCase(...)");
                strValueOf = String.valueOf(upperCase);
            }
        } else {
            strValueOf = "";
        }
        if (!(strValueOf.length() > 0)) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(xgh.m56281a().mo56294a(strValueOf, oh3.f38348d.m42239b(str), 20));
            imageView.setVisibility(0);
        }
    }

    public static final void G1(EditText editText, TemplateVariable templateVariable) {
        Object next;
        if (editText == null || templateVariable == null) {
            return;
        }
        boolean z = true;
        if (templateVariable.getFallBackValue().length() > 0) {
            editText.setText(templateVariable.getFallBackValue());
            return;
        }
        if (templateVariable.getMappedObject().length() > 0) {
            if (templateVariable.getMappedProperty().length() > 0) {
                Iterator<T> it = templateVariable.getVariableMap().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    VariableMapEntry variableMapEntry = (VariableMapEntry) next;
                    if (sq8.m48644c(variableMapEntry.getObject(), templateVariable.getMappedObject()) && sq8.m48644c(variableMapEntry.getKey(), templateVariable.getMappedProperty())) {
                        break;
                    }
                }
                VariableMapEntry variableMapEntry2 = (VariableMapEntry) next;
                if (variableMapEntry2 != null) {
                    String fallBackValue = variableMapEntry2.getFallBackValue();
                    if (fallBackValue != null && fallBackValue.length() != 0) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    editText.setText(variableMapEntry2.getFallBackValue());
                }
            }
        }
    }

    public static final void G2(TextView textView, AttendanceInfo attendanceInfo) {
        if (textView == null || attendanceInfo == null) {
            return;
        }
        String reasonForNonAttendance = attendanceInfo.getReasonForNonAttendance();
        if (!(reasonForNonAttendance == null || reasonForNonAttendance.length() == 0)) {
            textView.setText(attendanceInfo.getReasonForNonAttendance());
        } else if (attendanceInfo.getCheckoutTime() != null) {
            textView.setText("Logged Out For The Day");
        } else {
            textView.setText("Logged Attendance");
        }
    }

    /* renamed from: H */
    public static final void m40937H(MaterialButton materialButton, PaymentDataInfo paymentDataInfo) {
        if (materialButton == null || paymentDataInfo == null) {
            return;
        }
        if (sq8.m48644c(paymentDataInfo.getStatus(), "created") || sq8.m48644c(paymentDataInfo.getStatus(), "partiallyPaid")) {
            materialButton.setVisibility(0);
        } else {
            materialButton.setVisibility(8);
        }
    }

    public static final void H0(View view, UserContactDetail userContactDetail) {
        if (view == null || userContactDetail == null) {
            return;
        }
        th1.m49852d(view, !userContactDetail.isAlreadyImported());
    }

    public static final void H1(ShapeableImageView shapeableImageView, String str) {
        int i = w7e.ic_money;
        if (shapeableImageView != null && str != null) {
            i = sq8.m48644c(str, "RAZORPAY") ? w7e.razorpay_glyph : sq8.m48644c(str, "CASHFREE") ? w7e.cashfree : w7e.ic_money;
            shapeableImageView.setVisibility(0);
        }
        if (shapeableImageView != null) {
            shapeableImageView.setImageResource(i);
        }
    }

    public static final void H2(TextView textView, mii miiVar) {
        if (textView == null || miiVar == null) {
            return;
        }
        AccountType accountType = miiVar.m39156f().getAccountType();
        int i = accountType == null ? -1 : C15629a.f37185a[accountType.ordinal()];
        if (i == 1) {
            textView.setText("Personal");
        } else if (i == 2) {
            textView.setText("Organisation");
        } else {
            if (i != 3) {
                return;
            }
            textView.setText("Organisation (Trial Account)");
        }
    }

    /* renamed from: I */
    public static final void m40938I(MaterialButton materialButton, PaymentDataInfo paymentDataInfo) {
        if (materialButton == null || paymentDataInfo == null) {
            return;
        }
        if (sq8.m48644c(paymentDataInfo.getPaymentProvider(), "OFFLINE") && (sq8.m48644c(paymentDataInfo.getStatus(), "created") || sq8.m48644c(paymentDataInfo.getStatus(), "partiallyPaid"))) {
            materialButton.setVisibility(0);
        } else {
            materialButton.setVisibility(8);
        }
    }

    public static final void I0(LinearLayout linearLayout, ChatMessages chatMessages) {
        if (linearLayout == null || chatMessages == null) {
            return;
        }
        if (sq8.m48644c(chatMessages.getMessageType(), "audio")) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public static final void I1(ImageView imageView, WhatsAppTemplates whatsAppTemplates) {
        String upperCase;
        TemplateComponent templateComponent;
        WaHeader waHeader;
        String waFormat;
        if (imageView == null || whatsAppTemplates == null) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        List<TemplateComponent> components = whatsAppTemplates.getComponents();
        if (components == null || (templateComponent = (TemplateComponent) kh3.h0(components)) == null || (waHeader = templateComponent.getWaHeader()) == null || (waFormat = waHeader.getWaFormat()) == null) {
            upperCase = null;
        } else {
            Locale locale = Locale.getDefault();
            sq8.m48648g(locale, "getDefault(...)");
            upperCase = waFormat.toUpperCase(locale);
            sq8.m48648g(upperCase, "toUpperCase(...)");
        }
        if (upperCase == null) {
            upperCase = "";
        }
        if (whatsAppTemplates.getDefaultMedia() != null || (!sq8.m48644c(upperCase, "IMAGE") && !sq8.m48644c(upperCase, "VIDEO") && !sq8.m48644c(upperCase, "DOCUMENT"))) {
            imageView.setVisibility(8);
            return;
        }
        int i = w7e.ic_image;
        int iHashCode = upperCase.hashCode();
        if (iHashCode != 69775675) {
            if (iHashCode != 81665115) {
                if (iHashCode == 1644347675 && upperCase.equals("DOCUMENT")) {
                    i = w7e.ic_file_document;
                }
            } else if (upperCase.equals("VIDEO")) {
                i = w7e.ic_video;
            }
        } else if (upperCase.equals("IMAGE")) {
            i = w7e.ic_image;
        }
        imageView.setImageResource(i);
        imageView.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void I2(ImageView imageView, UserContactDetail userContactDetail) {
        String upperCase;
        if (imageView == null || userContactDetail == null) {
            return;
        }
        String id = userContactDetail.getId();
        boolean z = true;
        if (userContactDetail.getName().length() > 0) {
            if (f9g.Z0(userContactDetail.getName()).toString().length() > 0) {
                String strValueOf = String.valueOf(f9g.Z0(userContactDetail.getName()).toString().charAt(0));
                sq8.m48647f(strValueOf, "null cannot be cast to non-null type java.lang.String");
                upperCase = strValueOf.toUpperCase(Locale.ROOT);
                sq8.m48648g(upperCase, "toUpperCase(...)");
            }
        } else {
            upperCase = "";
        }
        Uri uri = StringUtils.isBlank(userContactDetail.getPhotoUri()) ? null : Uri.parse(userContactDetail.getPhotoUri());
        if (uri != null) {
            pu5.m44193b().m44196d(imageView, uri.toString());
            return;
        }
        if (!(id == null || id.length() == 0)) {
            if (upperCase != null && upperCase.length() != 0) {
                z = false;
            }
            if (!z) {
                imageView.setImageDrawable(xgh.m56281a().mo56294a(upperCase, oh3.f38348d.m42239b(id), 20));
                return;
            }
        }
        imageView.setImageResource(R.color.transparent);
    }

    /* renamed from: J */
    public static final void m40939J(MaterialButtonToggleGroup materialButtonToggleGroup, ActivityMetrics.Period period) {
        if (materialButtonToggleGroup == null || period == null) {
            return;
        }
        if (period == ActivityMetrics.Period.DAY) {
            materialButtonToggleGroup.m14257r(z8e.btnToday);
        } else if (period == ActivityMetrics.Period.WEEK) {
            materialButtonToggleGroup.m14257r(z8e.btnWeek);
        } else if (period == ActivityMetrics.Period.MONTH) {
            materialButtonToggleGroup.m14257r(z8e.btnMonth);
        }
    }

    public static final void J0(LinearLayout linearLayout, FileData fileData) {
        if (linearLayout == null || fileData == null) {
            return;
        }
        if (e9g.m24597K(fileData.getMimeType(), "audio", false, 2, null)) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public static final void J1(TextView textView, Tasks tasks) {
        if (textView == null || tasks == null) {
            return;
        }
        String taskContent = tasks.getTaskContent();
        if (tasks.getCreatedAt() != null) {
            Long createdAt = tasks.getCreatedAt();
            sq8.m48646e(createdAt);
            taskContent = taskContent + "(" + DateTimeFormatter.ofPattern("dd-MMM hh:mm a").format(Instant.ofEpochMilli(createdAt.longValue()).atZone(ZoneId.systemDefault())) + ")";
        }
        textView.setText(taskContent);
    }

    public static final void J2(ImageView imageView, String str) {
        if (imageView != null) {
            if (!(str == null || f9g.d0(str))) {
                pu5.m44193b().m44196d(imageView, str);
                return;
            }
        }
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            imageView.setImageDrawable(c64.getDrawable(imageView.getContext(), w7e.ic_user_profile));
        }
    }

    /* renamed from: K */
    public static final void m40940K(Chip chip, String str) {
        if (chip != null) {
            if (str == null || str.length() == 0) {
                chip.setChipIconVisible(false);
            } else {
                pu5.m44193b().m44195c(chip, str);
            }
        }
    }

    public static final void K0(TextView textView, Long l) {
        if (textView == null || l == null) {
            return;
        }
        c64.getColor(textView.getContext(), u6e.superfone_black_70);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        long j = -ChronoUnit.DAYS.between(LocalDate.now(), Instant.ofEpochMilli(l.longValue()).atZone(ZoneId.systemDefault()).toLocalDate());
        textView.setText(j + " D");
        textView.setBackgroundTintList(ColorStateList.valueOf(j <= 1 ? c64.getColor(textView.getContext(), u6e.superfone_green) : j <= 7 ? c64.getColor(textView.getContext(), u6e.superfone_blue) : j <= 15 ? c64.getColor(textView.getContext(), u6e.superfone_orange) : c64.getColor(textView.getContext(), u6e.superfone_red)));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void K1(MaterialButton materialButton, Tasks tasks) {
        int color;
        String str;
        String str2;
        int color2;
        String str3;
        int color3;
        if (materialButton == null || tasks == null) {
            return;
        }
        int color4 = c64.getColor(materialButton.getContext(), u6e.superfone_orange);
        int color5 = c64.getColor(materialButton.getContext(), u6e.superfone_white);
        if (e9g.m24606x(tasks.getTaskStatus(), EngagementStatus.COMPLETED.toString(), true)) {
            double dCeil = Math.ceil((Calendar.getInstance().getTimeInMillis() - tasks.getTaskCompletionTime()) / 86400000);
            if (sq8.m48644c(tasks.getSystemAction(), "SYSTEM_CLOSURE")) {
                if (dCeil > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    str = "Force Closed " + lza.m38120c(dCeil) + " Days Ago";
                } else {
                    str = "Force Closed";
                }
            } else if (dCeil > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                String taskCompletionType = tasks.getTaskCompletionType();
                Locale locale = Locale.getDefault();
                sq8.m48648g(locale, "getDefault(...)");
                String lowerCase = taskCompletionType.toLowerCase(locale);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
                if (sq8.m48644c(lowerCase, FirebaseAnalytics.Param.SUCCESS)) {
                    str = "Completed " + lza.m38120c(dCeil) + " Days Ago";
                    color4 = c64.getColor(materialButton.getContext(), u6e.superfone_green);
                } else {
                    str = "Failed " + lza.m38120c(dCeil) + " Days Ago";
                    color4 = c64.getColor(materialButton.getContext(), u6e.superfone_red);
                }
            } else {
                String taskCompletionType2 = tasks.getTaskCompletionType();
                Locale locale2 = Locale.getDefault();
                sq8.m48648g(locale2, "getDefault(...)");
                String lowerCase2 = taskCompletionType2.toLowerCase(locale2);
                sq8.m48648g(lowerCase2, "toLowerCase(...)");
                if (sq8.m48644c(lowerCase2, FirebaseAnalytics.Param.SUCCESS)) {
                    color4 = c64.getColor(materialButton.getContext(), u6e.superfone_green);
                    str = "Completed";
                } else {
                    color4 = c64.getColor(materialButton.getContext(), u6e.superfone_red);
                    str = "Failed";
                }
            }
            color = c64.getColor(materialButton.getContext(), u6e.superfone_white);
        } else if (tasks.getNextFollowUpOn() != null) {
            Long nextFollowUpOn = tasks.getNextFollowUpOn();
            sq8.m48646e(nextFollowUpOn);
            if (nextFollowUpOn.longValue() > 0) {
                ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(ZoneId.systemDefault());
                Long nextFollowUpOn2 = tasks.getNextFollowUpOn();
                sq8.m48646e(nextFollowUpOn2);
                ZonedDateTime zonedDateTimeAtZone = Instant.ofEpochMilli(nextFollowUpOn2.longValue()).atZone(ZoneId.systemDefault());
                long jBetween = ChronoUnit.DAYS.between(zonedDateTimeNow.toLocalDate(), zonedDateTimeAtZone.toLocalDate());
                long hours = Duration.between(zonedDateTimeNow, zonedDateTimeAtZone).toHours();
                if (hours < 24 && hours >= 0) {
                    str3 = "Follow up: in " + hours + "H";
                    color3 = c64.getColor(materialButton.getContext(), u6e.superfone_blue);
                    color = c64.getColor(materialButton.getContext(), u6e.superfone_white);
                } else if (hours < 0 && hours > -24) {
                    str3 = "Follow up: was " + (-hours) + "H ago";
                    color3 = c64.getColor(materialButton.getContext(), u6e.superfone_orange);
                    color = c64.getColor(materialButton.getContext(), u6e.superfone_black);
                } else if (jBetween > 0) {
                    str3 = "Follow up: in " + jBetween + " D";
                    color3 = c64.getColor(materialButton.getContext(), u6e.superfone_grey_100);
                    color = c64.getColor(materialButton.getContext(), u6e.superfone_black);
                } else if (jBetween < 0) {
                    str3 = "Follow up: was " + (-jBetween) + " D ago";
                    color3 = c64.getColor(materialButton.getContext(), u6e.superfone_red);
                    color = c64.getColor(materialButton.getContext(), u6e.superfone_white);
                } else {
                    color4 = c64.getColor(materialButton.getContext(), u6e.superfone_blue);
                    color = c64.getColor(materialButton.getContext(), u6e.superfone_white);
                    str = "Follow up: Today";
                    materialButton.setText(str);
                }
                int i = color3;
                str = str3;
                color4 = i;
                materialButton.setText(str);
            } else if (tasks.getTaskDateTimeInMillis() > 0) {
                ZonedDateTime zonedDateTimeNow2 = ZonedDateTime.now(ZoneId.systemDefault());
                ZonedDateTime zonedDateTimeAtZone2 = Instant.ofEpochMilli(tasks.getTaskDateTimeInMillis()).atZone(ZoneId.systemDefault());
                long jBetween2 = ChronoUnit.DAYS.between(zonedDateTimeNow2.toLocalDate(), zonedDateTimeAtZone2.toLocalDate());
                long hours2 = Duration.between(zonedDateTimeNow2, zonedDateTimeAtZone2).toHours();
                if (hours2 < 24 && hours2 >= 0) {
                    str2 = "Due: in " + hours2 + "H";
                    color2 = c64.getColor(materialButton.getContext(), u6e.superfone_blue);
                    color = c64.getColor(materialButton.getContext(), u6e.superfone_white);
                } else if (hours2 < 0 && hours2 > -24) {
                    str2 = "Overdue : " + (-hours2) + "H ago";
                    color2 = c64.getColor(materialButton.getContext(), u6e.superfone_orange);
                    color = c64.getColor(materialButton.getContext(), u6e.superfone_black);
                } else if (jBetween2 > 0) {
                    str2 = "Upcoming: in " + jBetween2 + " D";
                    color2 = c64.getColor(materialButton.getContext(), u6e.superfone_grey_100);
                    color = c64.getColor(materialButton.getContext(), u6e.superfone_black);
                } else if (jBetween2 < 0) {
                    str2 = "Overdue: " + (-jBetween2) + " D ago";
                    color2 = c64.getColor(materialButton.getContext(), u6e.superfone_red);
                    color = c64.getColor(materialButton.getContext(), u6e.superfone_white);
                } else {
                    color4 = c64.getColor(materialButton.getContext(), u6e.superfone_blue);
                    color = c64.getColor(materialButton.getContext(), u6e.superfone_white);
                    str = "Due: Today";
                    materialButton.setText(str);
                }
                int i2 = color2;
                str = str2;
                color4 = i2;
                materialButton.setText(str);
            } else {
                color = color5;
                str = "Due";
            }
        }
        materialButton.setText(str);
        materialButton.setStrokeColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}, new int[]{-16842912}, new int[]{R.attr.state_pressed}}, new int[]{color4, color4, color4, color4}));
        materialButton.setBackgroundColor(color4);
        materialButton.setTextColor(color);
    }

    public static final void K2(ImageView imageView, String str) {
        if (imageView != null) {
            if (!(str == null || f9g.d0(str))) {
                pu5.m44193b().m44197e(imageView, str);
                return;
            }
        }
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            imageView.setImageDrawable(c64.getDrawable(imageView.getContext(), w7e.ic_user_profile));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: L */
    public static final void m40941L(Chip chip, Activities activities) {
        if (chip == null || activities == null) {
            return;
        }
        String toContactSource = activities.getToContactSource();
        boolean z = true;
        if (toContactSource == null || toContactSource.length() == 0) {
            String toPersonProfile = activities.getToPersonProfile();
            if (toPersonProfile != null && toPersonProfile.length() != 0) {
                z = false;
            }
            if (z || f9g.m26306P(toPersonProfile, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null)) {
                W2(activities.getToPersonName(), activities.getToPersonId(), chip);
                return;
            } else {
                pu5.m44193b().m44195c(chip, toPersonProfile);
                return;
            }
        }
        String toContactSource2 = activities.getToContactSource();
        sq8.m48646e(toContactSource2);
        Locale locale = Locale.getDefault();
        sq8.m48648g(locale, "getDefault(...)");
        String lowerCase = toContactSource2.toLowerCase(locale);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -1918536447:
                if (lowerCase.equals("commonfloor")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.commonfloor));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -1858793111:
                if (lowerCase.equals("sulekha")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.sulekha));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -1647335718:
                if (lowerCase.equals("shared_mailbox")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.inbox));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -1420744429:
                if (lowerCase.equals("jotform")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.jotform));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -1254789861:
                if (lowerCase.equals("urbanpro")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.urbanpro));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -713507699:
                if (lowerCase.equals("indiamart")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.indiamart));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -178324326:
                if (lowerCase.equals("calendly")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.calendly));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -79386020:
                if (lowerCase.equals("justdial")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.jdshort));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 117734:
                if (lowerCase.equals("wix")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.wix));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 24625183:
                if (lowerCase.equals("cashfree")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.cashfree));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 28903346:
                if (lowerCase.equals("instagram")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.ig));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 92576527:
                if (lowerCase.equals("aajjo")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.aajjo));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 497130182:
                if (lowerCase.equals("facebook")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.external_logo_facebook));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 604200602:
                if (lowerCase.equals("razorpay")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.razorpay_glyph));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 1100520413:
                if (lowerCase.equals("housing")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.housing));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 1223953944:
                if (lowerCase.equals("webform")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.webform));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 1523815487:
                if (lowerCase.equals("magicbricks")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.magicbricks));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 1884714579:
                if (lowerCase.equals("tradeindia")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.tradeindia));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 1934780818:
                if (lowerCase.equals("whatsapp")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.wa));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 1948103513:
                if (lowerCase.equals("googleleadform")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.google_ad));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 2118220354:
                if (lowerCase.equals("salesmaxapi")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.api));
                    chip.setVisibility(0);
                    return;
                }
                break;
        }
        String toPersonProfile2 = activities.getToPersonProfile();
        if (toPersonProfile2 != null && toPersonProfile2.length() != 0) {
            z = false;
        }
        if (z || f9g.m26306P(toPersonProfile2, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null)) {
            W2(activities.getToPersonName(), activities.getToPersonId(), chip);
        } else {
            pu5.m44193b().m44195c(chip, toPersonProfile2);
        }
    }

    public static final void L0(TextView textView, Long l) {
        if (textView == null || l == null || l.longValue() <= 0) {
            return;
        }
        textView.setText(jm7.m34024J(l.longValue(), textView));
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void L1(TextView textView, Tasks tasks) throws Resources.NotFoundException {
        String str;
        int color;
        Drawable drawable;
        String str2;
        String str3;
        if (textView == null || tasks == null) {
            return;
        }
        c64.getColor(textView.getContext(), u6e.superfone_orange);
        int color2 = c64.getColor(textView.getContext(), u6e.colorPrimary);
        if (e9g.m24606x(tasks.getTaskStatus(), EngagementStatus.COMPLETED.toString(), true)) {
            double dCeil = Math.ceil((Calendar.getInstance().getTimeInMillis() - tasks.getTaskCompletionTime()) / 86400000);
            if (sq8.m48644c(tasks.getSystemAction(), "SYSTEM_CLOSURE")) {
                if (dCeil > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    str3 = "Force Closed " + lza.m38120c(dCeil) + " Days Ago";
                } else {
                    str3 = "Force Closed";
                }
            } else if (dCeil > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                String taskCompletionType = tasks.getTaskCompletionType();
                Locale locale = Locale.getDefault();
                sq8.m48648g(locale, "getDefault(...)");
                String lowerCase = taskCompletionType.toLowerCase(locale);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
                if (sq8.m48644c(lowerCase, FirebaseAnalytics.Param.SUCCESS)) {
                    str3 = "Completed " + lza.m38120c(dCeil) + " Days Ago";
                    c64.getColor(textView.getContext(), u6e.superfone_green);
                } else {
                    str3 = "Failed " + lza.m38120c(dCeil) + " Days Ago";
                    c64.getColor(textView.getContext(), u6e.superfone_red);
                }
            } else {
                String taskCompletionType2 = tasks.getTaskCompletionType();
                Locale locale2 = Locale.getDefault();
                sq8.m48648g(locale2, "getDefault(...)");
                String lowerCase2 = taskCompletionType2.toLowerCase(locale2);
                sq8.m48648g(lowerCase2, "toLowerCase(...)");
                if (sq8.m48644c(lowerCase2, FirebaseAnalytics.Param.SUCCESS)) {
                    c64.getColor(textView.getContext(), u6e.superfone_green);
                    str3 = "Completed";
                } else {
                    c64.getColor(textView.getContext(), u6e.superfone_red);
                    str3 = "Failed";
                }
            }
            int color3 = c64.getColor(textView.getContext(), u6e.colorOnSurface);
            textView.setText(str3);
            color2 = color3;
        } else if (tasks.getNextFollowUpOn() != null) {
            Long nextFollowUpOn = tasks.getNextFollowUpOn();
            sq8.m48646e(nextFollowUpOn);
            if (nextFollowUpOn.longValue() > 0) {
                ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(ZoneId.systemDefault());
                Long nextFollowUpOn2 = tasks.getNextFollowUpOn();
                sq8.m48646e(nextFollowUpOn2);
                ZonedDateTime zonedDateTimeAtZone = Instant.ofEpochMilli(nextFollowUpOn2.longValue()).atZone(ZoneId.systemDefault());
                long jBetween = ChronoUnit.DAYS.between(zonedDateTimeNow.toLocalDate(), zonedDateTimeAtZone.toLocalDate());
                long jBetween2 = ChronoUnit.HOURS.between(zonedDateTimeNow, zonedDateTimeAtZone);
                String str4 = DateTimeFormatter.ofPattern("dd-MMM hh:mm a").format(zonedDateTimeAtZone);
                if (0 <= jBetween2 && jBetween2 < 24) {
                    str2 = "In " + jBetween2 + "H";
                } else {
                    if (-23 <= jBetween2 && jBetween2 < 0) {
                        str2 = (-jBetween2) + "H ago";
                    } else if (jBetween > 0) {
                        str2 = "In " + jBetween + " D";
                    } else if (jBetween < 0) {
                        str2 = (-jBetween) + " D ago";
                    } else {
                        str2 = "Today";
                    }
                }
                if (jBetween < 0) {
                    c64.getColor(textView.getContext(), u6e.superfone_red);
                } else {
                    c64.getColor(textView.getContext(), u6e.colorPrimary);
                }
                color = jBetween < 0 ? c64.getColor(textView.getContext(), u6e.superfone_red) : c64.getColor(textView.getContext(), u6e.colorPrimary);
                textView.setText(str2 + " • " + str4);
                Drawable drawable2 = c64.getDrawable(textView.getContext(), w7e.ic_bell_icon);
                if (drawable2 != null) {
                    drawable2.setTint(color);
                    int dimensionPixelSize = textView.getContext().getResources().getDimensionPixelSize(k7e.grid_2);
                    drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                } else {
                    drawable2 = null;
                }
                textView.setCompoundDrawables(drawable2, null, null, null);
            } else if (tasks.getTaskDateTimeInMillis() > 0) {
                ZonedDateTime zonedDateTimeNow2 = ZonedDateTime.now(ZoneId.systemDefault());
                ZonedDateTime zonedDateTimeAtZone2 = Instant.ofEpochMilli(tasks.getTaskDateTimeInMillis()).atZone(ZoneId.systemDefault());
                long jBetween3 = ChronoUnit.DAYS.between(zonedDateTimeNow2.toLocalDate(), zonedDateTimeAtZone2.toLocalDate());
                long jBetween4 = ChronoUnit.HOURS.between(zonedDateTimeNow2, zonedDateTimeAtZone2);
                String str5 = DateTimeFormatter.ofPattern("dd-MMM hh:mm a").format(zonedDateTimeAtZone2);
                if (0 <= jBetween4 && jBetween4 < 24) {
                    str = "Due: in " + jBetween4 + "H";
                } else {
                    if (-23 <= jBetween4 && jBetween4 < 0) {
                        str = "Overdue: " + (-jBetween4) + "H ago";
                    } else if (jBetween3 > 0) {
                        str = "Upcoming: in " + jBetween3 + " D";
                    } else if (jBetween3 < 0) {
                        str = "Overdue: " + (-jBetween3) + " D ago";
                    } else {
                        str = "Due: Today";
                    }
                }
                if (jBetween3 < 0) {
                    c64.getColor(textView.getContext(), u6e.superfone_red);
                } else {
                    c64.getColor(textView.getContext(), u6e.colorPrimary);
                }
                color = jBetween3 < 0 ? c64.getColor(textView.getContext(), u6e.superfone_red) : c64.getColor(textView.getContext(), u6e.colorPrimary);
                textView.setText(str + " • " + str5);
                Drawable drawable3 = c64.getDrawable(textView.getContext(), w7e.ic_bell_icon);
                if (drawable3 != null) {
                    drawable3.setTint(color);
                    int dimensionPixelSize2 = textView.getContext().getResources().getDimensionPixelSize(k7e.grid_2);
                    drawable3.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize2);
                    drawable = null;
                } else {
                    drawable = null;
                    drawable3 = null;
                }
                textView.setCompoundDrawables(drawable3, drawable, drawable, drawable);
            }
            color2 = color;
        }
        textView.setTextColor(color2);
    }

    public static final void L2(TextView textView, LeadsUser leadsUser) {
        if (textView != null) {
            if (leadsUser == null) {
                textView.setText(" ");
                return;
            }
            textView.setText(leadsUser.getAuthorizationLevel() + " | " + leadsUser.getRegisteredNumber());
        }
    }

    /* renamed from: M */
    public static final void m40942M(Chip chip, Activities activities) {
        if (chip == null || activities == null) {
            return;
        }
        String activityDoneByProfile = activities.getActivityDoneByProfile();
        if ((activityDoneByProfile == null || activityDoneByProfile.length() == 0) || f9g.m26306P(activityDoneByProfile, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null)) {
            W2(activities.getActivityDoneByName(), activities.getActivityDoneById(), chip);
        } else {
            pu5.m44193b().m44195c(chip, activityDoneByProfile);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final void M0(ImageView imageView, Leads leads) {
        if (imageView == null || leads == null) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        String contactSource = leads.getContactSource();
        if (contactSource == null || contactSource.length() == 0) {
            imageView.setVisibility(8);
            return;
        }
        String contactSource2 = leads.getContactSource();
        Locale locale = Locale.getDefault();
        sq8.m48648g(locale, "getDefault(...)");
        String lowerCase = contactSource2.toLowerCase(locale);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -1918536447:
                if (lowerCase.equals("commonfloor")) {
                    imageView.setImageResource(w7e.commonfloor);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case -1858793111:
                if (lowerCase.equals("sulekha")) {
                    imageView.setImageResource(w7e.sulekha);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case -1647335718:
                if (lowerCase.equals("shared_mailbox")) {
                    imageView.setImageResource(w7e.inbox);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case -1420744429:
                if (lowerCase.equals("jotform")) {
                    imageView.setImageResource(w7e.jotform);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case -1254789861:
                if (lowerCase.equals("urbanpro")) {
                    imageView.setImageResource(w7e.urbanpro);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case -713507699:
                if (lowerCase.equals("indiamart")) {
                    imageView.setImageResource(w7e.indiamart);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case -178324326:
                if (lowerCase.equals("calendly")) {
                    imageView.setImageResource(w7e.calendly);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case -79386020:
                if (lowerCase.equals("justdial")) {
                    imageView.setImageResource(w7e.jdshort);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 117734:
                if (lowerCase.equals("wix")) {
                    imageView.setImageResource(w7e.wix);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 24625183:
                if (lowerCase.equals("cashfree")) {
                    imageView.setImageResource(w7e.cashfree);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 28903346:
                if (lowerCase.equals("instagram")) {
                    imageView.setImageResource(w7e.ig);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 92576527:
                if (lowerCase.equals("aajjo")) {
                    imageView.setImageResource(w7e.aajjo);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 497130182:
                if (lowerCase.equals("facebook")) {
                    imageView.setImageResource(w7e.external_logo_facebook);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 604200602:
                if (lowerCase.equals("razorpay")) {
                    imageView.setImageResource(w7e.razorpay_glyph);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 1100520413:
                if (lowerCase.equals("housing")) {
                    imageView.setImageResource(w7e.housing);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 1223953944:
                if (lowerCase.equals("webform")) {
                    imageView.setImageResource(w7e.webform);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 1523815487:
                if (lowerCase.equals("magicbricks")) {
                    imageView.setImageResource(w7e.magicbricks);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 1884714579:
                if (lowerCase.equals("tradeindia")) {
                    imageView.setImageResource(w7e.tradeindia);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 1934780818:
                if (lowerCase.equals("whatsapp")) {
                    imageView.setImageResource(w7e.wa);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 1948103513:
                if (lowerCase.equals("googleleadform")) {
                    imageView.setImageResource(w7e.google_ad);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 2118220354:
                if (lowerCase.equals("salesmaxapi")) {
                    imageView.setImageResource(w7e.api);
                    imageView.setVisibility(0);
                    return;
                }
                break;
        }
        imageView.setVisibility(8);
    }

    public static final void M1(TextView textView, TemplateVariable templateVariable) {
        if (textView == null || templateVariable == null) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        textView.setText(templateVariable.getTaType() + " {{" + templateVariable.getVariableId() + "}}");
        textView.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void M2(MaterialButton materialButton, LeadsUser leadsUser) {
        int i;
        if (materialButton == null || leadsUser == null || leadsUser.getUserActivityStatus() == null) {
            return;
        }
        String userActivityStatus = leadsUser.getUserActivityStatus();
        sq8.m48646e(userActivityStatus);
        String strM49851c = th1.m49851c(userActivityStatus);
        String userActivityStatus2 = leadsUser.getUserActivityStatus();
        sq8.m48646e(userActivityStatus2);
        String string = f9g.Z0(userActivityStatus2).toString();
        Locale locale = Locale.ROOT;
        String upperCase = string.toUpperCase(locale);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        int iHashCode = upperCase.hashCode();
        if (iHashCode != -1616953765) {
            if (iHashCode != -814438578) {
                if (iHashCode == 1925346054 && upperCase.equals("ACTIVE")) {
                    i = u6e.superfone_green;
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Long lastActivityTime = leadsUser.getLastActivityTime();
                    sq8.m48646e(lastActivityTime);
                    i = jCurrentTimeMillis - lastActivityTime.longValue() <= PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS ? u6e.superfone_green : u6e.superfone_red;
                }
            } else if (upperCase.equals("REQUESTED")) {
                i = u6e.superfone_orange;
            }
        } else if (upperCase.equals("INVITED")) {
            i = u6e.superfone_blue;
        }
        String lowerCase = strM49851c.toLowerCase(locale);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        materialButton.setText(th1.m49851c(lowerCase));
        materialButton.setBackgroundColor(c64.getColor(materialButton.getContext(), i));
        materialButton.setStrokeColorResource(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m40943N(Chip chip, ChatChannel chatChannel) {
        String strValueOf;
        boolean z;
        boolean z2;
        String upperCase;
        String string;
        String string2;
        if (chip == null || chatChannel == null) {
            if (chip != null) {
                wwe.m55302a(chip, 8);
                return;
            }
            return;
        }
        String chatUserProfile = chatChannel.getChatUserProfile();
        if (chatChannel.getChatUserName() == null) {
            strValueOf = "";
        } else {
            String chatUserName = chatChannel.getChatUserName();
            if (chatUserName == null) {
                z = false;
                if (z) {
                    String chatUserName2 = chatChannel.getChatUserName();
                    if (chatUserName2 == null || (string2 = f9g.Z0(chatUserName2).toString()) == null) {
                        z2 = false;
                        if (!z2) {
                            String chatUserName3 = chatChannel.getChatUserName();
                            if (chatUserName3 == null || (string = f9g.Z0(chatUserName3).toString()) == null) {
                                upperCase = null;
                            } else {
                                String strValueOf2 = String.valueOf(string.charAt(0));
                                sq8.m48647f(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                                upperCase = strValueOf2.toUpperCase(Locale.ROOT);
                                sq8.m48648g(upperCase, "toUpperCase(...)");
                            }
                            strValueOf = String.valueOf(upperCase);
                        }
                    } else {
                        if (string2.length() > 0) {
                            z2 = true;
                        }
                        if (!z2) {
                        }
                    }
                }
            } else {
                if (chatUserName.length() > 0) {
                    z = true;
                }
                if (z) {
                }
            }
        }
        String chatUserId = chatChannel.getChatUserId();
        if (!(chatUserProfile == null || chatUserProfile.length() == 0) && !f9g.m26306P(chatUserProfile, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null)) {
            pu5.m44193b().m44195c(chip, chatUserProfile);
            return;
        }
        if (!(chatUserId == null || chatUserId.length() == 0)) {
            if (!(strValueOf.length() == 0)) {
                chip.setChipIcon(xgh.m56281a().mo56294a(strValueOf, oh3.f38348d.m42239b(chatUserId), 20));
                return;
            }
        }
        chip.setChipIconVisible(false);
    }

    public static final void N0(ImageView imageView, Leads leads) {
        if (imageView == null || leads == null) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        if (!((leads.isCustomer() != null && leads.isCustomer().equals("true")) || sq8.m48644c(leads.getLeadLifecycleStageSubCategory(), "OPPORTUNITY_WON"))) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        Drawable drawable = c64.getDrawable(imageView.getContext(), w7e.ic_crown);
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        int color = c64.getColor(imageView.getContext(), u6e.backgroundVisits);
        if (drawableMutate != null) {
            fy5.m27740n(drawableMutate, color);
        }
        imageView.setImageDrawable(drawableMutate);
    }

    public static final void N1(ImageView imageView, FileData fileData) {
        if (imageView == null || fileData == null) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        String[] strArr = {"jpg", "png", "gif", "jpeg", "webp", "image/gif", "image/jpg", "image/png", "image/jpeg", "image/webp"};
        if ((fileData.getMimeType().length() > 0) && gp0.m29251R(strArr, fileData.getMimeType())) {
            if (fileData.getThumbNailUri().length() > 0) {
                pu5.m44193b().m44197e(imageView, fileData.getThumbNailUri());
            } else {
                if ((fileData.getUploadedUri().length() > 0) && fileData.isUploaded()) {
                    pu5.m44193b().m44197e(imageView, fileData.getUploadedUri());
                } else if (fileData.getContentUri() != null) {
                    ws7.m54949a(imageView.getContext()).m21756G(fileData.getContentUri()).N0(ny5.m41226j()).A0(imageView);
                }
            }
            imageView.setVisibility(0);
            return;
        }
        if (fileData.getThumbNailUri().length() > 0) {
            imageView.setVisibility(0);
            pu5.m44193b().m44197e(imageView, fileData.getThumbNailUri());
        } else if (!e9g.m24597K(fileData.getMimeType(), "video", false, 2, null)) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            pu5.m44193b().m44197e(imageView, fileData.getUploadedUri());
        }
    }

    public static final void N2(ShapeableImageView shapeableImageView, Boolean bool) {
        if (shapeableImageView != null && bool != null && sq8.m48644c(bool, Boolean.TRUE)) {
            shapeableImageView.setVisibility(0);
        } else {
            if (shapeableImageView == null) {
                return;
            }
            shapeableImageView.setVisibility(8);
        }
    }

    /* renamed from: O */
    public static final void m40944O(Chip chip, Leads leads) {
        if (chip == null || leads == null) {
            if (chip == null) {
                return;
            }
            chip.setChipIcon(null);
            return;
        }
        chip.setChipIcon(null);
        String contactOwnerProfile = leads.getContactOwnerProfile();
        if ((contactOwnerProfile == null || contactOwnerProfile.length() == 0) || f9g.m26306P(contactOwnerProfile, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null)) {
            W2(leads.getContactOwner(), leads.getContactOwnerID(), chip);
        } else {
            pu5.m44193b().m44195c(chip, contactOwnerProfile);
        }
    }

    public static final void O0(TextView textView, Leads leads) {
        if (textView == null || leads == null) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        String latestRemark = leads.getLatestRemark();
        String strSubstring = "";
        if (!(latestRemark == null || f9g.d0(latestRemark))) {
            String lowerCase = e9g.m24593G(f9g.w0(leads.getLatestRemark(), ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR), "\\n", "\n", false, 4, null).toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            strSubstring = "" + (th1.m49850b(lowerCase) + "\n");
        }
        if (!(strSubstring.length() > 0)) {
            textView.setVisibility(8);
            return;
        }
        if (e9g.m24605w(strSubstring, "\n", false, 2, null)) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            sq8.m48648g(strSubstring, "substring(...)");
        }
        textView.setText(strSubstring);
        textView.setVisibility(0);
    }

    public static final void O1(ImageView imageView, FileData fileData) {
        if (imageView == null || fileData == null) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        String[] strArr = {"jpg", "png", "gif", "jpeg", "webp", "image/gif", "image/jpg", "image/png", "image/jpeg", "image/webp"};
        if (!(fileData.getMimeType().length() > 0) || !gp0.m29251R(strArr, fileData.getMimeType())) {
            imageView.setVisibility(8);
            return;
        }
        if (fileData.getThumbNailUri().length() > 0) {
            pu5.m44193b().m44197e(imageView, fileData.getThumbNailUri());
        } else {
            if ((fileData.getUploadedUri().length() > 0) && fileData.isUploaded()) {
                pu5.m44193b().m44197e(imageView, fileData.getUploadedUri());
            } else if (fileData.getContentUri() != null) {
                ws7.m54949a(imageView.getContext()).m21756G(fileData.getContentUri()).N0(ny5.m41226j()).A0(imageView);
            }
        }
        imageView.setVisibility(0);
    }

    public static final void O2(MaterialCardView materialCardView, Leads leads) {
        if (materialCardView == null || leads == null) {
            if (materialCardView != null) {
                materialCardView.setVisibility(8);
            }
        } else if (leads.getShowSelection() || leads.getPaymentRequestDetail() == null) {
            materialCardView.setVisibility(8);
        } else if (leads.getPaymentRequestDetail() != null) {
            materialCardView.setVisibility(0);
        } else {
            materialCardView.setVisibility(8);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: P */
    public static final void m40945P(Chip chip, PropertyOptions propertyOptions) {
        if (chip == null || propertyOptions == null) {
            return;
        }
        String value = propertyOptions.getValue();
        Locale locale = Locale.getDefault();
        sq8.m48648g(locale, "getDefault(...)");
        String lowerCase = value.toLowerCase(locale);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -1918536447:
                if (lowerCase.equals("commonfloor")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.commonfloor));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -1858793111:
                if (lowerCase.equals("sulekha")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.sulekha));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -1680625545:
                if (lowerCase.equals("whatsapp_business_login")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.wa));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -1647335718:
                if (lowerCase.equals("shared_mailbox")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.inbox));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -1420744429:
                if (lowerCase.equals("jotform")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.jotform));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -1254789861:
                if (lowerCase.equals("urbanpro")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.urbanpro));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -713507699:
                if (lowerCase.equals("indiamart")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.indiamart));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -178324326:
                if (lowerCase.equals("calendly")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.calendly));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -79386020:
                if (lowerCase.equals("justdial")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.jdshort));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 117734:
                if (lowerCase.equals("wix")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.wix));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 24625183:
                if (lowerCase.equals("cashfree")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.cashfree));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 28903346:
                if (lowerCase.equals("instagram")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.ig));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 92576527:
                if (lowerCase.equals("aajjo")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.aajjo));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 497130182:
                if (lowerCase.equals("facebook")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.external_logo_facebook));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 604200602:
                if (lowerCase.equals("razorpay")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.razorpay_glyph));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 1100520413:
                if (lowerCase.equals("housing")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.housing));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 1223953944:
                if (lowerCase.equals("webform")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.webform));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 1523815487:
                if (lowerCase.equals("magicbricks")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.magicbricks));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 1884714579:
                if (lowerCase.equals("tradeindia")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.tradeindia));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 1948103513:
                if (lowerCase.equals("googleleadform")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.google_ad));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 2118220354:
                if (lowerCase.equals("salesmaxapi")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.api));
                    chip.setVisibility(0);
                    return;
                }
                break;
        }
        chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.ic_tasks));
        chip.setVisibility(0);
    }

    public static final void P0(TextView textView, Leads leads) {
        if (textView == null || leads == null) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        String latestRemark = leads.getLatestRemark();
        String strSubstring = "";
        if (!(latestRemark == null || f9g.d0(latestRemark))) {
            String lowerCase = e9g.m24593G(f9g.w0(leads.getLatestRemark(), ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR), "\\n", "\n", false, 4, null).toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            strSubstring = "" + (th1.m49850b(lowerCase) + "\n");
        }
        if (sq8.m48644c(leads.getLastDealStageType(), "ACTIVE")) {
            strSubstring = strSubstring + "Running Deal Stage : " + leads.getActiveDealStage() + "\n";
        }
        if (leads.getOpenTaskDetail() != null) {
            OpenTaskDetail openTaskDetail = leads.getOpenTaskDetail();
            sq8.m48646e(openTaskDetail);
            String taskType = openTaskDetail.getTaskType();
            if (!(taskType == null || taskType.length() == 0)) {
                OpenTaskDetail openTaskDetail2 = leads.getOpenTaskDetail();
                sq8.m48646e(openTaskDetail2);
                String taskType2 = openTaskDetail2.getTaskType();
                sq8.m48646e(taskType2);
                String lowerCase2 = taskType2.toLowerCase(Locale.ROOT);
                sq8.m48648g(lowerCase2, "toLowerCase(...)");
                strSubstring = strSubstring + "Open task : " + th1.m49850b(th1.m49854f(lowerCase2)) + "\n";
            }
        }
        if (!(strSubstring.length() > 0)) {
            textView.setVisibility(8);
            return;
        }
        if (e9g.m24605w(strSubstring, "\n", false, 2, null)) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            sq8.m48648g(strSubstring, "substring(...)");
        }
        textView.setText(strSubstring);
        textView.setVisibility(0);
    }

    public static final void P1(ImageView imageView, Template template) {
        if (imageView == null || template == null) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        String[] strArr = {"jpg", "png", "gif", "jpeg", "webp", "image/gif", "image/jpg", "image/png", "image/jpeg", "image/webp"};
        if (!(template.getFileMimeType().length() > 0) || !gp0.m29251R(strArr, template.getFileMimeType())) {
            imageView.setVisibility(8);
            return;
        }
        if (template.getThumbNailUri().length() > 0) {
            pu5.m44193b().m44197e(imageView, template.getThumbNailUri());
        } else {
            pu5.m44193b().m44197e(imageView, template.getFileUrl());
        }
        imageView.setVisibility(0);
    }

    public static final void P2(MaterialCardView materialCardView, Leads leads) {
        if (materialCardView == null || leads == null) {
            if (materialCardView != null) {
                materialCardView.setVisibility(8);
                return;
            }
            return;
        }
        if (leads.getShowSelection() || leads.getOpenVideoCallDetail() == null) {
            materialCardView.setVisibility(8);
            return;
        }
        if (leads.getOpenVideoCallDetail() != null) {
            VideoMeeting openVideoCallDetail = leads.getOpenVideoCallDetail();
            sq8.m48646e(openVideoCallDetail);
            if (openVideoCallDetail.getDueDate() != null) {
                long jM16664s = a81.m16664s();
                VideoMeeting openVideoCallDetail2 = leads.getOpenVideoCallDetail();
                sq8.m48646e(openVideoCallDetail2);
                if (Instant.parse(openVideoCallDetail2.getDueDate()).toEpochMilli() < jM16664s) {
                    materialCardView.setVisibility(8);
                    return;
                } else {
                    materialCardView.setVisibility(0);
                    return;
                }
            }
        }
        materialCardView.setVisibility(8);
    }

    /* renamed from: Q */
    public static final void m40946Q(Chip chip, Tasks tasks) {
        if (chip == null || tasks == null) {
            return;
        }
        String clientProfilePic = tasks.getClientProfilePic();
        if ((clientProfilePic == null || clientProfilePic.length() == 0) || f9g.m26306P(clientProfilePic, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null)) {
            W2(tasks.getClientName(), tasks.getClientID(), chip);
        } else {
            pu5.m44193b().m44195c(chip, clientProfilePic);
        }
    }

    public static final void Q0(MaterialCardView materialCardView, Leads leads) {
        if (materialCardView == null || leads == null) {
            if (materialCardView == null) {
                return;
            }
            materialCardView.setVisibility(8);
            return;
        }
        String latestRemark = leads.getLatestRemark();
        String str = "";
        if (!(latestRemark == null || f9g.d0(latestRemark))) {
            String lowerCase = e9g.m24593G(f9g.w0(leads.getLatestRemark(), ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR), "\\n", "\n", false, 4, null).toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            str = "" + (th1.m49850b(lowerCase) + "\n");
        }
        if (sq8.m48644c(leads.getLastDealStageType(), "ACTIVE")) {
            str = str + "Running Deal Stage : " + leads.getActiveDealStage() + "\n";
        }
        if (leads.getOpenTaskDetail() != null) {
            OpenTaskDetail openTaskDetail = leads.getOpenTaskDetail();
            sq8.m48646e(openTaskDetail);
            String taskType = openTaskDetail.getTaskType();
            if (!(taskType == null || taskType.length() == 0)) {
                OpenTaskDetail openTaskDetail2 = leads.getOpenTaskDetail();
                sq8.m48646e(openTaskDetail2);
                String taskType2 = openTaskDetail2.getTaskType();
                sq8.m48646e(taskType2);
                String lowerCase2 = taskType2.toLowerCase(Locale.ROOT);
                sq8.m48648g(lowerCase2, "toLowerCase(...)");
                str = str + "Open task : " + th1.m49850b(th1.m49854f(lowerCase2)) + "\n";
            }
        }
        if (str.length() > 0) {
            materialCardView.setVisibility(0);
        } else {
            materialCardView.setVisibility(8);
        }
    }

    public static final void Q1(TextView textView, ChatMessages chatMessages) {
        if (textView == null || chatMessages == null || chatMessages.getErrorMessages() == null) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(chatMessages.getErrorMessages()).optJSONArray("errors");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                textView.setVisibility(8);
            } else {
                String strOptString = jSONArrayOptJSONArray.getJSONObject(0).optString(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, "");
                sq8.m48646e(strOptString);
                if (!f9g.d0(strOptString)) {
                    textView.setText(strOptString);
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            }
        } catch (Exception unused) {
            textView.setVisibility(8);
        }
    }

    public static final void Q2(ShapeableImageView shapeableImageView, Leads leads) {
        if (shapeableImageView == null || leads == null) {
            if (shapeableImageView != null) {
                shapeableImageView.setVisibility(8);
                return;
            }
            return;
        }
        if (leads.getOpenVideoCallDetail() != null) {
            VideoMeeting openVideoCallDetail = leads.getOpenVideoCallDetail();
            sq8.m48646e(openVideoCallDetail);
            if (openVideoCallDetail.getDueDate() != null) {
                long jM16664s = a81.m16664s();
                VideoMeeting openVideoCallDetail2 = leads.getOpenVideoCallDetail();
                sq8.m48646e(openVideoCallDetail2);
                if (Instant.parse(openVideoCallDetail2.getDueDate()).toEpochMilli() < jM16664s) {
                    shapeableImageView.setVisibility(8);
                    return;
                } else {
                    shapeableImageView.setVisibility(0);
                    return;
                }
            }
        }
        shapeableImageView.setVisibility(8);
    }

    /* renamed from: R */
    public static final void m40947R(Chip chip, Tasks tasks) {
        if (chip == null || tasks == null) {
            return;
        }
        String taskAssignedToProfilePic = tasks.getTaskAssignedToProfilePic();
        if ((taskAssignedToProfilePic == null || taskAssignedToProfilePic.length() == 0) || f9g.m26306P(taskAssignedToProfilePic, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null)) {
            W2(tasks.getTaskAssignedTo(), tasks.getTaskAssignedToID(), chip);
        } else {
            pu5.m44193b().m44195c(chip, taskAssignedToProfilePic);
        }
    }

    public static final void R0(TextView textView, Leads leads) {
        if (textView == null || leads == null) {
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        String str = leads.getBulkUploadReference().length() > 0 ? "Bulk Upload" : "";
        if (!f9g.d0(leads.getContactSource())) {
            if (leads.getContactSource().length() > 0) {
                str = str + "source : " + leads.getContactSource();
            }
            if (leads.getContactSourceOne().length() > 0) {
                str = str + "\nDrillDown1 : " + leads.getContactSourceOne();
            }
            if (leads.getContactSourceTwo().length() > 0) {
                str = str + "\nDrillDown2 : " + leads.getContactSourceTwo();
            }
            if (leads.getContactSourceThree().length() > 0) {
                str = str + "\nDrillDown3 : " + leads.getContactSourceThree();
            }
        }
        textView.setText(str);
        if (sq8.m48644c(str, "")) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public static final void R1(TextView textView, ChatChannel chatChannel) {
        int color;
        String str;
        User userM39171u;
        if (textView == null || chatChannel == null || chatChannel.getLastMessage() == null) {
            if (textView == null) {
                return;
            }
            textView.setText(" ");
            return;
        }
        ChatMessages lastMessage = chatChannel.getLastMessage();
        if (lastMessage != null) {
            if (chatChannel.getUnreadMessageCount() > 0) {
                color = c64.getColor(textView.getContext(), u6e.superfone_black);
                textView.setTypeface(null, 3);
            } else {
                color = c64.getColor(textView.getContext(), u6e.superfone_gray);
                textView.setTypeface(null, 2);
            }
            textView.setTextColor(color);
            mii miiVarM54444J = wi0.m54444J();
            String id = (miiVarM54444J == null || (userM39171u = miiVarM54444J.m39171u()) == null) ? null : userM39171u.getId();
            Boolean boolIsInbound = lastMessage.isInbound();
            Boolean bool = Boolean.FALSE;
            if (sq8.m48644c(boolIsInbound, bool) && sq8.m48644c(id, lastMessage.getMessageUserId())) {
                str = "You : ";
            } else if (!sq8.m48644c(lastMessage.isInbound(), bool) || lastMessage.getMessageUserName() == null) {
                str = sq8.m48644c(lastMessage.isInbound(), Boolean.TRUE) ? "Lead : " : " ";
            } else {
                String messageUserName = lastMessage.getMessageUserName();
                sq8.m48646e(messageUserName);
                str = th1.m49850b(messageUserName) + " : ";
            }
            if (lastMessage.getMessageText() != null) {
                String messageText = lastMessage.getMessageText();
                sq8.m48646e(messageText);
                if (messageText.length() > 0) {
                    textView.setText(str + lastMessage.getMessageText());
                    return;
                }
            }
            if (lastMessage.getMessageFile() != null) {
                FileData messageFile = lastMessage.getMessageFile();
                sq8.m48646e(messageFile);
                if (messageFile.getUploadedUri().length() > 0) {
                    FileData messageFile2 = lastMessage.getMessageFile();
                    sq8.m48646e(messageFile2);
                    if (e9g.m24597K(messageFile2.getMimeType(), "image", false, 2, null)) {
                        textView.setText(str + "Image");
                        return;
                    }
                    FileData messageFile3 = lastMessage.getMessageFile();
                    sq8.m48646e(messageFile3);
                    if (e9g.m24597K(messageFile3.getMimeType(), "video", false, 2, null)) {
                        textView.setText(str + "Video");
                        return;
                    }
                    FileData messageFile4 = lastMessage.getMessageFile();
                    sq8.m48646e(messageFile4);
                    if (e9g.m24597K(messageFile4.getMimeType(), "audio", false, 2, null)) {
                        textView.setText(str + "Audio");
                        return;
                    }
                    textView.setText(str + "Document");
                    return;
                }
            }
            textView.setText(" ");
        }
    }

    public static final void R2(ImageView imageView, String str) {
        if (imageView != null) {
            if (str == null || str.length() == 0) {
                return;
            }
            if (e9g.m24597K(str, "https", false, 2, null)) {
                ws7.m54949a(imageView.getContext()).m21758I(str.toString()).mo17819i(qt5.f42382a).N0(ny5.m41226j()).A0(imageView);
            } else {
                imageView.setImageResource(R.color.transparent);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: S */
    public static final void m40948S(Chip chip, Leads leads) {
        if (chip == null || leads == null) {
            if (chip == null) {
                return;
            }
            chip.setVisibility(8);
            return;
        }
        String contactSource = leads.getContactSource();
        if (contactSource == null || contactSource.length() == 0) {
            chip.setVisibility(8);
            return;
        }
        String contactSource2 = leads.getContactSource();
        Locale locale = Locale.getDefault();
        sq8.m48648g(locale, "getDefault(...)");
        String lowerCase = contactSource2.toLowerCase(locale);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -1918536447:
                if (lowerCase.equals("commonfloor")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.commonfloor));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -1858793111:
                if (lowerCase.equals("sulekha")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.sulekha));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -1680625545:
                if (lowerCase.equals("whatsapp_business_login")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.wa));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -1647335718:
                if (lowerCase.equals("shared_mailbox")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.inbox));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -1420744429:
                if (lowerCase.equals("jotform")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.jotform));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -1254789861:
                if (lowerCase.equals("urbanpro")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.urbanpro));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -713507699:
                if (lowerCase.equals("indiamart")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.indiamart));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -178324326:
                if (lowerCase.equals("calendly")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.calendly));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case -79386020:
                if (lowerCase.equals("justdial")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.jdshort));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 117734:
                if (lowerCase.equals("wix")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.wix));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 24625183:
                if (lowerCase.equals("cashfree")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.cashfree));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 28903346:
                if (lowerCase.equals("instagram")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.ig));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 92576527:
                if (lowerCase.equals("aajjo")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.aajjo));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 497130182:
                if (lowerCase.equals("facebook")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.external_logo_facebook));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 604200602:
                if (lowerCase.equals("razorpay")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.razorpay_glyph));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 1100520413:
                if (lowerCase.equals("housing")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.housing));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 1223953944:
                if (lowerCase.equals("webform")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.ic_form));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 1523815487:
                if (lowerCase.equals("magicbricks")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.magicbricks));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 1884714579:
                if (lowerCase.equals("tradeindia")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.tradeindia));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 1948103513:
                if (lowerCase.equals("googleleadform")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.google_ad));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
            case 2118220354:
                if (lowerCase.equals("salesmaxapi")) {
                    chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.api));
                    chip.setText(th1.m49850b(leads.getContactSource()));
                    chip.setVisibility(0);
                    return;
                }
                break;
        }
        chip.setChipIcon(c64.getDrawable(chip.getContext(), w7e.ic_source));
        chip.setText(th1.m49850b(leads.getContactSource()));
        chip.setVisibility(0);
    }

    public static final void S0(ImageView imageView, LeadTeamMember leadTeamMember) {
        String profilePic;
        if (imageView == null || leadTeamMember == null) {
            return;
        }
        String upperCase = "";
        if (leadTeamMember.getProfilePic() != null) {
            profilePic = leadTeamMember.getProfilePic();
            sq8.m48646e(profilePic);
        } else {
            profilePic = "";
        }
        String id = leadTeamMember.getId();
        if (leadTeamMember.getUserName() != null) {
            String userName = leadTeamMember.getUserName();
            sq8.m48646e(userName);
            if (userName.length() > 0) {
                String userName2 = leadTeamMember.getUserName();
                sq8.m48646e(userName2);
                if (f9g.Z0(userName2).toString().length() > 0) {
                    String userName3 = leadTeamMember.getUserName();
                    sq8.m48646e(userName3);
                    String strValueOf = String.valueOf(f9g.Z0(userName3).toString().charAt(0));
                    sq8.m48647f(strValueOf, "null cannot be cast to non-null type java.lang.String");
                    upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    sq8.m48648g(upperCase, "toUpperCase(...)");
                }
            }
        }
        if (!(profilePic.length() == 0) && !f9g.m26306P(profilePic, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null)) {
            pu5.m44193b().m44196d(imageView, profilePic);
            return;
        }
        if (!(id.length() == 0)) {
            if (!(upperCase.length() == 0)) {
                imageView.setImageDrawable(xgh.m56281a().mo56294a(upperCase, oh3.f38348d.m42239b(id), 20));
                return;
            }
        }
        imageView.setImageResource(R.color.transparent);
    }

    public static final void S1(TextView textView, Integer num) {
        if (textView == null || num == null) {
            return;
        }
        c64.getColor(textView.getContext(), u6e.superfone_black_70);
        String string = num.toString();
        if (num.intValue() > 1) {
            textView.setText(string + " Tries");
        } else {
            textView.setText(string + " Try");
        }
        textView.setBackgroundTintList(ColorStateList.valueOf(num.intValue() == 1 ? c64.getColor(textView.getContext(), u6e.superfone_green) : num.intValue() < 3 ? c64.getColor(textView.getContext(), u6e.superfone_blue) : num.intValue() < 5 ? c64.getColor(textView.getContext(), u6e.superfone_orange) : c64.getColor(textView.getContext(), u6e.superfone_red)));
    }

    public static final void S2(ConstraintLayout constraintLayout, Long l) {
        if (constraintLayout == null || l == null || System.currentTimeMillis() <= l.longValue()) {
            return;
        }
        constraintLayout.setBackgroundColor(c64.getColor(constraintLayout.getContext(), u6e.superfone_purple_10));
    }

    /* renamed from: T */
    public static final void m40949T(LinearLayout linearLayout, Leads leads) {
        if (linearLayout == null || leads == null) {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else if (leads.getLeadLifecycleStage() == null || (leads.getLeadLifecycleStage() != null && (sq8.m48644c(leads.getLeadLifecycleStage(), "UNCONTACTED_NEW") || sq8.m48644c(leads.getLeadLifecycleStage(), "UNCONTACTED_RECHURNED") || sq8.m48644c(leads.getLeadLifecycleStage(), "PROSPECTING")))) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void T0(TextView textView, Leads leads) {
        String str;
        String str2;
        if (textView == null || leads == null) {
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        boolean z = true;
        if (leads.getLeadLifecycleStage() != null) {
            String leadLifecycleStage = leads.getLeadLifecycleStage();
            if (leadLifecycleStage != null) {
                switch (leadLifecycleStage.hashCode()) {
                    case -1546296345:
                        if (!leadLifecycleStage.equals("UNCONTACTED_NEW")) {
                            str = "";
                            break;
                        } else if (leads.getLastLeadAssignmentDateTimeInMillis() <= 0) {
                            str = "New Lead";
                            break;
                        } else {
                            str = "New Lead @" + jm7.m34024J(leads.getLastLeadAssignmentDateTimeInMillis(), textView);
                            break;
                        }
                    case 595911679:
                        if (!leadLifecycleStage.equals("UNCONTACTED_RECHURNED")) {
                        }
                        break;
                    case 860781235:
                        if (leadLifecycleStage.equals("OPPORTUNITY") && leads.getActiveDealStageUpdatedAt() != null && leads.getActiveDealStage() != null) {
                            str = "Stage - " + th1.m49850b(leads.getActiveDealStage());
                            break;
                        }
                        break;
                    case 933641910:
                        if (leadLifecycleStage.equals("PROSPECTING")) {
                            String leadLifecycleStageViewValue = leads.getLeadLifecycleStageViewValue();
                            if (leadLifecycleStageViewValue == null) {
                                leadLifecycleStageViewValue = "Prospecting";
                            }
                            if (leads.getLeadLifecycleStageSubCategory() != null) {
                                String leadLifecycleStageSubCategory = leads.getLeadLifecycleStageSubCategory();
                                if (sq8.m48644c(leadLifecycleStageSubCategory, "PROSPECTING_NO_OUTCOME")) {
                                    leadLifecycleStageViewValue = "No Outcome";
                                } else if (sq8.m48644c(leadLifecycleStageSubCategory, "PROSPECTING_OUTCOME")) {
                                    String lastKnownDisposition = leads.getLastKnownDisposition();
                                    if (lastKnownDisposition != null && lastKnownDisposition.length() != 0) {
                                        z = false;
                                    }
                                    if (!z) {
                                        String lowerCase = leads.getLastKnownDisposition().toLowerCase(Locale.ROOT);
                                        sq8.m48648g(lowerCase, "toLowerCase(...)");
                                        leadLifecycleStageViewValue = "Outcome " + th1.m49850b(th1.m49854f(lowerCase));
                                    }
                                }
                            }
                            if (leads.getProspectingAttempts() != null) {
                                str2 = leads.getProspectingAttempts() + " Try ";
                            } else {
                                str2 = "";
                            }
                            str = str2 + leadLifecycleStageViewValue;
                            break;
                        }
                        break;
                    case 1990776172:
                        if (leadLifecycleStage.equals("CLOSED")) {
                            if (leads.getLeadLifecycleStageSubCategory() == null) {
                                str = "Closed Lead";
                                break;
                            } else {
                                String leadLifecycleStageSubCategory2 = leads.getLeadLifecycleStageSubCategory();
                                if (leadLifecycleStageSubCategory2 != null) {
                                    switch (leadLifecycleStageSubCategory2.hashCode()) {
                                        case -1972124773:
                                            if (leadLifecycleStageSubCategory2.equals("CLOSED_NEGATIVE_OUTCOME")) {
                                                String lastCallOutcome = leads.getLastCallOutcome();
                                                if (lastCallOutcome != null && lastCallOutcome.length() != 0) {
                                                    z = false;
                                                }
                                                if (!z) {
                                                    String lowerCase2 = leads.getLastCallOutcome().toLowerCase(Locale.ROOT);
                                                    sq8.m48648g(lowerCase2, "toLowerCase(...)");
                                                    str = "Negative Outcome " + th1.m49850b(th1.m49854f(lowerCase2));
                                                    break;
                                                } else {
                                                    str = "Negative Outcome";
                                                    break;
                                                }
                                            }
                                            break;
                                        case -1841671687:
                                            if (leadLifecycleStageSubCategory2.equals("CLOSED_MANUAL")) {
                                                String manuallyClosedReason = leads.getManuallyClosedReason();
                                                if (manuallyClosedReason != null && manuallyClosedReason.length() != 0) {
                                                    z = false;
                                                }
                                                if (!z) {
                                                    str = "Closed - " + leads.getManuallyClosedReason();
                                                    break;
                                                } else {
                                                    str = "Manually Closed";
                                                    break;
                                                }
                                            }
                                            break;
                                        case -1652004630:
                                            if (leadLifecycleStageSubCategory2.equals("OPPORTUNITY_WON")) {
                                                str = "Deal Won";
                                                break;
                                            }
                                            break;
                                        case -1082158593:
                                            if (leadLifecycleStageSubCategory2.equals("CLOSED_PROSPECTING_ATTEMPTS_DONE")) {
                                                str = "Prospecting Attempts Done";
                                                break;
                                            }
                                            break;
                                        case -183949782:
                                            if (leadLifecycleStageSubCategory2.equals("CLOSED_PROSPECTING_TIME_OVER")) {
                                                str = "Time to Prospect Over";
                                                break;
                                            }
                                            break;
                                        case 327136560:
                                            if (leadLifecycleStageSubCategory2.equals("OPPORTUNITY_LOST")) {
                                                str = "Deal Lost";
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        } else {
            Date activeDealStageUpdatedAt = leads.getActiveDealStageUpdatedAt();
            String dealDescription = leads.getDealDescription();
            if (dealDescription != null && dealDescription.length() != 0) {
                z = false;
            }
            if (!z && activeDealStageUpdatedAt != null && leads.getActiveDealStage() != null) {
                str = th1.m49850b(leads.getActiveDealStage()) + " @" + jm7.m34024J(activeDealStageUpdatedAt.getTime(), textView) + " : " + leads.getDealDescription();
            } else if (activeDealStageUpdatedAt != null && leads.getActiveDealStage() != null) {
                str = th1.m49850b(leads.getActiveDealStage()) + " @" + jm7.m34024J(activeDealStageUpdatedAt.getTime(), textView);
            }
        }
        if (sq8.m48644c(str, "")) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void T1(ShapeableImageView shapeableImageView, Tasks tasks) {
        int i;
        int i2 = w7e.ic_call_in;
        if (shapeableImageView != null && tasks != null && sq8.m48644c(tasks.getTaskEngagementType(), "CALL")) {
            i2 = (tasks.getCallDurationInMillis() == 0 && sq8.m48644c(tasks.getCallDirection(), "INCOMING")) ? w7e.ic_home_calls_missed : (tasks.getCallDurationInMillis() == 0 && sq8.m48644c(tasks.getCallDirection(), "OUTGOING")) ? w7e.ic_call_missed : (tasks.getCallDurationInMillis() <= 0 || !sq8.m48644c(tasks.getCallDirection(), "INCOMING")) ? w7e.ic_call_out : w7e.ic_call_in;
            shapeableImageView.setVisibility(0);
        } else if (shapeableImageView != null && tasks != null) {
            String taskEngagementType = tasks.getTaskEngagementType();
            switch (taskEngagementType.hashCode()) {
                case -1577559662:
                    if (!taskEngagementType.equals("WHATSAPP")) {
                        i2 = w7e.ic_call_in;
                        break;
                    } else {
                        i2 = w7e.ic_whatsapp;
                        break;
                    }
                case 82233:
                    if (taskEngagementType.equals("SMS")) {
                        i2 = w7e.ic_message_text;
                        break;
                    }
                    break;
                case 2060894:
                    if (taskEngagementType.equals("CALL")) {
                        i2 = w7e.ic_add_task_call;
                        break;
                    }
                    break;
                case 2402290:
                    if (taskEngagementType.equals("NOTE")) {
                        i2 = w7e.ic_add_notes;
                        break;
                    }
                    break;
                case 2567557:
                    if (taskEngagementType.equals("TASK")) {
                        i2 = w7e.ic_tasks;
                        break;
                    }
                    break;
                case 66081660:
                    if (taskEngagementType.equals("EMAIL")) {
                        i2 = w7e.ic_email;
                        break;
                    }
                    break;
                case 81679659:
                    if (taskEngagementType.equals("VISIT")) {
                        i2 = w7e.ic_add_visit;
                        break;
                    }
                    break;
            }
            String taskEngagementType2 = tasks.getTaskEngagementType();
            switch (taskEngagementType2.hashCode()) {
                case -1577559662:
                    if (!taskEngagementType2.equals("WHATSAPP")) {
                        i = u6e.superfone_blue;
                        break;
                    } else {
                        i = u6e.superfone_green;
                        break;
                    }
                case 82233:
                    if (taskEngagementType2.equals("SMS")) {
                        i = u6e.superfone_purple;
                        break;
                    }
                    break;
                case 2060894:
                    if (taskEngagementType2.equals("CALL")) {
                        i = u6e.backgroundCalls;
                        break;
                    }
                    break;
                case 2402290:
                    if (taskEngagementType2.equals("NOTE")) {
                        i = u6e.backgroundAssigned;
                        break;
                    }
                    break;
                case 2567557:
                    if (taskEngagementType2.equals("TASK")) {
                        i = u6e.backgroundTasks;
                        break;
                    }
                    break;
                case 66081660:
                    if (taskEngagementType2.equals("EMAIL")) {
                        i = u6e.backgroundUnAssignedLeads;
                        break;
                    }
                    break;
                case 81679659:
                    if (taskEngagementType2.equals("VISIT")) {
                        i = u6e.backgroundVisits;
                        break;
                    }
                    break;
            }
            shapeableImageView.setImageTintList(ColorStateList.valueOf(c64.getColor(shapeableImageView.getContext(), i)));
        }
        if (shapeableImageView != null) {
            shapeableImageView.setImageResource(i2);
        }
    }

    public static final void T2(ImageView imageView, ChatMessages chatMessages) {
        if (imageView == null || chatMessages == null) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        if (chatMessages.getMessageFile() != null) {
            FileData messageFile = chatMessages.getMessageFile();
            sq8.m48646e(messageFile);
            if (e9g.m24597K(messageFile.getMimeType(), "video", false, 2, null)) {
                imageView.setVisibility(0);
                return;
            }
        }
        imageView.setVisibility(8);
    }

    /* renamed from: U */
    public static final void m40950U(LinearLayout linearLayout, Leads leads) {
        if (linearLayout == null || leads == null) {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else if (leads.getLeadLifecycleStage() == null || !sq8.m48644c(leads.getLeadLifecycleStage(), "CLOSED")) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03e7 A[PHI: r1
      0x03e7: PHI (r1v2 int) = 
      (r1v1 int)
      (r1v1 int)
      (r1v1 int)
      (r1v1 int)
      (r1v1 int)
      (r1v1 int)
      (r1v23 int)
      (r1v1 int)
      (r1v1 int)
      (r1v1 int)
      (r1v1 int)
      (r1v1 int)
      (r1v1 int)
      (r1v1 int)
      (r1v1 int)
      (r1v1 int)
      (r1v1 int)
     binds: [B:155:0x03bc, B:157:0x03c2, B:8:0x001e, B:130:0x0326, B:117:0x02da, B:102:0x0286, B:115:0x02d1, B:69:0x01c3, B:13:0x0039, B:23:0x0059, B:25:0x005f, B:56:0x0156, B:44:0x0106, B:40:0x00df, B:36:0x00b8, B:32:0x0091, B:28:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void U0(TextView textView, Leads leads) {
        String str;
        String strM48863f;
        int color;
        String str2;
        if (textView == null || leads == null) {
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        int color2 = c64.getColor(textView.getContext(), u6e.superfone_black_70);
        boolean z = true;
        if (leads.getLeadLifecycleStage() != null) {
            String leadLifecycleStage = leads.getLeadLifecycleStage();
            if (leadLifecycleStage != null) {
                switch (leadLifecycleStage.hashCode()) {
                    case -1546296345:
                        if (!leadLifecycleStage.equals("UNCONTACTED_NEW")) {
                            str = "";
                            break;
                        } else {
                            ss9 ss9VarJ0 = PropertyDefinitionRepository.o0().j0();
                            strM48863f = ss9VarJ0 != null ? ss9VarJ0.m48863f("UNCONTACTED_NEW") : null;
                            if (strM48863f == null) {
                                strM48863f = "New Lead";
                            }
                            if (leads.getLastLeadAssignmentDateTimeInMillis() > 0) {
                                str = strM48863f + " - " + jm7.m34024J(leads.getLastLeadAssignmentDateTimeInMillis(), textView);
                            } else {
                                str = strM48863f;
                            }
                            color2 = c64.getColor(textView.getContext(), u6e.superfone_blue);
                            break;
                        }
                    case 595911679:
                        if (leadLifecycleStage.equals("UNCONTACTED_RECHURNED")) {
                            ss9 ss9VarJ02 = PropertyDefinitionRepository.o0().j0();
                            strM48863f = ss9VarJ02 != null ? ss9VarJ02.m48863f("UNCONTACTED_RECHURNED") : null;
                            if (strM48863f == null) {
                                strM48863f = "Rechurned Lead";
                            }
                            if (leads.getLastLeadAssignmentDateTimeInMillis() > 0) {
                                str = strM48863f + " - " + jm7.m34024J(leads.getLastLeadAssignmentDateTimeInMillis(), textView);
                            } else {
                                str = strM48863f;
                            }
                            color2 = c64.getColor(textView.getContext(), u6e.superfone_blue);
                            break;
                        }
                        break;
                    case 860781235:
                        if (leadLifecycleStage.equals("OPPORTUNITY")) {
                            ss9 ss9VarJ03 = PropertyDefinitionRepository.o0().j0();
                            strM48863f = ss9VarJ03 != null ? ss9VarJ03.m48863f("OPPORTUNITY") : null;
                            if (strM48863f == null) {
                                strM48863f = "Opportunity";
                            }
                            Date activeDealStageUpdatedAt = leads.getActiveDealStageUpdatedAt();
                            color = c64.getColor(textView.getContext(), u6e.superfone_purple);
                            if (activeDealStageUpdatedAt != null && leads.getActiveDealStage() != null) {
                                str = strM48863f + " - Stage - " + th1.m49850b(leads.getActiveDealStage());
                                color2 = color;
                                break;
                            } else {
                                color2 = color;
                            }
                        }
                        str = "";
                        break;
                    case 933641910:
                        if (leadLifecycleStage.equals("PROSPECTING")) {
                            ss9 ss9VarJ04 = PropertyDefinitionRepository.o0().j0();
                            strM48863f = ss9VarJ04 != null ? ss9VarJ04.m48863f("PROSPECTING") : null;
                            if (strM48863f == null) {
                                strM48863f = "Prospecting";
                            }
                            String leadLifecycleStageViewValue = leads.getLeadLifecycleStageViewValue();
                            String str3 = leadLifecycleStageViewValue != null ? leadLifecycleStageViewValue : "Prospecting";
                            if (leads.getLeadLifecycleStageSubCategory() != null) {
                                String leadLifecycleStageSubCategory = leads.getLeadLifecycleStageSubCategory();
                                if (sq8.m48644c(leadLifecycleStageSubCategory, "PROSPECTING_NO_OUTCOME")) {
                                    str3 = strM48863f + " - No Outcome";
                                } else if (sq8.m48644c(leadLifecycleStageSubCategory, "PROSPECTING_OUTCOME")) {
                                    String lastKnownDisposition = leads.getLastKnownDisposition();
                                    if (lastKnownDisposition != null && lastKnownDisposition.length() != 0) {
                                        z = false;
                                    }
                                    if (!z) {
                                        String lowerCase = leads.getLastKnownDisposition().toLowerCase(Locale.ROOT);
                                        sq8.m48648g(lowerCase, "toLowerCase(...)");
                                        str3 = strM48863f + " - " + th1.m49850b(th1.m49854f(lowerCase));
                                    }
                                }
                            }
                            if (leads.getProspectingAttempts() != null) {
                                str2 = leads.getProspectingAttempts() + " Try";
                            } else {
                                str2 = "";
                            }
                            str = str3 + " " + str2;
                            color2 = c64.getColor(textView.getContext(), u6e.superfone_msg_read);
                            break;
                        }
                        break;
                    case 1990776172:
                        if (leadLifecycleStage.equals("CLOSED")) {
                            ss9 ss9VarJ05 = PropertyDefinitionRepository.o0().j0();
                            strM48863f = ss9VarJ05 != null ? ss9VarJ05.m48863f("CLOSED") : null;
                            if (strM48863f == null) {
                                strM48863f = "Closed";
                            }
                            if (leads.getLeadLifecycleStageSubCategory() == null) {
                                color2 = c64.getColor(textView.getContext(), u6e.superfone_red);
                                str = strM48863f;
                                break;
                            } else {
                                String leadLifecycleStageSubCategory2 = leads.getLeadLifecycleStageSubCategory();
                                if (leadLifecycleStageSubCategory2 != null) {
                                    switch (leadLifecycleStageSubCategory2.hashCode()) {
                                        case -1972124773:
                                            if (leadLifecycleStageSubCategory2.equals("CLOSED_NEGATIVE_OUTCOME")) {
                                                String str4 = strM48863f + " - Negative Outcome";
                                                color = c64.getColor(textView.getContext(), u6e.superfone_red);
                                                String lastCallOutcome = leads.getLastCallOutcome();
                                                if (lastCallOutcome != null && lastCallOutcome.length() != 0) {
                                                    z = false;
                                                }
                                                if (z) {
                                                    str = str4;
                                                } else {
                                                    String lowerCase2 = leads.getLastCallOutcome().toLowerCase(Locale.ROOT);
                                                    sq8.m48648g(lowerCase2, "toLowerCase(...)");
                                                    str = str4 + " " + th1.m49850b(th1.m49854f(lowerCase2));
                                                }
                                                color2 = color;
                                                break;
                                            }
                                            str = "";
                                            break;
                                        case -1841671687:
                                            if (leadLifecycleStageSubCategory2.equals("CLOSED_MANUAL")) {
                                                String str5 = strM48863f + " - Manually Closed";
                                                String manuallyClosedReason = leads.getManuallyClosedReason();
                                                if (manuallyClosedReason != null && manuallyClosedReason.length() != 0) {
                                                    z = false;
                                                }
                                                if (!z) {
                                                    str5 = strM48863f + " - " + leads.getManuallyClosedReason();
                                                }
                                                String str6 = str5;
                                                color2 = c64.getColor(textView.getContext(), u6e.superfone_red);
                                                str = str6;
                                                break;
                                            }
                                            break;
                                        case -1652004630:
                                            if (leadLifecycleStageSubCategory2.equals("OPPORTUNITY_WON")) {
                                                str = strM48863f + " - Deal Won";
                                                color2 = c64.getColor(textView.getContext(), u6e.superfone_green);
                                                break;
                                            }
                                            break;
                                        case -1082158593:
                                            if (leadLifecycleStageSubCategory2.equals("CLOSED_PROSPECTING_ATTEMPTS_DONE")) {
                                                str = strM48863f + " - Prospecting Attempts Done";
                                                color2 = c64.getColor(textView.getContext(), u6e.superfone_red);
                                                break;
                                            }
                                            break;
                                        case -183949782:
                                            if (leadLifecycleStageSubCategory2.equals("CLOSED_PROSPECTING_TIME_OVER")) {
                                                str = strM48863f + " - Time to Prospect Over";
                                                color2 = c64.getColor(textView.getContext(), u6e.superfone_red);
                                                break;
                                            }
                                            break;
                                        case 327136560:
                                            if (leadLifecycleStageSubCategory2.equals("OPPORTUNITY_LOST")) {
                                                str = strM48863f + " - Deal Lost";
                                                color2 = c64.getColor(textView.getContext(), u6e.superfone_red);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        strM48863f = "";
                        str = strM48863f;
                        break;
                }
            }
        } else {
            Date activeDealStageUpdatedAt2 = leads.getActiveDealStageUpdatedAt();
            String dealDescription = leads.getDealDescription();
            if (dealDescription != null && dealDescription.length() != 0) {
                z = false;
            }
            if (!z && activeDealStageUpdatedAt2 != null && leads.getActiveDealStage() != null) {
                str = th1.m49850b(leads.getActiveDealStage()) + " @" + jm7.m34024J(activeDealStageUpdatedAt2.getTime(), textView) + " : " + leads.getDealDescription();
            } else if (activeDealStageUpdatedAt2 != null && leads.getActiveDealStage() != null) {
                str = th1.m49850b(leads.getActiveDealStage()) + " @" + jm7.m34024J(activeDealStageUpdatedAt2.getTime(), textView);
            }
        }
        if (sq8.m48644c(str, "")) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(str);
        textView.setBackgroundTintList(ColorStateList.valueOf(color2));
    }

    public static final void U1(ImageView imageView, ChatMessages chatMessages) {
        if (imageView == null || chatMessages == null || chatMessages.getLocationObject() == null) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        LocationObject locationObject = chatMessages.getLocationObject();
        sq8.m48646e(locationObject);
        Double latitude = locationObject.getLatitude();
        LocationObject locationObject2 = chatMessages.getLocationObject();
        sq8.m48646e(locationObject2);
        Double longitude = locationObject2.getLongitude();
        if (latitude == null || longitude == null) {
            imageView.setVisibility(8);
            return;
        }
        String strM34040Z = jm7.m34040Z(imageView, latitude.doubleValue(), longitude.doubleValue(), (56 & 8) != 0 ? 600 : 0, (56 & 16) != 0 ? 400 : 0, (56 & 32) != 0 ? 15 : 0);
        if (!e9g.m24597K(strM34040Z, "https", false, 2, null)) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            ws7.m54949a(imageView.getContext()).m21758I(strM34040Z).mo17819i(qt5.f42382a).N0(ny5.m41226j()).A0(imageView);
        }
    }

    public static final Spannable U2(String str) {
        if (str == null || str.length() == 0) {
            return new SpannableString("");
        }
        ArrayList arrayList = new ArrayList();
        String strM38997i = new mge("\\{\\{(.+?)\\}\\}").m38997i(str, new C15640l(arrayList));
        Patterns.WEB_URL.matcher(strM38997i);
        String string = new StringBuilder(strM38997i).toString();
        sq8.m48648g(string, "toString(...)");
        return new SpannableString(Html.fromHtml(new mge("@@@placeholder(\\d+)@@@").m38997i(e9g.m24593G(new mge("```(.+?)```").m38997i(new mge("~([^\\s][^*]*[^\\s])~").m38997i(new mge("_([^\\s][^*]*[^\\s])_").m38997i(new mge("\\*([^\\s][^*]*[^\\s])\\*").m38997i(string, C15635g.f37190a), C15636h.f37191a), C15637i.f37192a), C15638j.f37193a), "\n", "<br>", false, 4, null), new C15639k(arrayList)), 0));
    }

    /* renamed from: V */
    public static final void m40951V(LinearLayout linearLayout, Leads leads) {
        if (linearLayout == null || leads == null) {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else if (leads.getLeadLifecycleStage() == null || !sq8.m48644c(leads.getLeadLifecycleStage(), "OPPORTUNITY")) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void V0(ImageView imageView, Object obj) {
        String str;
        String id;
        String profilePic;
        boolean z;
        if (imageView == null || obj == null) {
            return;
        }
        String upperCase = "";
        if (obj instanceof Leads) {
            Leads leads = (Leads) obj;
            profilePic = leads.getProfilePic();
            id = leads.getContactID();
            if (leads.getName().length() > 0) {
                if (f9g.Z0(leads.getName()).toString().length() > 0) {
                    String strValueOf = String.valueOf(f9g.Z0(leads.getName()).toString().charAt(0));
                    sq8.m48647f(strValueOf, "null cannot be cast to non-null type java.lang.String");
                    upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    sq8.m48648g(upperCase, "toUpperCase(...)");
                }
            }
            if ((leads.isCustomer() != null && leads.isCustomer().equals("true")) || sq8.m48644c(leads.getLeadLifecycleStageSubCategory(), "OPPORTUNITY_WON")) {
                str = upperCase;
                upperCase = profilePic;
                z = true;
                if (z) {
                    Drawable drawable = c64.getDrawable(imageView.getContext(), w7e.ic_crown);
                    Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
                    int color = c64.getColor(imageView.getContext(), u6e.backgroundVisits);
                    if (drawableMutate != null) {
                        fy5.m27740n(drawableMutate, color);
                    }
                    imageView.setImageDrawable(drawableMutate);
                    return;
                }
                if (!(upperCase.length() == 0) && !f9g.m26306P(upperCase, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null)) {
                    pu5.m44193b().m44196d(imageView, upperCase);
                    return;
                }
                if (!(id == null || id.length() == 0)) {
                    if (!(str.length() == 0)) {
                        imageView.setImageDrawable(xgh.m56281a().mo56294a(str, oh3.f38348d.m42239b(id), 20));
                        return;
                    }
                }
                imageView.setImageResource(R.color.transparent);
                return;
            }
        } else if (obj instanceof LeadsUser) {
            LeadsUser leadsUser = (LeadsUser) obj;
            profilePic = leadsUser.getProfilePic();
            id = leadsUser.getId();
            if (leadsUser.getName().length() > 0) {
                if (f9g.Z0(leadsUser.getName()).toString().length() > 0) {
                    String strValueOf2 = String.valueOf(f9g.Z0(leadsUser.getName()).toString().charAt(0));
                    sq8.m48647f(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                    upperCase = strValueOf2.toUpperCase(Locale.ROOT);
                    sq8.m48648g(upperCase, "toUpperCase(...)");
                }
            }
        } else {
            str = "";
            id = null;
            z = false;
            if (z) {
            }
        }
        str = upperCase;
        upperCase = profilePic;
        z = false;
        if (z) {
        }
    }

    public static final void V1(TextView textView, String str) {
        if (textView != null) {
            if (str == null || f9g.d0(str)) {
                textView.setText(" ");
                return;
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            textView.setText(th1.m49850b(th1.m49854f(lowerCase)));
        }
    }

    public static final String V2(String str) {
        sq8.m48649h(str, "input");
        return new mge("\\d{4}-\\d{2}-\\d{2}[tT]\\d{2}:\\d{2}:\\d{2}(?:\\.\\d{1,3})?[zZ]").m38997i(str, C15641m.f37196a);
    }

    /* renamed from: W */
    public static final void m40952W(MaterialButton materialButton, Leads leads) {
        if (materialButton == null || leads == null) {
            return;
        }
        if (leads.isCloudTelephonyEnabled()) {
            materialButton.setVisibility(0);
        } else {
            materialButton.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void W0(ImageView imageView, LeadsUser leadsUser) {
        String upperCase;
        if (imageView == null || leadsUser == null) {
            return;
        }
        String profilePic = leadsUser.getProfilePic();
        String id = leadsUser.getId();
        if (leadsUser.getName().length() > 0) {
            if (f9g.Z0(leadsUser.getName()).toString().length() > 0) {
                String strValueOf = String.valueOf(f9g.Z0(leadsUser.getName()).toString().charAt(0));
                sq8.m48647f(strValueOf, "null cannot be cast to non-null type java.lang.String");
                upperCase = strValueOf.toUpperCase(Locale.ROOT);
                sq8.m48648g(upperCase, "toUpperCase(...)");
            }
        } else {
            upperCase = "";
        }
        if (!(profilePic.length() == 0) && !f9g.m26306P(profilePic, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null)) {
            pu5.m44193b().m44197e(imageView, profilePic);
            return;
        }
        if (!(id == null || id.length() == 0)) {
            if (!(upperCase.length() == 0)) {
                imageView.setImageDrawable(xgh.m56281a().mo56294a(upperCase, oh3.f38348d.m42239b(id), 8));
                return;
            }
        }
        imageView.setImageResource(R.color.transparent);
    }

    public static final void W1(ViewProfileData viewProfileData, String str) {
        if (viewProfileData == null || str == null) {
            return;
        }
        viewProfileData.setViewProfileDataValue(str);
    }

    public static final void W2(String str, String str2, Chip chip) {
        if (str != null) {
            if (str.length() > 0) {
                if (f9g.Z0(str).toString().length() > 0) {
                    String strValueOf = String.valueOf(f9g.Z0(str).toString().charAt(0));
                    sq8.m48647f(strValueOf, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    sq8.m48648g(upperCase, "toUpperCase(...)");
                    if (str2 == null || str2.length() == 0) {
                        return;
                    }
                    if (upperCase.length() > 0) {
                        xgh xghVarMo56294a = xgh.m56281a().mo56294a(upperCase, oh3.f38348d.m42239b(str2), 20);
                        if (chip != null) {
                            chip.setChipIcon(xghVarMo56294a);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: X */
    public static final void m40953X(TextView textView, CommentSummary commentSummary) {
        Object next;
        if (textView == null || commentSummary == null) {
            return;
        }
        List listM54449O = wi0.m54449O(null, 1, null);
        ArrayList arrayList = new ArrayList();
        int color = c64.getColor(textView.getContext(), u6e.superfone_blue);
        for (CommentSummary.MentionedEntity mentionedEntity : commentSummary.getMentionedEntities()) {
            Iterator it = listM54449O.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (sq8.m48644c(((LeadsUser) next).getId(), mentionedEntity.getEntityID())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LeadsUser leadsUser = (LeadsUser) next;
            if (leadsUser != null) {
                arrayList.add(new hwc(leadsUser.getName(), Integer.valueOf(color)));
            }
        }
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) ((hwc) it2.next()).m31229c());
        }
        textView.setText(jm7.o0(commentSummary.getText(), arrayList, false, true));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final void X0(ImageView imageView, Leads leads) {
        if (imageView == null || leads == null) {
            return;
        }
        String contactSource = leads.getContactSource();
        String upperCase = "";
        if (contactSource == null || contactSource.length() == 0) {
            String profilePic = leads.getProfilePic();
            String contactID = leads.getContactID();
            if (leads.getName().length() > 0) {
                if (f9g.Z0(leads.getName()).toString().length() > 0) {
                    String strValueOf = String.valueOf(f9g.Z0(leads.getName()).toString().charAt(0));
                    sq8.m48647f(strValueOf, "null cannot be cast to non-null type java.lang.String");
                    upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    sq8.m48648g(upperCase, "toUpperCase(...)");
                }
            }
            if (!(profilePic.length() == 0) && !f9g.m26306P(profilePic, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null)) {
                pu5.m44193b().m44196d(imageView, profilePic);
                return;
            }
            if (!(contactID == null || contactID.length() == 0)) {
                if (!(upperCase.length() == 0)) {
                    imageView.setImageDrawable(xgh.m56281a().mo56294a(upperCase, oh3.f38348d.m42239b(contactID), 20));
                    return;
                }
            }
            imageView.setImageResource(R.color.transparent);
            return;
        }
        String contactSource2 = leads.getContactSource();
        Locale locale = Locale.getDefault();
        sq8.m48648g(locale, "getDefault(...)");
        String lowerCase = contactSource2.toLowerCase(locale);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -1918536447:
                if (lowerCase.equals("commonfloor")) {
                    imageView.setImageResource(w7e.commonfloor);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case -1858793111:
                if (lowerCase.equals("sulekha")) {
                    imageView.setImageResource(w7e.sulekha);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case -1647335718:
                if (lowerCase.equals("shared_mailbox")) {
                    imageView.setImageResource(w7e.inbox);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case -1420744429:
                if (lowerCase.equals("jotform")) {
                    imageView.setImageResource(w7e.jotform);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case -1254789861:
                if (lowerCase.equals("urbanpro")) {
                    imageView.setImageResource(w7e.urbanpro);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case -713507699:
                if (lowerCase.equals("indiamart")) {
                    imageView.setImageResource(w7e.indiamart);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case -178324326:
                if (lowerCase.equals("calendly")) {
                    imageView.setImageResource(w7e.calendly);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case -79386020:
                if (lowerCase.equals("justdial")) {
                    imageView.setImageResource(w7e.jdshort);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 117734:
                if (lowerCase.equals("wix")) {
                    imageView.setImageResource(w7e.wix);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 24625183:
                if (lowerCase.equals("cashfree")) {
                    imageView.setImageResource(w7e.cashfree);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 28903346:
                if (lowerCase.equals("instagram")) {
                    imageView.setImageResource(w7e.ig);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 92576527:
                if (lowerCase.equals("aajjo")) {
                    imageView.setImageResource(w7e.aajjo);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 497130182:
                if (lowerCase.equals("facebook")) {
                    imageView.setImageResource(w7e.external_logo_facebook);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 604200602:
                if (lowerCase.equals("razorpay")) {
                    imageView.setImageResource(w7e.razorpay_glyph);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 1100520413:
                if (lowerCase.equals("housing")) {
                    imageView.setImageResource(w7e.housing);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 1223953944:
                if (lowerCase.equals("webform")) {
                    imageView.setImageResource(w7e.webform);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 1523815487:
                if (lowerCase.equals("magicbricks")) {
                    imageView.setImageResource(w7e.magicbricks);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 1884714579:
                if (lowerCase.equals("tradeindia")) {
                    imageView.setImageResource(w7e.tradeindia);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 1934780818:
                if (lowerCase.equals("whatsapp")) {
                    imageView.setImageResource(w7e.wa);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 1948103513:
                if (lowerCase.equals("googleleadform")) {
                    imageView.setImageResource(w7e.google_ad);
                    imageView.setVisibility(0);
                    return;
                }
                break;
            case 2118220354:
                if (lowerCase.equals("salesmaxapi")) {
                    imageView.setImageResource(w7e.api);
                    imageView.setVisibility(0);
                    return;
                }
                break;
        }
        String profilePic2 = leads.getProfilePic();
        String contactID2 = leads.getContactID();
        if (leads.getName().length() > 0) {
            if (f9g.Z0(leads.getName()).toString().length() > 0) {
                String strValueOf2 = String.valueOf(f9g.Z0(leads.getName()).toString().charAt(0));
                sq8.m48647f(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                upperCase = strValueOf2.toUpperCase(Locale.ROOT);
                sq8.m48648g(upperCase, "toUpperCase(...)");
            }
        }
        if (!(profilePic2.length() == 0) && !f9g.m26306P(profilePic2, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null)) {
            pu5.m44193b().m44196d(imageView, profilePic2);
            return;
        }
        if (!(contactID2 == null || contactID2.length() == 0)) {
            if (!(upperCase.length() == 0)) {
                imageView.setImageDrawable(xgh.m56281a().mo56294a(upperCase, oh3.f38348d.m42239b(contactID2), 20));
                return;
            }
        }
        imageView.setImageResource(R.color.transparent);
    }

    public static final void X1(ViewProgressCard2 viewProgressCard2, Integer num) {
        if (viewProgressCard2 == null || num == null) {
            return;
        }
        viewProgressCard2.setCardColor(num.intValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void X2(ImageView imageView, String str) {
        int i;
        if (imageView == null || str == null) {
            return;
        }
        String upperCase = f9g.Z0(str).toString().toUpperCase(Locale.ROOT);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -1925160365:
                if (!upperCase.equals("TRADEINDIA")) {
                    i = w7e.ic_round_task;
                    break;
                } else {
                    i = w7e.tradeindia;
                    break;
                }
            case -1479469166:
                if (upperCase.equals("INSTAGRAM")) {
                    i = w7e.ig;
                    break;
                }
                break;
            case -1140810423:
                if (upperCase.equals("SULEKHA")) {
                    i = w7e.sulekha;
                    break;
                }
                break;
            case -702761741:
                if (upperCase.equals("JOTFORM")) {
                    i = w7e.jotform;
                    break;
                }
                break;
            case -618190817:
                if (upperCase.equals("MAGICBRICKS")) {
                    i = w7e.magicbricks;
                    break;
                }
                break;
            case -472163045:
                if (upperCase.equals("URBANPRO")) {
                    i = w7e.urbanpro;
                    break;
                }
                break;
            case -232614055:
                if (upperCase.equals("GOOGLELEADFORM")) {
                    i = w7e.google_ad;
                    break;
                }
                break;
            case -23785950:
                if (upperCase.equals("SALESMAXAPI")) {
                    i = w7e.api;
                    break;
                }
                break;
            case 85958:
                if (upperCase.equals("WIX")) {
                    i = w7e.wix;
                    break;
                }
                break;
            case 62038767:
                if (upperCase.equals("AAJJO")) {
                    i = w7e.aajjo;
                    break;
                }
                break;
            case 234424545:
                if (upperCase.equals("COMMONFLOOR")) {
                    i = w7e.commonfloor;
                    break;
                }
                break;
            case 402269882:
                if (upperCase.equals("SHARED_MAILBOX")) {
                    i = w7e.inbox;
                    break;
                }
                break;
            case 590329943:
                if (upperCase.equals("WHATSAPP_BUSINESS_LOGIN")) {
                    i = w7e.wa;
                    break;
                }
                break;
            case 604302490:
                if (upperCase.equals("CALENDLY")) {
                    i = w7e.calendly;
                    break;
                }
                break;
            case 703240796:
                if (upperCase.equals("JUSTDIAL")) {
                    i = w7e.jdlogo;
                    break;
                }
                break;
            case 807251999:
                if (upperCase.equals("CASHFREE")) {
                    i = w7e.cashfree;
                    break;
                }
                break;
            case 1279756998:
                if (upperCase.equals("FACEBOOK")) {
                    i = w7e.external_logo_facebook;
                    break;
                }
                break;
            case 1386827418:
                if (upperCase.equals("RAZORPAY")) {
                    i = w7e.razorpay_glyph;
                    break;
                }
                break;
            case 1818503101:
                if (upperCase.equals("HOUSING")) {
                    i = w7e.housing;
                    break;
                }
                break;
            case 1941936632:
                if (upperCase.equals("WEBFORM")) {
                    i = w7e.ic_form;
                    break;
                }
                break;
            case 2073087085:
                if (upperCase.equals("INDIAMART")) {
                    i = w7e.indiamart;
                    break;
                }
                break;
        }
        imageView.setImageResource(i);
    }

    /* renamed from: Y */
    public static final void m40954Y(AutoCompleteTextView autoCompleteTextView, String str, ArrayList arrayList) {
        Object next;
        if (autoCompleteTextView == null || str == null || arrayList == null) {
            if (autoCompleteTextView == null || str == null) {
                return;
            }
            autoCompleteTextView.setText(str);
            return;
        }
        List listM54449O = wi0.m54449O(null, 1, null);
        ArrayList arrayList2 = new ArrayList();
        int color = c64.getColor(autoCompleteTextView.getContext(), u6e.superfone_blue);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CommentSummary.MentionedEntity mentionedEntity = (CommentSummary.MentionedEntity) it.next();
            Iterator it2 = listM54449O.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (sq8.m48644c(((LeadsUser) next).getId(), mentionedEntity.getEntityID())) {
                        break;
                    }
                }
            }
            LeadsUser leadsUser = (LeadsUser) next;
            if (leadsUser != null) {
                arrayList2.add(new hwc("@" + leadsUser.getName(), Integer.valueOf(color)));
            }
        }
        ArrayList arrayList3 = new ArrayList(dh3.m23088v(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add((String) ((hwc) it3.next()).m31229c());
        }
        Spannable spannableO0 = jm7.o0(str, arrayList2, false, true);
        jm7.n0(spannableO0, arrayList3, new C15632d());
        autoCompleteTextView.setText(spannableO0);
    }

    public static final void Y0(ImageView imageView, ChatChannel chatChannel) {
        if (imageView == null || chatChannel == null) {
            return;
        }
        if (chatChannel.getContact() != null || chatChannel.getVisitorId() == null) {
            X0(imageView, chatChannel.getContact());
        } else {
            imageView.setImageResource(w7e.icon_transparent);
            imageView.setVisibility(0);
        }
    }

    public static final void Y1(ViewProgressCard2 viewProgressCard2, boolean z) {
        if (viewProgressCard2 != null) {
            viewProgressCard2.setHasNew(z);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Y2(ImageView imageView, LeadInteractionsSummary leadInteractionsSummary) {
        int i;
        if (imageView == null || leadInteractionsSummary == null) {
            return;
        }
        String strValueOf = String.valueOf(leadInteractionsSummary.getEngagementType());
        switch (strValueOf.hashCode()) {
            case -1577559662:
                if (!strValueOf.equals("WHATSAPP")) {
                    i = w7e.ic_round_task;
                    break;
                } else {
                    i = w7e.ic_whatsapp;
                    break;
                }
            case -1558625385:
                if (strValueOf.equals("DISPOSITION")) {
                    i = w7e.ic_round_task;
                    break;
                }
                break;
            case 2060894:
                if (strValueOf.equals("CALL")) {
                    if (!sq8.m48644c(CallDirection.OUTGOING.name(), leadInteractionsSummary.getCallDirection())) {
                        i = w7e.ic_home_calls_incoming;
                        break;
                    } else {
                        i = w7e.ic_home_calls_outgoing;
                        break;
                    }
                }
                break;
            case 2402290:
                if (strValueOf.equals("NOTE")) {
                    i = w7e.ic_note_added;
                    break;
                }
                break;
            case 2567557:
                if (strValueOf.equals("TASK")) {
                    i = w7e.ic_task_completed;
                    break;
                }
                break;
            case 66081660:
                if (strValueOf.equals("EMAIL")) {
                    i = w7e.ic_activity_email_sent;
                    break;
                }
                break;
            case 81679659:
                if (strValueOf.equals("VISIT")) {
                    i = w7e.ic_visit_logged;
                    break;
                }
                break;
        }
        imageView.setImageResource(i);
    }

    /* renamed from: Z */
    public static final void m40955Z(TextView textView, String str) {
        if (textView != null) {
            if (str == null || f9g.d0(str)) {
                textView.setText(" ");
                return;
            }
            textView.setText("Continue Signing in with " + str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Z0(TextView textView, Leads leads) {
        String strM49850b;
        if (textView != null) {
            if (leads == null) {
                textView.setText(" ");
                return;
            }
            String string = "";
            if (leads.getTopLnaFilter() == null) {
                if (leads.getSecondaryDisplayTitle().length() > 0) {
                    String lowerCase = leads.getSecondaryDisplayTitle().toLowerCase(Locale.ROOT);
                    sq8.m48648g(lowerCase, "toLowerCase(...)");
                    strM49850b = th1.m49850b(lowerCase);
                } else if (!leads.getPhoneNumbers().isEmpty()) {
                    String str = leads.getPhoneNumbers().get(0);
                    sq8.m48648g(str, "get(...)");
                    strM49850b = str;
                } else if (!leads.getEmails().isEmpty()) {
                    String str2 = leads.getEmails().get(0);
                    sq8.m48648g(str2, "get(...)");
                    strM49850b = str2;
                }
                string = strM49850b;
            } else {
                String topLnaFilter = leads.getTopLnaFilter();
                if (topLnaFilter != null) {
                    switch (topLnaFilter.hashCode()) {
                        case 812449305:
                            if (!topLnaFilter.equals("Positive")) {
                                if (leads.getSecondaryDisplayTitle().length() > 0) {
                                    String lowerCase2 = leads.getSecondaryDisplayTitle().toLowerCase(Locale.ROOT);
                                    sq8.m48648g(lowerCase2, "toLowerCase(...)");
                                    strM49850b = th1.m49850b(lowerCase2);
                                } else if (!leads.getPhoneNumbers().isEmpty()) {
                                    String str3 = leads.getPhoneNumbers().get(0);
                                    sq8.m48648g(str3, "get(...)");
                                    strM49850b = str3;
                                } else if (!leads.getEmails().isEmpty()) {
                                    String str4 = leads.getEmails().get(0);
                                    sq8.m48648g(str4, "get(...)");
                                    strM49850b = str4;
                                }
                                string = strM49850b;
                                break;
                            } else {
                                if (leads.getLastKnownDisposition() != null) {
                                    String lowerCase3 = leads.getLastKnownDisposition().toLowerCase(Locale.ROOT);
                                    sq8.m48648g(lowerCase3, "toLowerCase(...)");
                                    string = th1.m49850b(e9g.m24593G(lowerCase3, "_", " ", false, 4, null));
                                }
                                Date lastKnownDispositionTime = leads.getLastKnownDispositionTime();
                                if (lastKnownDispositionTime == null) {
                                    string = string.toString();
                                    break;
                                } else {
                                    string = string + " : " + jm7.m34024J(lastKnownDispositionTime.getTime(), textView);
                                    break;
                                }
                            }
                            break;
                        case 985755733:
                            if (topLnaFilter.equals("Negative")) {
                                if (leads.getLastKnownDisposition() != null) {
                                    String lowerCase4 = leads.getLastKnownDisposition().toLowerCase(Locale.ROOT);
                                    sq8.m48648g(lowerCase4, "toLowerCase(...)");
                                    string = th1.m49850b(e9g.m24593G(lowerCase4, "_", " ", false, 4, null));
                                }
                                Date lastKnownDispositionTime2 = leads.getLastKnownDispositionTime();
                                if (lastKnownDispositionTime2 == null) {
                                    string = string.toString();
                                    break;
                                } else {
                                    string = string + " : " + jm7.m34024J(lastKnownDispositionTime2.getTime(), textView);
                                    break;
                                }
                            }
                            break;
                        case 1274492512:
                            if (topLnaFilter.equals("Need Follow up")) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                Date needFollowUpTagUpdatedAt = leads.getNeedFollowUpTagUpdatedAt();
                                if (needFollowUpTagUpdatedAt != null) {
                                    string = TimeUnit.DAYS.convert(jCurrentTimeMillis - needFollowUpTagUpdatedAt.getTime(), TimeUnit.MILLISECONDS) + " Days since Last Positive Outcome";
                                    break;
                                }
                            }
                            break;
                        case 1625667301:
                            if (topLnaFilter.equals("Fresh Leads")) {
                                long lastLeadAssignmentDateTimeInMillis = leads.getLastLeadAssignmentDateTimeInMillis();
                                Long createdAt = leads.getCreatedAt();
                                if (lastLeadAssignmentDateTimeInMillis > 0 && !sq8.m48644c(leads.getContactAddedByID(), leads.getContactOwnerID())) {
                                    string = "Assigned : " + jm7.m34024J(lastLeadAssignmentDateTimeInMillis, textView);
                                    break;
                                } else if (createdAt != null && createdAt.longValue() > 0) {
                                    string = "Created : " + jm7.m34024J(createdAt.longValue(), textView);
                                    break;
                                }
                            }
                            break;
                    }
                }
            }
            textView.setText(string);
        }
    }

    public static final void Z1(ViewProgressCard2 viewProgressCard2, Integer num) {
        if (viewProgressCard2 == null || num == null) {
            return;
        }
        viewProgressCard2.setIcon(num.intValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Z2(ImageView imageView, String str) {
        int i;
        if (imageView == null || str == null) {
            return;
        }
        String upperCase = f9g.Z0(str).toString().toUpperCase(Locale.ROOT);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -1906750952:
                if (!upperCase.equals("PAYMENT_CANCELLED")) {
                    i = w7e.ic_round_task;
                    break;
                } else {
                    i = w7e.ic_payment_cancelled;
                    break;
                }
            case -1689405387:
                if (upperCase.equals("PAYMENT_REQUESTED")) {
                    i = w7e.ic_payment_requested;
                    break;
                }
                break;
            case -1614872255:
                if (upperCase.equals("TASK_COMPLETED_EXPIRY")) {
                    i = w7e.ic_activity_task_completed_expired;
                    break;
                }
                break;
            case -1583748127:
                if (upperCase.equals("TASK_UPDATED")) {
                    i = w7e.ic_activity_task_pdated;
                    break;
                }
                break;
            case -1385768224:
                if (upperCase.equals("COMMENT_ADDED")) {
                    i = w7e.ic_comment;
                    break;
                }
                break;
            case -1017263119:
                if (upperCase.equals("TASK_COMPLETED")) {
                    i = w7e.ic_activity_task_completed;
                    break;
                }
                break;
            case -1011516650:
                if (upperCase.equals("VISIT_LOGGED")) {
                    i = w7e.ic_activity_visits_done;
                    break;
                }
                break;
            case -976032916:
                if (upperCase.equals("USER_ADDED")) {
                    i = w7e.ic_activity_user_added;
                    break;
                }
                break;
            case -895108100:
                if (upperCase.equals("CALL_RECORD_AVAILABLE")) {
                    i = w7e.ic_activity_call_recording_added;
                    break;
                }
                break;
            case -320763378:
                if (upperCase.equals("TASK_CREATED")) {
                    i = w7e.ic_activity_task_created;
                    break;
                }
                break;
            case -65979488:
                if (upperCase.equals("DEAL_STAGE_CHANGED")) {
                    i = w7e.ic_deal_stage_changed;
                    break;
                }
                break;
            case -25822595:
                if (upperCase.equals("WHATSAPP_MESSAGE_SENT")) {
                    i = w7e.ic_whatsapp;
                    break;
                }
                break;
            case 21343875:
                if (upperCase.equals("CALL_LOGGED")) {
                    i = w7e.ic_activity_call_logged;
                    break;
                }
                break;
            case 176324397:
                if (upperCase.equals("CONTACT_ASSIGNED")) {
                    i = w7e.ic_contact_assigned;
                    break;
                }
                break;
            case 483875305:
                if (upperCase.equals("COMMENT_MENTIONED")) {
                    i = w7e.ic_activity_comment_mentioned;
                    break;
                }
                break;
            case 709171934:
                if (upperCase.equals("SMS_SENT")) {
                    i = w7e.ic_message_text;
                    break;
                }
                break;
            case 745830901:
                if (upperCase.equals("DEAL_CREATED")) {
                    i = w7e.ic_deal_created;
                    break;
                }
                break;
            case 750937928:
                if (upperCase.equals("TASK_ASSIGNED")) {
                    i = w7e.ic_activity_task_assigned;
                    break;
                }
                break;
            case 759150163:
                if (upperCase.equals("NOTE_ADDED")) {
                    i = w7e.ic_activity_notes_added;
                    break;
                }
                break;
            case 776966170:
                if (upperCase.equals("PAYMENT_RECEIVED")) {
                    i = w7e.ic_payment_received;
                    break;
                }
                break;
            case 877143038:
                if (upperCase.equals("CONTACT_RE_CHURNED")) {
                    i = w7e.ic_undo;
                    break;
                }
                break;
            case 920632725:
                if (upperCase.equals("TASK_COMPLETED_SUCCESS")) {
                    i = w7e.ic_activity_task_completed;
                    break;
                }
                break;
            case 1003699942:
                if (upperCase.equals("TEAM_CREATED")) {
                    i = w7e.ic_activity_team_created;
                    break;
                }
                break;
            case 1143446941:
                if (upperCase.equals("TEAM_MEMBER_ADDED")) {
                    i = w7e.ic_activity_team_member_added;
                    break;
                }
                break;
            case 1149502629:
                if (upperCase.equals("CONVERSATION_STARTED")) {
                    i = w7e.ic_conversation;
                    break;
                }
                break;
            case 1221859416:
                if (upperCase.equals("VIDEO_CALL_COMPLETED_SUCCESSFULLY")) {
                    i = w7e.ic_video_call;
                    break;
                }
                break;
            case 1294229027:
                if (upperCase.equals("DEAL_WON")) {
                    i = w7e.ic_deal_won;
                    break;
                }
                break;
            case 1466066711:
                if (upperCase.equals("DEAL_LOST")) {
                    i = w7e.ic_deal_lost;
                    break;
                }
                break;
            case 1701228316:
                if (upperCase.equals("TASK_COMPLETED_FAILURE")) {
                    i = w7e.ic_activity_task_completed_failure;
                    break;
                }
                break;
            case 1833302651:
                if (upperCase.equals("EMAIL_SENT")) {
                    i = w7e.ic_activity_email_sent;
                    break;
                }
                break;
            case 1947337367:
                if (upperCase.equals("CALL_DISPOSITION_ADDED")) {
                    i = w7e.ic_activity_call_disposition;
                    break;
                }
                break;
        }
        imageView.setImageResource(i);
    }

    public static final void a0(MaterialButtonToggleGroup materialButtonToggleGroup, FormField formField) {
        sq8.m48649h(formField, "obj");
        if (materialButtonToggleGroup == null || formField.getPropertyDefinition() == null) {
            return;
        }
        String lowerCase = null;
        if (sq8.m48644c(formField.isViewOnly(), Boolean.TRUE)) {
            int childCount = materialButtonToggleGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = materialButtonToggleGroup.getChildAt(i);
                Button button = childAt instanceof Button ? (Button) childAt : null;
                if (button != null) {
                    button.setEnabled(false);
                }
            }
        }
        PropertyDefinition propertyDefinition = formField.getPropertyDefinition();
        sq8.m48646e(propertyDefinition);
        String scalarType = propertyDefinition.getScalarType();
        if (scalarType != null) {
            Locale locale = Locale.getDefault();
            sq8.m48648g(locale, "getDefault(...)");
            lowerCase = scalarType.toLowerCase(locale);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
        }
        if (!sq8.m48644c(lowerCase, "datetime") || formField.getSubmittedPropertyValue() == null) {
            return;
        }
        try {
            String str = new SimpleDateFormat("dd MMM yy").format(Long.valueOf(Instant.parse(String.valueOf(formField.getSubmittedPropertyValue())).toEpochMilli()));
            if (str == null || str.length() == 0) {
                return;
            }
            materialButtonToggleGroup.m14257r(z8e.btnCustomDate);
            Button button2 = (Button) materialButtonToggleGroup.findViewById(z8e.btnCustomDate);
            if (button2 == null) {
                return;
            }
            button2.setText(str);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
    }

    public static final void a1(TextView textView, LeadsUser leadsUser) {
        String email;
        if (textView != null) {
            if (leadsUser == null) {
                textView.setText(" ");
                return;
            }
            if (leadsUser.getRegisteredNumber().length() > 0) {
                email = leadsUser.getRegisteredNumber();
            } else {
                email = leadsUser.getEmail().length() > 0 ? leadsUser.getEmail() : "";
            }
            textView.setText(email);
        }
    }

    public static final void a2(ViewProgressCard2 viewProgressCard2, int i) {
        if (viewProgressCard2 != null) {
            viewProgressCard2.setProgressBarPercent(i);
        }
    }

    public static final void a3(ImageView imageView, String str) {
        if (imageView == null || str == null) {
            return;
        }
        String upperCase = f9g.Z0(str).toString().toUpperCase(Locale.ROOT);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        imageView.setImageResource(sq8.m48644c(upperCase, ActivityMetrics.MetricsName.CALL_DURATION.name()) ? w7e.ic_home_calls_all : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.CALL_DURATION_INCOMING.name()) ? w7e.ic_activity_calls : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.CALL_DURATION_OUTGOING.name()) ? w7e.ic_activity_comment_added : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.CALL_LOGGED.name()) ? w7e.ic_home_calls_all : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.CALL_OUTCOME_LOGGED.name()) ? w7e.ic_call : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.COMMENT_ADDED.name()) ? w7e.ic_activity_comment_added : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.CONNECTED_CALL_LOGGED.name()) ? w7e.ic_home_calls_all : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.CONNECTED_INCOMING_CALL_LOGGED.name()) ? w7e.ic_call_in : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.CONNECTED_OUTGOING_CALL_LOGGED.name()) ? w7e.ic_call_out : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.CONTACT_CREATED.name()) ? w7e.ic_leads : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.INCOMING_CALL_LOGGED.name()) ? w7e.ic_activity_calls : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.NOTE_ADDED.name()) ? w7e.ic_activity_notes_added : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.OUTGOING_CALL_LOGGED.name()) ? w7e.ic_activity_comment_added : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.TASK_CREATED.name()) ? w7e.ic_tasks : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.TASK_COMPLETED.name()) ? w7e.ic_home_completed_tasks : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.TASK_UPDATED.name()) ? w7e.ic_home_updated_tasks : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.VISIT_LOGGED.name()) ? w7e.ic_activity_visits_done : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.VISIT_OUTCOME_LOGGED.name()) ? w7e.ic_add_visit : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.WHATSAPP_MESSAGE_SENT.name()) ? w7e.ic_whatsapp : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.SMS_SENT.name()) ? w7e.ic_message_text : sq8.m48644c(upperCase, ActivityMetrics.MetricsName.EMAIL_SENT.name()) ? w7e.ic_email : w7e.ic_round_task);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b0(TextInputEditText textInputEditText, FormField formField) {
        String lowerCase;
        String string;
        if (textInputEditText != null) {
            String str = null;
            if ((formField != null ? formField.getPropertyDefinition() : null) == null) {
                return;
            }
            Boolean boolIsViewOnly = formField.isViewOnly();
            if (boolIsViewOnly != null) {
                boolean zBooleanValue = boolIsViewOnly.booleanValue();
                textInputEditText.setEnabled(!zBooleanValue);
                textInputEditText.setFocusable(!zBooleanValue);
                textInputEditText.setFocusableInTouchMode(!zBooleanValue);
            }
            PropertyDefinition propertyDefinition = formField.getPropertyDefinition();
            sq8.m48646e(propertyDefinition);
            String scalarType = propertyDefinition.getScalarType();
            if (scalarType != null) {
                Locale locale = Locale.getDefault();
                sq8.m48648g(locale, "getDefault(...)");
                lowerCase = scalarType.toLowerCase(locale);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            int i = 524289;
            if (lowerCase != null) {
                switch (lowerCase.hashCode()) {
                    case -1034364087:
                        if (!lowerCase.equals("number")) {
                            if ((textInputEditText.getInputType() & Opcodes.ACC_DEPRECATED) != 0) {
                                i = 655361;
                                break;
                            }
                        } else {
                            i = 2;
                            break;
                        }
                        break;
                    case -276836809:
                        if (lowerCase.equals("phonenumber")) {
                            i = 3;
                            break;
                        }
                        break;
                    case 116079:
                        if (lowerCase.equals(ImagesContract.URL)) {
                            i = 16;
                            break;
                        }
                        break;
                    case 3556653:
                        if (!lowerCase.equals("text")) {
                        }
                        break;
                    case 96619420:
                        if (lowerCase.equals("email")) {
                            i = 32;
                            break;
                        }
                        break;
                }
            }
            textInputEditText.setInputType(i);
            Object submittedPropertyValue = formField.getSubmittedPropertyValue();
            if (submittedPropertyValue == null || (string = submittedPropertyValue.toString()) == null) {
                String preSetValue = formField.getPreSetValue();
                if (preSetValue != null) {
                    str = preSetValue;
                }
            } else {
                str = string;
            }
            if (str == null || sq8.m48644c(String.valueOf(textInputEditText.getText()), str)) {
                return;
            }
            textInputEditText.setText(str);
        }
    }

    public static final void b1(TextView textView, Tasks tasks) {
        String clientContactNumber;
        if (textView != null) {
            if (tasks == null) {
                textView.setText(" ");
                return;
            }
            if (tasks.getClientCompany().length() > 0) {
                clientContactNumber = tasks.getClientCompany();
            } else {
                clientContactNumber = tasks.getClientContactNumber().length() > 0 ? tasks.getClientContactNumber() : "";
            }
            textView.setText(clientContactNumber);
        }
    }

    public static final void b2(ViewProgressCard viewProgressCard, int i) {
        if (viewProgressCard != null) {
            viewProgressCard.setProgressBarPercent(i);
        }
    }

    public static final void b3(ConstraintLayout constraintLayout, Leads leads) {
        sq8.m48649h(constraintLayout, "view");
        if (leads != null) {
            constraintLayout.setBackgroundColor(c64.getColor(constraintLayout.getContext(), sq8.m48644c(leads.getLeadLifecycleStage(), "CLOSED") ? ((leads.isCustomer() == null || !leads.isCustomer().equals("true")) && !sq8.m48644c(leads.getLeadLifecycleStageSubCategory(), "OPPORTUNITY_WON")) ? u6e.superfone_red_10 : u6e.superfone_green_10 : u6e.superfone_white));
        }
    }

    public static final void c0(TextView textView, String str) {
        if (textView == null || str == null || StringUtils.isBlank(str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilderM34063w = jm7.m34063w(str);
        textView.setText(spannableStringBuilderM34063w);
        if (spannableStringBuilderM34063w.length() == 0) {
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c1(ShapeableImageView shapeableImageView, ChatMessages chatMessages) {
        int i;
        if (shapeableImageView == null || chatMessages == null) {
            return;
        }
        if (!sq8.m48644c(chatMessages.getMessageCategory(), "external") || !sq8.m48644c(chatMessages.isInbound(), Boolean.FALSE)) {
            shapeableImageView.setVisibility(8);
            return;
        }
        String status = chatMessages.getStatus();
        if (status != null) {
            switch (status.hashCode()) {
                case -1281977283:
                    if (!status.equals("failed")) {
                        i = w7e.ic_time;
                        break;
                    } else {
                        i = w7e.ic_delete_engagement;
                        break;
                    }
                case -242327420:
                    if (status.equals("delivered")) {
                        i = w7e.ic_double_tick;
                        break;
                    }
                    break;
                case 3496342:
                    if (!status.equals("read")) {
                    }
                    break;
                case 3526552:
                    if (status.equals("sent")) {
                        i = w7e.ic_tick;
                        break;
                    }
                    break;
            }
        }
        if (sq8.m48644c(chatMessages.getStatus(), "read")) {
            shapeableImageView.setImageTintList(ColorStateList.valueOf(c64.getColor(shapeableImageView.getContext(), u6e.superfone_msg_read)));
        } else if (sq8.m48644c(chatMessages.getStatus(), "failed")) {
            shapeableImageView.setImageTintList(ColorStateList.valueOf(c64.getColor(shapeableImageView.getContext(), u6e.superfone_red_70)));
        } else {
            shapeableImageView.setImageTintList(ColorStateList.valueOf(c64.getColor(shapeableImageView.getContext(), u6e.superfone_gray)));
        }
        shapeableImageView.setImageResource(i);
    }

    public static final void c2(ViewProgressCard2 viewProgressCard2, Integer num) {
        if (viewProgressCard2 == null || num == null) {
            return;
        }
        viewProgressCard2.setSubTitle(num.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c3(ImageView imageView, String str) {
        int i;
        if (imageView == null || str == null) {
            return;
        }
        String upperCase = f9g.Z0(str).toString().toUpperCase(Locale.ROOT);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -1577559662:
                if (!upperCase.equals("WHATSAPP")) {
                    i = w7e.ic_round_task;
                    break;
                } else {
                    i = w7e.ic_whatsapp;
                    break;
                }
            case 82233:
                if (upperCase.equals("SMS")) {
                    i = w7e.ic_message_text;
                    break;
                }
                break;
            case 2060894:
                if (upperCase.equals("CALL")) {
                    i = w7e.ic_activity_call_logged;
                    break;
                }
                break;
            case 2402290:
                if (upperCase.equals("NOTE")) {
                    i = w7e.ic_activity_notes_added;
                    break;
                }
                break;
            case 66081660:
                if (upperCase.equals("EMAIL")) {
                    i = w7e.ic_activity_email_sent;
                    break;
                }
                break;
        }
        imageView.setImageResource(i);
    }

    public static final void d0(TextView textView, Tasks tasks) {
        if (textView == null || tasks == null) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        long callStartTime = tasks.getCallStartTime();
        if (tasks.getVisitDateInMillis() > 0) {
            callStartTime = tasks.getVisitDateInMillis();
        }
        if (callStartTime <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(jm7.b0(callStartTime));
            textView.setVisibility(0);
        }
    }

    public static final void d1(TextView textView, Leads leads) {
        if (leads == null && textView != null) {
            textView.setText(" ");
            return;
        }
        if (textView != null && leads != null && !f9g.d0(leads.getName())) {
            String highLightTerm = leads.getHighLightTerm();
            boolean z = true;
            if (!(highLightTerm == null || f9g.d0(highLightTerm))) {
                String highLightTerm2 = leads.getHighLightTerm();
                if (highLightTerm2 != null && !f9g.d0(highLightTerm2)) {
                    z = false;
                }
                if (!z) {
                    String name = leads.getName();
                    Locale locale = Locale.ROOT;
                    String lowerCase = name.toLowerCase(locale);
                    sq8.m48648g(lowerCase, "toLowerCase(...)");
                    String highLightTerm3 = leads.getHighLightTerm();
                    sq8.m48646e(highLightTerm3);
                    String lowerCase2 = highLightTerm3.toLowerCase(locale);
                    sq8.m48648g(lowerCase2, "toLowerCase(...)");
                    if (f9g.m26306P(lowerCase, lowerCase2, false, 2, null)) {
                        String lowerCase3 = leads.getName().toLowerCase(locale);
                        sq8.m48648g(lowerCase3, "toLowerCase(...)");
                        SpannableString spannableString = new SpannableString(th1.m49850b(lowerCase3));
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-16776961);
                        String lowerCase4 = leads.getName().toLowerCase(locale);
                        sq8.m48648g(lowerCase4, "toLowerCase(...)");
                        String highLightTerm4 = leads.getHighLightTerm();
                        sq8.m48646e(highLightTerm4);
                        String lowerCase5 = highLightTerm4.toLowerCase(locale);
                        sq8.m48648g(lowerCase5, "toLowerCase(...)");
                        int iB0 = f9g.b0(lowerCase4, lowerCase5, 0, false, 6, null);
                        String lowerCase6 = leads.getName().toLowerCase(locale);
                        sq8.m48648g(lowerCase6, "toLowerCase(...)");
                        String highLightTerm5 = leads.getHighLightTerm();
                        sq8.m48646e(highLightTerm5);
                        int iB02 = f9g.b0(lowerCase6, highLightTerm5, 0, false, 6, null);
                        String highLightTerm6 = leads.getHighLightTerm();
                        sq8.m48646e(highLightTerm6);
                        try {
                            spannableString.setSpan(foregroundColorSpan, iB0, iB02 + highLightTerm6.length(), 33);
                            textView.setText(spannableString);
                            return;
                        } catch (IndexOutOfBoundsException unused) {
                            System.out.println((Object) ("'" + leads.getHighLightTerm() + "' was not not found in TextView text"));
                            return;
                        }
                    }
                }
            }
        }
        if (textView == null || leads == null || f9g.d0(leads.getName())) {
            return;
        }
        String lowerCase7 = leads.getName().toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase7, "toLowerCase(...)");
        textView.setText(th1.m49850b(lowerCase7));
    }

    public static final void d2(ViewProgressCard viewProgressCard, String str) {
        sq8.m48649h(str, "text");
        if (viewProgressCard != null) {
            viewProgressCard.setSubTitle(str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d3(MaterialTextView materialTextView, String str) {
        String str2;
        if (materialTextView == null || str == null) {
            return;
        }
        String upperCase = f9g.Z0(str).toString().toUpperCase(Locale.ROOT);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -1577559662:
                if (!upperCase.equals("WHATSAPP")) {
                    str2 = "Engagement Done";
                    break;
                } else {
                    str2 = "Whatsapp Message Sent";
                    break;
                }
            case 82233:
                if (upperCase.equals("SMS")) {
                    str2 = "SMS Sent";
                    break;
                }
                break;
            case 2060894:
                if (upperCase.equals("CALL")) {
                    str2 = "Call Placed";
                    break;
                }
                break;
            case 2402290:
                if (upperCase.equals("NOTE")) {
                    str2 = "Note Added";
                    break;
                }
                break;
            case 66081660:
                if (upperCase.equals("EMAIL")) {
                    str2 = "Email Sent";
                    break;
                }
                break;
        }
        materialTextView.setText(str2);
    }

    public static final void e0(TextView textView, Long l) {
        if (textView == null || l == null || l.longValue() <= 0) {
            return;
        }
        textView.setText(jm7.b0(l.longValue()));
    }

    public static final void e1(TextView textView, Tasks tasks) {
        if (tasks == null && textView != null) {
            textView.setText(" ");
            return;
        }
        if (textView != null && tasks != null && !f9g.d0(tasks.getClientName())) {
            String highLightTerm = tasks.getHighLightTerm();
            if (!(highLightTerm == null || f9g.d0(highLightTerm))) {
                String clientName = tasks.getClientName();
                Locale locale = Locale.ROOT;
                String lowerCase = clientName.toLowerCase(locale);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
                String highLightTerm2 = tasks.getHighLightTerm();
                sq8.m48646e(highLightTerm2);
                String lowerCase2 = highLightTerm2.toLowerCase(locale);
                sq8.m48648g(lowerCase2, "toLowerCase(...)");
                if (f9g.m26306P(lowerCase, lowerCase2, false, 2, null)) {
                    String lowerCase3 = tasks.getClientName().toLowerCase(locale);
                    sq8.m48648g(lowerCase3, "toLowerCase(...)");
                    SpannableString spannableString = new SpannableString(th1.m49850b(lowerCase3));
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-16776961);
                    String lowerCase4 = tasks.getClientName().toLowerCase(locale);
                    sq8.m48648g(lowerCase4, "toLowerCase(...)");
                    String highLightTerm3 = tasks.getHighLightTerm();
                    sq8.m48646e(highLightTerm3);
                    String lowerCase5 = highLightTerm3.toLowerCase(locale);
                    sq8.m48648g(lowerCase5, "toLowerCase(...)");
                    int iB0 = f9g.b0(lowerCase4, lowerCase5, 0, false, 6, null);
                    String lowerCase6 = tasks.getClientName().toLowerCase(locale);
                    sq8.m48648g(lowerCase6, "toLowerCase(...)");
                    String highLightTerm4 = tasks.getHighLightTerm();
                    sq8.m48646e(highLightTerm4);
                    int iB02 = f9g.b0(lowerCase6, highLightTerm4, 0, false, 6, null);
                    String highLightTerm5 = tasks.getHighLightTerm();
                    sq8.m48646e(highLightTerm5);
                    try {
                        spannableString.setSpan(foregroundColorSpan, iB0, iB02 + highLightTerm5.length(), 33);
                        textView.setText(spannableString);
                        return;
                    } catch (IndexOutOfBoundsException unused) {
                        System.out.println((Object) ("'" + tasks.getHighLightTerm() + "' was not not found in TextView text"));
                        return;
                    }
                }
            }
        }
        if (textView != null && tasks != null && !f9g.d0(tasks.getClientName())) {
            String lowerCase7 = tasks.getClientName().toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase7, "toLowerCase(...)");
            textView.setText(th1.m49850b(lowerCase7));
        } else {
            if (textView == null || tasks == null || !f9g.d0(tasks.getClientID())) {
                return;
            }
            String lowerCase8 = tasks.getTaskTitle().toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase8, "toLowerCase(...)");
            textView.setText(th1.m49850b(lowerCase8));
        }
    }

    public static final void e2(ViewProgressCard2 viewProgressCard2, String str) {
        if (viewProgressCard2 == null || str == null) {
            return;
        }
        viewProgressCard2.setTitle(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e3(ImageView imageView, String str) {
        int i;
        if (imageView == null || str == null) {
            return;
        }
        String upperCase = f9g.Z0(str).toString().toUpperCase(Locale.ROOT);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        int iHashCode = upperCase.hashCode();
        if (iHashCode != -1577559662) {
            if (iHashCode != 82233) {
                i = (iHashCode == 66081660 && upperCase.equals("EMAIL")) ? w7e.ic_email : w7e.ic_round_task;
            } else if (upperCase.equals("SMS")) {
                i = w7e.ic_message_text;
            }
        } else if (upperCase.equals("WHATSAPP")) {
            i = w7e.ic_whatsapp;
        }
        imageView.setImageResource(i);
    }

    /* renamed from: f */
    public static final void m40961f(View view, FileData fileData) {
        if (view == null || fileData == null) {
            if (view == null) {
                return;
            }
            view.setVisibility(8);
        } else {
            String[] strArr = {"jpg", "png", "gif", "jpeg", "webp", "image/gif", "image/jpg", "image/png", "image/jpeg", "image/webp"};
            if ((fileData.getMimeType().length() > 0) && gp0.m29251R(strArr, fileData.getMimeType())) {
                view.setVisibility(4);
            } else {
                view.setVisibility(8);
            }
        }
    }

    public static final void f0(TextView textView, PaymentDataInfo paymentDataInfo) {
        String strB0;
        if (textView == null || paymentDataInfo == null) {
            return;
        }
        if (paymentDataInfo.getCreatedAt() != null) {
            Long createdAt = paymentDataInfo.getCreatedAt();
            sq8.m48646e(createdAt);
            strB0 = jm7.b0(createdAt.longValue());
        } else {
            strB0 = "";
        }
        if (paymentDataInfo.getStatus() != null && paymentDataInfo.getUpdatedAt() != null) {
            String status = paymentDataInfo.getStatus();
            sq8.m48646e(status);
            Locale locale = Locale.getDefault();
            sq8.m48648g(locale, "getDefault(...)");
            String lowerCase = status.toLowerCase(locale);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            if (sq8.m48644c(lowerCase, "paid")) {
                Long updatedAt = paymentDataInfo.getUpdatedAt();
                sq8.m48646e(updatedAt);
                strB0 = jm7.b0(updatedAt.longValue());
            }
        }
        textView.setText(strB0);
    }

    public static final void f1(TextView textView, String str) {
        if (textView != null) {
            if (str == null || f9g.d0(str)) {
                textView.setText(" ");
                return;
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            textView.setText(th1.m49850b(lowerCase));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f2(TextView textView, Tasks tasks) {
        Long nextFollowUpOn;
        if (textView == null || tasks == null) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        if (tasks.getNextFollowUpOn() != null) {
            Long nextFollowUpOn2 = tasks.getNextFollowUpOn();
            sq8.m48646e(nextFollowUpOn2);
            nextFollowUpOn = nextFollowUpOn2.longValue() > 0 ? tasks.getNextFollowUpOn() : tasks.getTaskDateInMillis() > 0 ? Long.valueOf(tasks.getTaskDateInMillis()) : null;
        }
        if (nextFollowUpOn == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(jm7.m34026L(nextFollowUpOn.longValue(), textView));
            textView.setVisibility(0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f3(ImageView imageView, String str) {
        int i;
        if (imageView == null || str == null) {
            return;
        }
        String upperCase = f9g.Z0(str).toString().toUpperCase(Locale.ROOT);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -1066447067:
                if (!upperCase.equals("CALL_DISPOSITION_NOT_RECORDED")) {
                    i = w7e.ic_round_task;
                    break;
                } else {
                    i = w7e.ic_call;
                    break;
                }
            case -585793984:
                if (upperCase.equals("VISIT_NOT_ADDED")) {
                    i = w7e.ic_round_visit;
                    break;
                }
                break;
            case 690643242:
                if (upperCase.equals("CALL_NOT_ANSWERED")) {
                    i = w7e.ic_call_missed;
                    break;
                }
                break;
            case 1138375928:
                if (upperCase.equals("VISIT_DISPOSITION_NOT_RECORDED")) {
                    i = w7e.ic_add_visit;
                    break;
                }
                break;
        }
        imageView.setImageResource(i);
    }

    /* renamed from: g */
    public static final void m40962g(MaterialButton materialButton, ChatMessages chatMessages) {
        if (materialButton == null || chatMessages == null) {
            return;
        }
        if (sq8.m48644c(chatMessages.getMessageType(), "interactive") && sq8.m48644c(chatMessages.getMessageSubType(), "cta_url")) {
            ActionInteractive actionInteractive = chatMessages.getActionInteractive();
            materialButton.setText(actionInteractive != null ? actionInteractive.getDisplay_text() : null);
            return;
        }
        if (sq8.m48644c(chatMessages.getMessageType(), "interactive") && sq8.m48644c(chatMessages.getMessageSubType(), "list")) {
            ActionInteractive actionInteractive2 = chatMessages.getActionInteractive();
            materialButton.setText(actionInteractive2 != null ? actionInteractive2.getButton() : null);
            return;
        }
        if (sq8.m48644c(chatMessages.getMessageType(), "interactive") && sq8.m48644c(chatMessages.getMessageSubType(), "catalog_message")) {
            materialButton.setText("View Catalog");
            return;
        }
        if (sq8.m48644c(chatMessages.getMessageType(), "interactive") && sq8.m48644c(chatMessages.getMessageSubType(), "location_request_message")) {
            materialButton.setText("Send Location");
            return;
        }
        if (sq8.m48644c(chatMessages.getMessageType(), "order")) {
            materialButton.setText("Order Received");
        } else if (sq8.m48644c(chatMessages.getMessageType(), "text") && sq8.m48644c(chatMessages.getFollowUpType(), SearchIntents.EXTRA_QUERY) && chatMessages.getResponseMessage() == null) {
            materialButton.setText("Respond");
        } else {
            materialButton.setVisibility(8);
        }
    }

    public static final void g0(TextView textView, ChatChannel chatChannel) {
        if (textView != null && chatChannel != null && !chatChannel.getShowSelection() && chatChannel.getLastMessage() != null) {
            ChatMessages lastMessage = chatChannel.getLastMessage();
            sq8.m48646e(lastMessage);
            if (lastMessage.getCreatedAt() != null) {
                ChatMessages lastMessage2 = chatChannel.getLastMessage();
                sq8.m48646e(lastMessage2);
                Long createdAt = lastMessage2.getCreatedAt();
                sq8.m48646e(createdAt);
                if (createdAt.longValue() > 0) {
                    ChatMessages lastMessage3 = chatChannel.getLastMessage();
                    sq8.m48646e(lastMessage3);
                    Long createdAt2 = lastMessage3.getCreatedAt();
                    textView.setText(createdAt2 != null ? jm7.m34024J(createdAt2.longValue(), textView) : null);
                    textView.setVisibility(0);
                    return;
                }
            }
        }
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public static final void g1(Chip chip, String str) {
        if (chip != null) {
            if (str == null || f9g.d0(str)) {
                chip.setText(" ");
                return;
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            chip.setText(th1.m49850b(lowerCase));
        }
    }

    public static final void g2(TextView textView, Tasks tasks) {
        if (textView == null || tasks == null) {
            return;
        }
        if (tasks.getTaskDateInMillis() <= 0) {
            if (!(tasks.getTaskTag().length() == 0)) {
                textView.setText(tasks.getTaskTag());
                return;
            }
            if (tasks.getTaskTitle().length() == 0) {
                textView.setText("Unknown Open Task");
                return;
            }
            textView.setText("Task : " + tasks.getTaskTitle());
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM");
        Date date = new Date(tasks.getTaskDateInMillis());
        if (tasks.getTaskTag().length() == 0) {
            textView.setText("Task Due on " + simpleDateFormat.format(date));
            return;
        }
        textView.setText(tasks.getTaskTag() + " Due on " + simpleDateFormat.format(date));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g3(ImageView imageView, String str) {
        int i;
        if (imageView == null || str == null) {
            return;
        }
        String upperCase = f9g.Z0(str).toString().toUpperCase(Locale.ROOT);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -1017954416:
                if (!upperCase.equals("LEAD_ASSIGNMENT")) {
                    i = w7e.ic_round_task;
                    break;
                } else {
                    i = w7e.ic_leads;
                    break;
                }
            case 97084871:
                if (upperCase.equals("TASK_ASSIGNMENT")) {
                    i = w7e.ic_round_task;
                    break;
                }
                break;
            case 436244206:
                if (upperCase.equals("DOCUMENT_OPEN")) {
                    i = w7e.ic_content;
                    break;
                }
                break;
            case 602216940:
                if (upperCase.equals("TASK_REMINDER")) {
                    i = w7e.ic_add_task_reminder;
                    break;
                }
                break;
        }
        imageView.setImageResource(i);
    }

    /* renamed from: h */
    public static final void m40963h(MaterialButton materialButton, ChatMessages chatMessages) {
        if (materialButton == null || chatMessages == null) {
            return;
        }
        if (sq8.m48644c(chatMessages.getMessageType(), "interactive") && sq8.m48644c(chatMessages.getMessageSubType(), "cta_url")) {
            ActionInteractive actionInteractive = chatMessages.getActionInteractive();
            materialButton.setText(actionInteractive != null ? actionInteractive.getDisplay_text() : null);
            return;
        }
        if (sq8.m48644c(chatMessages.getMessageType(), "interactive") && sq8.m48644c(chatMessages.getMessageSubType(), "list")) {
            ActionInteractive actionInteractive2 = chatMessages.getActionInteractive();
            materialButton.setText(actionInteractive2 != null ? actionInteractive2.getButton() : null);
            return;
        }
        if (sq8.m48644c(chatMessages.getMessageType(), "interactive") && sq8.m48644c(chatMessages.getMessageSubType(), "catalog_message")) {
            materialButton.setText("View Catalog");
            return;
        }
        if (sq8.m48644c(chatMessages.getMessageType(), "interactive") && sq8.m48644c(chatMessages.getMessageSubType(), "location_request_message")) {
            materialButton.setText("Send Location");
        } else if (sq8.m48644c(chatMessages.getMessageType(), "order")) {
            materialButton.setText("Order Received");
        } else {
            materialButton.setVisibility(8);
        }
    }

    public static final void h0(TextView textView, Long l) {
        if (textView != null && l != null && l.longValue() > 0) {
            textView.setText(jm7.m34024J(l.longValue(), textView));
            textView.setVisibility(0);
        } else {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public static final void h1(Chip chip, CallOutcome callOutcome) {
        ColorStateList colorStateListValueOf;
        String str;
        if (chip == null || callOutcome == null) {
            if (chip == null) {
                return;
            }
            chip.setText(" ");
            return;
        }
        String outcomeTitle = callOutcome.getOutcomeTitle();
        Locale locale = Locale.ROOT;
        String lowerCase = outcomeTitle.toLowerCase(locale);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        String strM49850b = th1.m49850b(lowerCase);
        String lowerCase2 = callOutcome.getNature().toLowerCase(locale);
        sq8.m48648g(lowerCase2, "toLowerCase(...)");
        if (sq8.m48644c(lowerCase2, "positive")) {
            colorStateListValueOf = ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_green));
            sq8.m48648g(colorStateListValueOf, "valueOf(...)");
            str = "👍";
        } else if (sq8.m48644c(lowerCase2, "negative")) {
            colorStateListValueOf = ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_red));
            sq8.m48648g(colorStateListValueOf, "valueOf(...)");
            str = "👎";
        } else {
            colorStateListValueOf = ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_blue));
            sq8.m48648g(colorStateListValueOf, "valueOf(...)");
            str = "😐";
        }
        chip.setText(strM49850b + " " + str);
        if (callOutcome.isSelected()) {
            chip.setChipBackgroundColor(colorStateListValueOf);
            chip.setTextColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_white)));
        } else {
            chip.setChipBackgroundColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_transparent)));
            chip.setTextColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_black)));
        }
    }

    public static final void h2(TextView textView, String str) {
        if (textView == null || str == null) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -1840806584) {
            if (str.equals("SUPERBOSS")) {
                textView.setText("Super Boss");
            }
        } else if (iHashCode == -1107556053) {
            if (str.equals("TEAM_LEADER")) {
                textView.setText("Team Leader");
            }
        } else if (iHashCode == 355587284 && str.equals("REPORTEE")) {
            textView.setText("Reportee");
        }
    }

    public static final void h3(final AbstractC2333d abstractC2333d, int i, final int i2, final Bundle bundle) {
        sq8.m48649h(abstractC2333d, "<this>");
        AbstractC2341h abstractC2341hM8591G = abstractC2333d.m8591G();
        boolean z = false;
        if (abstractC2341hM8591G != null && i == abstractC2341hM8591G.m8753A()) {
            z = true;
        }
        if (z) {
            try {
                j0f.m33008i(new Runnable() { // from class: o.mr1
                    @Override // java.lang.Runnable
                    public final void run() {
                        nr1.i3(abstractC2333d, i2, bundle);
                    }
                });
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Navigation failed: ");
                sb.append(message);
            }
        }
    }

    /* renamed from: i */
    public static final void m40964i(ShapeableImageView shapeableImageView, Activities activities) {
        sq8.m48649h(shapeableImageView, "view");
        if (activities != null) {
            shapeableImageView.setImageTintList(ColorStateList.valueOf(c64.getColor(shapeableImageView.getContext(), u6e.colorPrimary)));
            mge mgeVar = new mge("\\b\\d{2}:\\d{2}:\\d{2}\\b");
            String content = activities.getContent();
            if (content == null) {
                content = "";
            }
            if (mgeVar.m38991a(content)) {
                jta jtaVarM38989c = mge.m38989c(mgeVar, content, 0, 2, null);
                if (sq8.m48644c(jtaVarM38989c != null ? jtaVarM38989c.getValue() : null, "00:00:00")) {
                    shapeableImageView.setBackgroundColor(shapeableImageView.getContext().getColor(u6e.superfone_red_10));
                    shapeableImageView.setImageTintList(ColorStateList.valueOf(c64.getColor(shapeableImageView.getContext(), u6e.colorError)));
                } else {
                    shapeableImageView.setBackgroundColor(shapeableImageView.getContext().getColor(u6e.superfone_blue_10));
                    shapeableImageView.setImageTintList(ColorStateList.valueOf(c64.getColor(shapeableImageView.getContext(), u6e.colorTertiary)));
                }
            } else {
                shapeableImageView.setBackgroundColor(shapeableImageView.getContext().getColor(u6e.superfone_blue_10));
            }
            obj = y3i.f54824a;
        }
        if (obj == null) {
            shapeableImageView.setBackgroundColor(shapeableImageView.getContext().getColor(u6e.superfone_blue_10));
        }
    }

    public static final void i0(TextView textView, Long l) {
        if (textView == null || l == null || l.longValue() <= 0) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        } else {
            textView.setText("Uploaded At : " + jm7.m34026L(l.longValue(), textView));
            textView.setVisibility(0);
        }
    }

    public static final void i1(TextView textView, ChatChannel chatChannel) {
        if (chatChannel == null && textView != null) {
            textView.setText(" ");
            return;
        }
        if (textView == null || chatChannel == null) {
            return;
        }
        Leads contact = chatChannel.getContact();
        boolean z = true;
        if (contact != null && !f9g.d0(contact.getName())) {
            String highLightTerm = contact.getHighLightTerm();
            if (!(highLightTerm == null || f9g.d0(highLightTerm))) {
                String highLightTerm2 = contact.getHighLightTerm();
                if (!(highLightTerm2 == null || f9g.d0(highLightTerm2))) {
                    String name = contact.getName();
                    Locale locale = Locale.ROOT;
                    String lowerCase = name.toLowerCase(locale);
                    sq8.m48648g(lowerCase, "toLowerCase(...)");
                    String highLightTerm3 = contact.getHighLightTerm();
                    sq8.m48646e(highLightTerm3);
                    String lowerCase2 = highLightTerm3.toLowerCase(locale);
                    sq8.m48648g(lowerCase2, "toLowerCase(...)");
                    if (f9g.m26306P(lowerCase, lowerCase2, false, 2, null)) {
                        String lowerCase3 = contact.getName().toLowerCase(locale);
                        sq8.m48648g(lowerCase3, "toLowerCase(...)");
                        SpannableString spannableString = new SpannableString(th1.m49850b(lowerCase3));
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-16776961);
                        String lowerCase4 = contact.getName().toLowerCase(locale);
                        sq8.m48648g(lowerCase4, "toLowerCase(...)");
                        String highLightTerm4 = contact.getHighLightTerm();
                        sq8.m48646e(highLightTerm4);
                        String lowerCase5 = highLightTerm4.toLowerCase(locale);
                        sq8.m48648g(lowerCase5, "toLowerCase(...)");
                        int iB0 = f9g.b0(lowerCase4, lowerCase5, 0, false, 6, null);
                        String lowerCase6 = contact.getName().toLowerCase(locale);
                        sq8.m48648g(lowerCase6, "toLowerCase(...)");
                        String highLightTerm5 = contact.getHighLightTerm();
                        sq8.m48646e(highLightTerm5);
                        int iB02 = f9g.b0(lowerCase6, highLightTerm5, 0, false, 6, null);
                        String highLightTerm6 = contact.getHighLightTerm();
                        sq8.m48646e(highLightTerm6);
                        try {
                            spannableString.setSpan(foregroundColorSpan, iB0, iB02 + highLightTerm6.length(), 33);
                            textView.setText(spannableString);
                            return;
                        } catch (IndexOutOfBoundsException unused) {
                            System.out.println((Object) ("'" + contact.getHighLightTerm() + "' was not not found in TextView text"));
                            return;
                        }
                    }
                }
            }
        }
        if (contact != null && !f9g.d0(contact.getName())) {
            String lowerCase7 = contact.getName().toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase7, "toLowerCase(...)");
            textView.setText(th1.m49850b(lowerCase7));
        } else if (chatChannel.getVisitorId() != null) {
            String channelName = chatChannel.getChannelName();
            if (channelName != null && channelName.length() != 0) {
                z = false;
            }
            if (z) {
                return;
            }
            textView.setText("Visitor : " + chatChannel.getChannelName());
        }
    }

    public static final void i2(ImageView imageView, Template template) {
        if (imageView == null || template == null) {
            return;
        }
        if (template.getDescription().length() > 0) {
            if (f9g.Z0(template.getDescription()).toString().length() > 0) {
                String strValueOf = String.valueOf(f9g.Z0(template.getDescription()).toString().charAt(0));
                sq8.m48647f(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                sq8.m48648g(upperCase, "toUpperCase(...)");
                imageView.setImageDrawable(xgh.m56281a().mo56294a(upperCase, oh3.f38348d.m42239b(template.getId()), 20));
            }
        }
    }

    public static final void i3(AbstractC2333d abstractC2333d, int i, Bundle bundle) {
        sq8.m48649h(abstractC2333d, "$this_safeNavigate");
        abstractC2333d.m8604U(i, bundle);
    }

    /* renamed from: j */
    public static final void m40965j(TextView textView, ChatMessages chatMessages) {
        if (textView == null || chatMessages == null) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        String messageText = chatMessages.getMessageText();
        boolean z = true;
        if (messageText == null || f9g.d0(messageText)) {
            String headerText = chatMessages.getHeaderText();
            if (headerText == null || f9g.d0(headerText)) {
                String footerText = chatMessages.getFooterText();
                if (footerText == null || f9g.d0(footerText)) {
                    textView.setVisibility(8);
                    return;
                }
            }
        }
        String headerText2 = chatMessages.getHeaderText();
        String str = "";
        if (!(headerText2 == null || f9g.d0(headerText2))) {
            str = "" + chatMessages.getHeaderText() + "\n";
        }
        String messageText2 = chatMessages.getMessageText();
        if (!(messageText2 == null || f9g.d0(messageText2))) {
            str = str + chatMessages.getMessageText();
        }
        String footerText2 = chatMessages.getFooterText();
        if (footerText2 != null && !f9g.d0(footerText2)) {
            z = false;
        }
        if (!z) {
            str = str + "\n" + chatMessages.getFooterText();
        }
        textView.setText(U2(str));
        textView.setVisibility(0);
    }

    public static final void j0(TextView textView, Long l) {
        if (textView == null || l == null || l.longValue() <= 0) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        } else {
            textView.setText("Call At : \n" + jm7.m34026L(l.longValue(), textView));
            textView.setVisibility(0);
        }
    }

    public static final void j1(TextView textView, String str) {
        if (textView != null) {
            if (str == null || f9g.d0(str)) {
                textView.setText(" ");
                return;
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            textView.setText("Deal Stage : " + th1.m49850b(lowerCase));
        }
    }

    public static final void j2(TextView textView, Date date) {
        if (textView == null || date == null) {
            return;
        }
        textView.setText(jm7.m34024J(date.getTime(), textView));
    }

    public static final void j3(MaterialCardView materialCardView, String str) {
        sq8.m48649h(materialCardView, "cardView");
        KonfettiView konfettiView = (KonfettiView) materialCardView.findViewById(z8e.konfettiView);
        if (!sq8.m48644c(str, "DEAL_WON") && !sq8.m48644c(str, "PAYMENT_RECEIVED")) {
            if (konfettiView != null) {
                konfettiView.setVisibility(8);
            }
        } else if (konfettiView != null) {
            konfettiView.setVisibility(0);
            konfettiView.m16279b(new izc(0, 360, 5.0f, 10.0f, 0.9f, null, ch3.m21249n(16766720, 16776960, 16753920), null, 2000L, false, new sed.C16820b(0.5d, 0.5d), 0, null, new h56(1L, TimeUnit.SECONDS).m29822c(100), 6817, null));
        }
    }

    /* renamed from: k */
    public static final void m40966k(TextView textView, Template template) {
        if (textView == null || template == null) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        String templateTitle = template.getTemplateTitle();
        String templateBody = template.getTemplateBody();
        boolean z = true;
        if (templateBody == null || f9g.d0(templateBody)) {
            if (templateTitle == null || f9g.d0(templateTitle)) {
                textView.setVisibility(8);
                return;
            }
        }
        String str = "";
        if (!(templateTitle == null || f9g.d0(templateTitle))) {
            str = "" + templateTitle + "\n";
        }
        if (templateBody != null && !f9g.d0(templateBody)) {
            z = false;
        }
        if (!z) {
            str = str + templateBody;
        }
        textView.setText(U2(str));
        textView.setVisibility(0);
    }

    public static final void k0(TextView textView, Long l) {
        if (textView != null && l != null && l.longValue() > 0) {
            textView.setText(jm7.m34026L(l.longValue(), textView));
            textView.setVisibility(0);
        } else if (textView != null) {
            textView.setText("--");
            textView.setVisibility(8);
        }
    }

    public static final void k1(MaterialTextView materialTextView, Tasks tasks) {
        if (materialTextView != null) {
            if ((tasks != null ? tasks.getClient() : null) != null) {
                LeadsSummary client = tasks.getClient();
                sq8.m48646e(client);
                String activeDealStage = client.getActiveDealStage();
                if (!(activeDealStage == null || activeDealStage.length() == 0)) {
                    LeadsSummary client2 = tasks.getClient();
                    sq8.m48646e(client2);
                    materialTextView.setText("Deal Stage : " + client2.getActiveDealStage());
                    materialTextView.setVisibility(0);
                    return;
                }
            }
            materialTextView.setText(" ");
            materialTextView.setVisibility(8);
        }
    }

    public static final void k2(TextView textView, Tasks tasks) {
        if (textView == null || tasks == null) {
            return;
        }
        String str = "";
        if (sq8.m48644c(tasks.getTaskEngagementType(), "CALL")) {
            if (!f9g.d0(tasks.getCallOutcome())) {
                String lowerCase = tasks.getCallOutcome().toLowerCase(Locale.ROOT);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
                str = "Call Outcome : " + th1.m49851c(lowerCase);
            }
            if (!f9g.d0(tasks.getCallNextStep())) {
                String lowerCase2 = tasks.getCallNextStep().toLowerCase(Locale.ROOT);
                sq8.m48648g(lowerCase2, "toLowerCase(...)");
                str = str + "\nNext Step : " + th1.m49851c(lowerCase2);
            }
            if (!f9g.d0(tasks.getCallInputNotes())) {
                str = str + "\n" + tasks.getCallInputNotes();
            }
        } else {
            if (!f9g.d0(tasks.getVisitOutcome())) {
                String lowerCase3 = tasks.getVisitOutcome().toLowerCase(Locale.ROOT);
                sq8.m48648g(lowerCase3, "toLowerCase(...)");
                str = "Visit Outcome : " + th1.m49851c(lowerCase3);
            }
            if (!f9g.d0(tasks.getVisitNextStep())) {
                String lowerCase4 = tasks.getVisitNextStep().toLowerCase(Locale.ROOT);
                sq8.m48648g(lowerCase4, "toLowerCase(...)");
                str = str + "\nNext Step : " + th1.m49851c(lowerCase4);
            }
            if (!f9g.d0(tasks.getVisitNotes())) {
                str = str + "\n" + tasks.getVisitNotes();
            }
        }
        textView.setText(f9g.Z0(str).toString());
    }

    public static final void k3(View view, float f) {
        sq8.m48649h(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        sq8.m48647f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd((int) f);
        view.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: l */
    public static final void m40967l(TextView textView, WhatsAppTemplates whatsAppTemplates) {
        TemplateComponent templateComponent;
        WaFooter waFooter;
        TemplateComponent templateComponent2;
        WaBody waBody;
        TemplateComponent templateComponent3;
        WaHeader waHeader;
        if (textView == null || whatsAppTemplates == null) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        List<TemplateComponent> components = whatsAppTemplates.getComponents();
        String waText = null;
        String waText2 = (components == null || (templateComponent3 = (TemplateComponent) kh3.h0(components)) == null || (waHeader = templateComponent3.getWaHeader()) == null) ? null : waHeader.getWaText();
        String str = "";
        if (waText2 == null) {
            waText2 = "";
        }
        List<TemplateComponent> components2 = whatsAppTemplates.getComponents();
        String waText3 = (components2 == null || (templateComponent2 = (TemplateComponent) kh3.h0(components2)) == null || (waBody = templateComponent2.getWaBody()) == null) ? null : waBody.getWaText();
        if (waText3 == null) {
            waText3 = "";
        }
        List<TemplateComponent> components3 = whatsAppTemplates.getComponents();
        if (components3 != null && (templateComponent = (TemplateComponent) kh3.h0(components3)) != null && (waFooter = templateComponent.getWaFooter()) != null) {
            waText = waFooter.getWaText();
        }
        if (waText == null) {
            waText = "";
        }
        if (f9g.d0(waText3)) {
            if (f9g.d0(waText2)) {
                if (f9g.d0(waText)) {
                    textView.setVisibility(8);
                    return;
                }
            }
        }
        if (!(f9g.d0(waText2))) {
            str = "" + waText2 + "\n";
        }
        if (!(f9g.d0(waText3))) {
            str = str + waText3;
        }
        if (!(f9g.d0(waText))) {
            str = str + "\n" + waText;
        }
        textView.setText(U2(str));
        textView.setVisibility(0);
    }

    public static final void l0(TextView textView, String str) {
        if (textView != null && str != null) {
            textView.setText(jm7.m34026L(Instant.parse(str).toEpochMilli(), textView));
            textView.setVisibility(0);
        } else if (textView != null) {
            textView.setText("--");
        }
    }

    public static final void l1(Chip chip, DealStageDefinition dealStageDefinition) {
        if (chip == null || dealStageDefinition == null) {
            if (chip == null) {
                return;
            }
            chip.setText(" ");
            return;
        }
        String lowerCase = dealStageDefinition.getName().toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        String strM49850b = th1.m49850b(lowerCase);
        if (dealStageDefinition.getCurrentlySelectedLost() && dealStageDefinition.getSelected()) {
            chip.setChipBackgroundColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_red)));
            chip.setTextColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_white)));
        } else if (dealStageDefinition.getCurrentlySelectedWin() && dealStageDefinition.getSelected()) {
            chip.setChipBackgroundColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_green)));
            chip.setTextColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_white)));
        } else if (dealStageDefinition.getSelected()) {
            chip.setChipBackgroundColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_blue)));
            chip.setTextColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_white)));
        } else {
            chip.setChipBackgroundColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_transparent)));
            chip.setTextColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_black)));
        }
        chip.setText(strM49850b);
    }

    public static final void l2(TextView textView, Tasks tasks) {
        if (textView == null || tasks == null) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        } else if (tasks.getVisitDateInMillis() > 0) {
            textView.setText(jm7.m34024J(tasks.getVisitDateInMillis(), textView));
            textView.setVisibility(0);
        } else if (tasks.getCallStartTime() > 0) {
            textView.setText(DateUtils.formatElapsedTime(tasks.getCallDurationInMillis() / 1000));
            textView.setVisibility(0);
        }
    }

    public static final void l3(View view, float f) {
        sq8.m48649h(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        sq8.m48647f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart((int) f);
        view.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: m */
    public static final void m40968m(Chip chip, String str) throws ParseException {
        if (chip == null) {
            return;
        }
        if (str == null) {
            chip.setText("Not Marked");
            chip.setChipBackgroundColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_red)));
        } else {
            Date date = null;
            String strU0 = f9g.U0(str, '.', null, 2, null);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            simpleDateFormat.setLenient(false);
            try {
                date = simpleDateFormat.parse(strU0);
            } catch (ParseException unused) {
            }
            if (date != null) {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm", Locale.getDefault());
                simpleDateFormat2.setTimeZone(TimeZone.getDefault());
                chip.setText("Logged In : " + simpleDateFormat2.format(date));
                chip.setChipBackgroundColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_green)));
            } else {
                chip.setText("Invalid Time");
                chip.setChipBackgroundColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_red)));
            }
        }
        chip.setVisibility(0);
    }

    public static final void m0(TextView textView, String str) {
        if (textView != null) {
            if (!(str == null || str.length() == 0)) {
                textView.setText(jm7.m34024J(Instant.parse(str).toEpochMilli(), textView));
                textView.setVisibility(0);
                return;
            }
        }
        if (textView != null) {
            textView.setText("--");
        }
    }

    public static final void m1(TextView textView, LeadsUser leadsUser) {
        if (textView == null || leadsUser == null) {
            if (textView != null) {
                textView.setText(" ");
                return;
            }
            return;
        }
        String name = leadsUser.getName();
        if (!(name == null || f9g.d0(name))) {
            String lowerCase = leadsUser.getName().toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            textView.setText(th1.m49850b(lowerCase));
        } else {
            String registeredNumber = leadsUser.getRegisteredNumber();
            if (registeredNumber == null || f9g.d0(registeredNumber)) {
                textView.setText(" ");
            } else {
                textView.setText(leadsUser.getRegisteredNumber());
            }
        }
    }

    public static final void m2(TextView textView, String str) {
        if (textView == null || str == null) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(4);
        } else {
            List listD0 = f9g.D0(str, new String[]{"/"}, true, 0, 4, null);
            if (listD0.size() > 1) {
                textView.setText((CharSequence) listD0.get(1));
            } else {
                textView.setText((CharSequence) listD0.get(0));
            }
            textView.setVisibility(0);
        }
    }

    public static final void m3(View view, float f) {
        sq8.m48649h(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        sq8.m48647f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = (int) f;
        view.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: n */
    public static final void m40969n(Chip chip, AttendanceInfo attendanceInfo) {
        int i;
        String str;
        Object objM53351b;
        if (chip == null) {
            return;
        }
        if ((attendanceInfo != null ? attendanceInfo.getTimeOfAttendance() : null) == null) {
            chip.setVisibility(8);
            return;
        }
        chip.setVisibility(0);
        if (attendanceInfo.getCheckoutTime() != null) {
            String checkoutTime = attendanceInfo.getCheckoutTime();
            sq8.m48646e(checkoutTime);
            String strU0 = f9g.U0(checkoutTime, '.', null, 2, null);
            try {
                vre.C17665a c17665a = vre.f50797b;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                simpleDateFormat.setLenient(false);
                objM53351b = vre.m53351b(simpleDateFormat.parse(strU0));
            } catch (Throwable th) {
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
            }
            Date date = (Date) (vre.m53356g(objM53351b) ? null : objM53351b);
            if (date != null) {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm", Locale.getDefault());
                simpleDateFormat2.setTimeZone(TimeZone.getDefault());
                str = "Logged Out : " + simpleDateFormat2.format(date);
                i = u6e.superfone_red;
            } else {
                i = u6e.superfone_red;
                str = "Invalid Time";
            }
        } else {
            i = u6e.superfone_green;
            str = "Still Logged In";
        }
        chip.setText(str);
        chip.setChipBackgroundColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), i)));
    }

    public static final void n0(TextView textView, Tasks tasks) {
        if (textView == null || tasks == null) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        Long updatedAt = tasks.getUpdatedAt();
        if (sq8.m48644c(tasks.getTaskEngagementType(), "CALL")) {
            updatedAt = Long.valueOf(tasks.getCallEndTime());
        } else if (sq8.m48644c(tasks.getTaskEngagementType(), "VISIT")) {
            updatedAt = Long.valueOf(tasks.getVisitDateInMillis());
        }
        textView.setText(updatedAt != null ? jm7.m34026L(updatedAt.longValue(), textView) : null);
        textView.setVisibility(0);
    }

    public static final void n1(Chip chip, VisitOutcome visitOutcome) {
        ColorStateList colorStateListValueOf;
        String str;
        if (chip == null || visitOutcome == null) {
            if (chip == null) {
                return;
            }
            chip.setText(" ");
            return;
        }
        String outcomeTitle = visitOutcome.getOutcomeTitle();
        Locale locale = Locale.ROOT;
        String lowerCase = outcomeTitle.toLowerCase(locale);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        String strM49850b = th1.m49850b(lowerCase);
        String lowerCase2 = visitOutcome.getNature().toLowerCase(locale);
        sq8.m48648g(lowerCase2, "toLowerCase(...)");
        if (sq8.m48644c(lowerCase2, "positive")) {
            colorStateListValueOf = ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_green));
            sq8.m48648g(colorStateListValueOf, "valueOf(...)");
            str = "👍";
        } else if (sq8.m48644c(lowerCase2, "negative")) {
            colorStateListValueOf = ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_red));
            sq8.m48648g(colorStateListValueOf, "valueOf(...)");
            str = "👎";
        } else {
            colorStateListValueOf = ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_blue));
            sq8.m48648g(colorStateListValueOf, "valueOf(...)");
            str = "😐";
        }
        chip.setText(strM49850b + " " + str);
        if (visitOutcome.isSelected()) {
            chip.setChipBackgroundColor(colorStateListValueOf);
            chip.setTextColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_white)));
        } else {
            chip.setChipBackgroundColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_transparent)));
            chip.setTextColor(ColorStateList.valueOf(c64.getColor(chip.getContext(), u6e.superfone_black)));
        }
    }

    public static final void n2(LinearLayout linearLayout, FileData fileData) {
        if (linearLayout == null || fileData == null) {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        if (!(fileData.getUploadedUri().length() > 0) && fileData.getContentUri() == null) {
            linearLayout.setVisibility(8);
        } else if (gp0.m29251R(new String[]{"jpg", "png", "gif", "jpeg", "webp", "image/gif", "image/jpg", "image/png", "image/jpeg", "image/webp"}, fileData.getMimeType()) || e9g.m24597K(fileData.getMimeType(), "audio", false, 2, null)) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final void n3(MaterialCardView materialCardView, String str) {
        if (materialCardView == null || str == null) {
            return;
        }
        int i = u6e.backgroundTasks20;
        String upperCase = f9g.Z0(str).toString().toUpperCase(Locale.ROOT);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case 2060894:
                if (upperCase.equals("CALL")) {
                    i = u6e.backgroundCalls20;
                    break;
                }
                break;
            case 2402290:
                if (upperCase.equals("NOTE")) {
                    i = u6e.backgroundAssigned20;
                    break;
                }
                break;
            case 2567557:
                if (upperCase.equals("TASK")) {
                    i = u6e.backgroundTasks20;
                    break;
                }
                break;
            case 81679659:
                if (upperCase.equals("VISIT")) {
                    i = u6e.backgroundVisits20;
                    break;
                }
                break;
        }
        materialCardView.setCardBackgroundColor(c64.getColor(materialCardView.getContext(), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m40970o(ImageView imageView, AttendanceInfo attendanceInfo) {
        String upperCase;
        if (imageView == null || attendanceInfo == null) {
            return;
        }
        LeadsUser leadsUserAttendanceUser = attendanceInfo.attendanceUser();
        String capturedImageUrl = attendanceInfo.getCapturedImageUrl();
        sq8.m48646e(leadsUserAttendanceUser);
        String id = leadsUserAttendanceUser.getId();
        if (leadsUserAttendanceUser.getName().length() > 0) {
            if (f9g.Z0(leadsUserAttendanceUser.getName()).toString().length() > 0) {
                String strValueOf = String.valueOf(f9g.Z0(leadsUserAttendanceUser.getName()).toString().charAt(0));
                sq8.m48647f(strValueOf, "null cannot be cast to non-null type java.lang.String");
                upperCase = strValueOf.toUpperCase(Locale.ROOT);
                sq8.m48648g(upperCase, "toUpperCase(...)");
            }
        } else {
            upperCase = "";
        }
        if (!(capturedImageUrl == null || capturedImageUrl.length() == 0)) {
            sq8.m48646e(capturedImageUrl);
            if (!f9g.m26306P(capturedImageUrl, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null)) {
                pu5.m44193b().m44196d(imageView, capturedImageUrl);
                return;
            }
        }
        if (!(id == null || id.length() == 0)) {
            if (!(upperCase.length() == 0)) {
                imageView.setImageDrawable(xgh.m56281a().mo56294a(upperCase, oh3.f38348d.m42239b(id), 20));
                return;
            }
        }
        imageView.setImageResource(R.color.transparent);
    }

    public static final void o0(TextView textView, Long l) {
        if (textView == null || l == null || l.longValue() <= 0) {
            return;
        }
        textView.setText(jm7.m34031Q(l.longValue()));
        textView.setVisibility(0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final void o1(TextView textView, Activities activities) {
        if (activities == null && textView != null) {
            textView.setText(" ");
            return;
        }
        if (textView != null && activities != null && !f9g.d0(activities.getTitle())) {
            String highLightTerm = activities.getHighLightTerm();
            if (!(highLightTerm == null || f9g.d0(highLightTerm))) {
                String title = activities.getTitle();
                Locale locale = Locale.ROOT;
                String lowerCase = title.toLowerCase(locale);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
                String highLightTerm2 = activities.getHighLightTerm();
                sq8.m48646e(highLightTerm2);
                String lowerCase2 = highLightTerm2.toLowerCase(locale);
                sq8.m48648g(lowerCase2, "toLowerCase(...)");
                if (f9g.m26306P(lowerCase, lowerCase2, false, 2, null)) {
                    String lowerCase3 = activities.getTitle().toLowerCase(locale);
                    sq8.m48648g(lowerCase3, "toLowerCase(...)");
                    SpannableString spannableString = new SpannableString(th1.m49850b(lowerCase3));
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-16776961);
                    String lowerCase4 = activities.getTitle().toLowerCase(locale);
                    sq8.m48648g(lowerCase4, "toLowerCase(...)");
                    String highLightTerm3 = activities.getHighLightTerm();
                    sq8.m48646e(highLightTerm3);
                    String lowerCase5 = highLightTerm3.toLowerCase(locale);
                    sq8.m48648g(lowerCase5, "toLowerCase(...)");
                    int iB0 = f9g.b0(lowerCase4, lowerCase5, 0, false, 6, null);
                    String lowerCase6 = activities.getTitle().toLowerCase(locale);
                    sq8.m48648g(lowerCase6, "toLowerCase(...)");
                    String highLightTerm4 = activities.getHighLightTerm();
                    sq8.m48646e(highLightTerm4);
                    int iB02 = f9g.b0(lowerCase6, highLightTerm4, 0, false, 6, null);
                    String highLightTerm5 = activities.getHighLightTerm();
                    sq8.m48646e(highLightTerm5);
                    try {
                        spannableString.setSpan(foregroundColorSpan, iB0, iB02 + highLightTerm5.length(), 33);
                        textView.setText(spannableString);
                        return;
                    } catch (IndexOutOfBoundsException unused) {
                        System.out.println((Object) ("'" + activities.getHighLightTerm() + "' was not not found in TextView text"));
                        return;
                    }
                }
            }
        }
        if (textView == null || activities == null || f9g.d0(activities.getTitle())) {
            return;
        }
        String lowerCase7 = activities.getTitle().toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase7, "toLowerCase(...)");
        String strM49850b = th1.m49850b(lowerCase7);
        String activityType = activities.getActivityType();
        switch (activityType.hashCode()) {
            case -1614872255:
                if (activityType.equals("TASK_COMPLETED_EXPIRY")) {
                    strM49850b = "⌛ " + strM49850b;
                    break;
                }
                break;
            case 745830901:
                if (activityType.equals("DEAL_CREATED")) {
                    strM49850b = "😀 " + strM49850b;
                    break;
                }
                break;
            case 776966170:
                if (activityType.equals("PAYMENT_RECEIVED")) {
                    strM49850b = "🎉 " + strM49850b;
                    break;
                }
                break;
            case 920632725:
                if (activityType.equals("TASK_COMPLETED_SUCCESS")) {
                    strM49850b = "👍 " + strM49850b;
                    break;
                }
                break;
            case 1294229027:
                if (activityType.equals("DEAL_WON")) {
                    strM49850b = "🎉 " + strM49850b;
                    break;
                }
                break;
            case 1466066711:
                if (activityType.equals("DEAL_LOST")) {
                    strM49850b = "🙁 " + strM49850b;
                    break;
                }
                break;
            case 1701228316:
                if (activityType.equals("TASK_COMPLETED_FAILURE")) {
                    strM49850b = "👎 " + strM49850b;
                    break;
                }
                break;
        }
        textView.setText(strM49850b);
    }

    public static final void o2(LinearLayout linearLayout, FileData fileData) {
        if (linearLayout != null && fileData != null) {
            if (fileData.getUploadedUri().length() > 0) {
                linearLayout.setVisibility(0);
                return;
            }
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(4);
        }
    }

    public static final void o3(LinearLayout linearLayout, Tasks tasks) {
        sq8.m48649h(linearLayout, "view");
        if (tasks != null) {
            int i = u6e.backgroundTasks20;
            if (sq8.m48644c(tasks.getTaskStatus(), "COMPLETED")) {
                String taskCompletionType = tasks.getTaskCompletionType();
                Locale locale = Locale.getDefault();
                sq8.m48648g(locale, "getDefault(...)");
                String lowerCase = taskCompletionType.toLowerCase(locale);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
                i = sq8.m48644c(lowerCase, "failure") ? u6e.superfone_purple_10 : u6e.backgroundTasks20;
            } else {
                long jM16664s = a81.m16664s();
                long jM16660o = a81.m16660o();
                long taskDateTimeInMillis = tasks.getTaskDateTimeInMillis();
                boolean z = false;
                if (jM16664s <= taskDateTimeInMillis && taskDateTimeInMillis <= jM16660o) {
                    z = true;
                }
                if (z && tasks.getNextFollowUpOn() != null) {
                    i = u6e.backgroundVisits20;
                }
            }
            linearLayout.setBackgroundColor(c64.getColor(linearLayout.getContext(), i));
        }
    }

    /* renamed from: p */
    public static final void m40971p(final AutoCompleteTextView autoCompleteTextView, AutoCompleteListModel autoCompleteListModel, final ck6 ck6Var) {
        if (autoCompleteTextView == null || autoCompleteListModel == null || !(!autoCompleteListModel.getTeamList().isEmpty())) {
            if (autoCompleteTextView == null) {
                return;
            }
            autoCompleteTextView.setVisibility(8);
        } else {
            final ArrayList<String> teamList = autoCompleteListModel.getTeamList();
            autoCompleteTextView.setAdapter(new ArrayAdapter(autoCompleteTextView.getContext(), R.layout.simple_dropdown_item_1line, kh3.Q0(teamList)));
            autoCompleteTextView.setText(autoCompleteListModel.getSelectedTeam());
            autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.jr1
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    nr1.m40972q(autoCompleteTextView, ck6Var, teamList, adapterView, view, i, j);
                }
            });
            autoCompleteTextView.setVisibility(0);
        }
    }

    public static final void p0(TextView textView, LeadsDeal leadsDeal) {
        if (textView != null) {
            if (leadsDeal != null) {
                String dealLostReason = leadsDeal.getDealLostReason();
                if (!(dealLostReason == null || dealLostReason.length() == 0)) {
                    String dealLostReason2 = leadsDeal.getDealLostReason();
                    sq8.m48646e(dealLostReason2);
                    textView.setText(dealLostReason2);
                    return;
                }
            }
            if (leadsDeal != null) {
                String lastActivity = leadsDeal.getLastActivity();
                if (!(lastActivity == null || lastActivity.length() == 0)) {
                    String lastActivity2 = leadsDeal.getLastActivity();
                    sq8.m48646e(lastActivity2);
                    textView.setText(lastActivity2);
                    return;
                }
            }
            textView.setText(" ");
        }
    }

    public static final void p1(TextView textView, Activities activities) {
        jta jtaVarM38992b;
        mge mgeVar = new mge("(\\d{4}-\\d{2}-\\d{2})[A-Z]+(\\d{2}:\\d{2}:\\d{2}).([0-9+-:]+)[Z]");
        mge mgeVar2 = new mge("\\d{2}:\\d{2}:\\d{2}");
        if (textView == null || activities == null || f9g.d0(activities.getContent())) {
            return;
        }
        if (mgeVar.m38991a(activities.getContent()) && (jtaVarM38992b = mgeVar.m38992b(activities.getContent(), 0)) != null) {
            TemporalAccessor temporalAccessor = DateTimeFormatter.ISO_INSTANT.parse(jtaVarM38992b.getValue());
            sq8.m48648g(temporalAccessor, "parse(...)");
            Instant instantFrom = Instant.from(temporalAccessor);
            sq8.m48648g(instantFrom, "from(...)");
            String str = f37184a.format(instantFrom);
            String content = activities.getContent();
            sq8.m48646e(str);
            activities.setContent(mgeVar.m38996h(content, str));
        }
        String highLightTerm = activities.getHighLightTerm();
        if (!(highLightTerm == null || f9g.d0(highLightTerm))) {
            String content2 = activities.getContent();
            Locale locale = Locale.ROOT;
            String lowerCase = content2.toLowerCase(locale);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            String highLightTerm2 = activities.getHighLightTerm();
            sq8.m48646e(highLightTerm2);
            String lowerCase2 = highLightTerm2.toLowerCase(locale);
            sq8.m48648g(lowerCase2, "toLowerCase(...)");
            if (f9g.m26306P(lowerCase, lowerCase2, false, 2, null)) {
                String lowerCase3 = activities.getContent().toLowerCase(locale);
                sq8.m48648g(lowerCase3, "toLowerCase(...)");
                SpannableString spannableString = new SpannableString(th1.m49850b(lowerCase3));
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-16776961);
                String lowerCase4 = activities.getContent().toLowerCase(locale);
                sq8.m48648g(lowerCase4, "toLowerCase(...)");
                String highLightTerm3 = activities.getHighLightTerm();
                sq8.m48646e(highLightTerm3);
                String lowerCase5 = highLightTerm3.toLowerCase(locale);
                sq8.m48648g(lowerCase5, "toLowerCase(...)");
                int iB0 = f9g.b0(lowerCase4, lowerCase5, 0, false, 6, null);
                String lowerCase6 = activities.getContent().toLowerCase(locale);
                sq8.m48648g(lowerCase6, "toLowerCase(...)");
                String highLightTerm4 = activities.getHighLightTerm();
                sq8.m48646e(highLightTerm4);
                int iB02 = f9g.b0(lowerCase6, highLightTerm4, 0, false, 6, null);
                String highLightTerm5 = activities.getHighLightTerm();
                sq8.m48646e(highLightTerm5);
                try {
                    spannableString.setSpan(foregroundColorSpan, iB0, iB02 + highLightTerm5.length(), 33);
                    textView.setText(spannableString);
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    System.out.println((Object) ("'" + activities.getHighLightTerm() + "' was not not found in TextView text"));
                    return;
                }
            }
        }
        CharSequence content3 = activities.getContent();
        if (!mgeVar2.m38991a(content3)) {
            textView.setText(content3);
            return;
        }
        SpannableString spannableString2 = new SpannableString(content3);
        jta jtaVarM38989c = mge.m38989c(mgeVar2, content3, 0, 2, null);
        if (jtaVarM38989c == null) {
            textView.setText(content3);
            return;
        }
        int iM32260e = jtaVarM38989c.getRange().m32260e();
        int iM32261j = jtaVarM38989c.getRange().m32261j() + 1;
        String value = jtaVarM38989c.getValue();
        try {
            spannableString2.setSpan(new StyleSpan(0), iM32260e, iM32261j, 33);
            spannableString2.setSpan(sq8.m48644c(value, "00:00:00") ? new ForegroundColorSpan(c64.getColor(textView.getContext(), u6e.colorOnSurface)) : new ForegroundColorSpan(c64.getColor(textView.getContext(), u6e.superfone_green)), iM32260e, iM32261j, 33);
            textView.setText(spannableString2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println((Object) ("Error applying spans: " + e.getMessage()));
            textView.setText(content3);
        }
    }

    public static final void p2(LinearLayout linearLayout, Template template) {
        if (linearLayout == null || template == null) {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        if (!(template.getFileUrl().length() > 0)) {
            linearLayout.setVisibility(8);
        } else if (gp0.m29251R(new String[]{"jpg", "png", "gif", "jpeg", "webp", "image/gif", "image/jpg", "image/png", "image/jpeg", "image/webp"}, template.getFileMimeType()) || e9g.m24597K(template.getFileMimeType(), "audio", false, 2, null)) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p3(ImageView imageView, String str) {
        int i;
        if (imageView == null || str == null) {
            return;
        }
        String upperCase = f9g.Z0(str).toString().toUpperCase(Locale.ROOT);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case 2060894:
                if (!upperCase.equals("CALL")) {
                    i = w7e.ic_round_task;
                    break;
                } else {
                    i = w7e.ic_round_call;
                    break;
                }
            case 2402290:
                if (upperCase.equals("NOTE")) {
                    i = w7e.ic_round_assigned;
                    break;
                }
                break;
            case 2567557:
                if (upperCase.equals("TASK")) {
                    i = w7e.ic_round_task;
                    break;
                }
                break;
            case 81679659:
                if (upperCase.equals("VISIT")) {
                    i = w7e.ic_round_visit;
                    break;
                }
                break;
        }
        imageView.setImageResource(i);
    }

    /* renamed from: q */
    public static final void m40972q(AutoCompleteTextView autoCompleteTextView, ck6 ck6Var, ArrayList arrayList, AdapterView adapterView, View view, int i, long j) {
        sq8.m48649h(arrayList, "$data");
        autoCompleteTextView.getLayoutParams().width = -2;
        autoCompleteTextView.setMinWidth(0);
        autoCompleteTextView.setMinimumWidth(0);
        autoCompleteTextView.requestLayout();
        autoCompleteTextView.requestApplyInsets();
        if (ck6Var != null) {
            ck6Var.mo708b(autoCompleteTextView, i, arrayList.get(i));
        }
    }

    public static final void q0(TextView textView, Tasks tasks) {
        sq8.m48649h(tasks, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (textView != null) {
            String clientDesignation = tasks.getClientDesignation();
            if (!(clientDesignation == null || clientDesignation.length() == 0)) {
                String clientCompany = tasks.getClientCompany();
                if (!(clientCompany == null || clientCompany.length() == 0)) {
                    textView.setText(tasks.getClientDesignation() + " at " + tasks.getClientCompany());
                    return;
                }
            }
            String clientDesignation2 = tasks.getClientDesignation();
            if (!(clientDesignation2 == null || clientDesignation2.length() == 0)) {
                textView.setText(tasks.getClientDesignation());
                return;
            }
            String clientCompany2 = tasks.getClientCompany();
            if (clientCompany2 == null || clientCompany2.length() == 0) {
                return;
            }
            textView.setText(tasks.getClientCompany());
        }
    }

    public static final void q1(TextView textView, Long l) {
        if (textView != null && l != null && l.longValue() > 0) {
            textView.setText("Assigned : " + jm7.m34024J(l.longValue(), textView));
            return;
        }
        if (textView != null) {
            if (l == null || l.longValue() < 0) {
                textView.setText("Unassigned");
            }
        }
    }

    public static final void q2(ImageView imageView, String str) {
        if (imageView == null || str == null) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(4);
            return;
        }
        int i = w7e.ic_file_open;
        if (gp0.m29251R(new String[]{"jpg", "png", "gif", "jpeg", "webp", "image/gif", "image/jpg", "image/png", "image/jpeg", "image/webp"}, str)) {
            i = w7e.ic_image;
        } else if (e9g.m24595I(str, "video", true)) {
            i = w7e.ic_video;
        } else if (f9g.m26306P(str, "spreadsheetml", false, 2, null) || f9g.m26306P(str, ".ms-excel", false, 2, null)) {
            i = w7e.ic_excel;
        } else if (f9g.m26306P(str, "csv", false, 2, null)) {
            i = w7e.ic_csv;
        } else if (f9g.m26306P(str, "pdf", false, 2, null)) {
            i = w7e.ic_pdf;
        }
        imageView.setImageResource(i);
        imageView.setVisibility(0);
    }

    /* renamed from: r */
    public static final void m40973r(final AutoCompleteTextView autoCompleteTextView, AutoCompleteListModel autoCompleteListModel, final ck6 ck6Var) {
        if (autoCompleteTextView == null || autoCompleteListModel == null || !(!autoCompleteListModel.getTeamList().isEmpty())) {
            if (autoCompleteTextView == null) {
                return;
            }
            autoCompleteTextView.setVisibility(8);
            return;
        }
        final ArrayList<String> teamList = autoCompleteListModel.getTeamList();
        Context context = autoCompleteTextView.getContext();
        sq8.m48648g(context, "getContext(...)");
        autoCompleteTextView.setAdapter(new C2674b(context, R.layout.simple_spinner_dropdown_item, kh3.Q0(teamList).toArray(new String[0])));
        final gge ggeVar = new gge();
        String selectedTeam = autoCompleteListModel.getSelectedTeam();
        ggeVar.f25106a = selectedTeam;
        if (selectedTeam.length() == 0) {
            String str = teamList.get(0);
            sq8.m48648g(str, "get(...)");
            ggeVar.f25106a = str;
        }
        autoCompleteTextView.postDelayed(new Runnable() { // from class: o.kr1
            @Override // java.lang.Runnable
            public final void run() {
                nr1.m40974s(autoCompleteTextView, ggeVar);
            }
        }, 10L);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.lr1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                nr1.m40975t(autoCompleteTextView, ck6Var, teamList, adapterView, view, i, j);
            }
        });
        if (teamList.size() > 1) {
            autoCompleteTextView.setVisibility(0);
        } else {
            autoCompleteTextView.setVisibility(8);
        }
    }

    public static final void r0(TextView textView, mii miiVar) {
        int color;
        if (textView == null || miiVar == null) {
            return;
        }
        c64.getColor(textView.getContext(), u6e.superfone_black_70);
        if (miiVar.m39176z(textView.getContext())) {
            textView.setText("Device Registered");
            color = c64.getColor(textView.getContext(), u6e.superfone_green);
        } else {
            textView.setText("Device Not Registered");
            color = c64.getColor(textView.getContext(), u6e.superfone_red);
        }
        textView.setTextColor(color);
    }

    public static final void r1(CircularProgressIndicator circularProgressIndicator, ChatChannel chatChannel) {
        if (circularProgressIndicator == null || chatChannel == null) {
            return;
        }
        if (!sq8.m48644c(chatChannel.getMessagePlatform(), "WHATSAPP")) {
            circularProgressIndicator.setVisibility(8);
            return;
        }
        if (chatChannel.getChannelWillBeChargedNext() == null) {
            circularProgressIndicator.setVisibility(8);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long channelWillBeChargedNext = chatChannel.getChannelWillBeChargedNext();
        sq8.m48646e(channelWillBeChargedNext);
        long jLongValue = (channelWillBeChargedNext.longValue() - jCurrentTimeMillis) / 864000;
        if (jLongValue > 0) {
            circularProgressIndicator.setProgress((int) jLongValue);
            circularProgressIndicator.setVisibility(0);
        } else {
            circularProgressIndicator.setProgress(0);
            circularProgressIndicator.setVisibility(8);
        }
    }

    public static final void r2(TextView textView, UserContactDetail userContactDetail) {
        String str;
        ArrayList<String> emailId;
        if (textView != null) {
            if (userContactDetail == null) {
                textView.setText(" ");
                return;
            }
            if (!userContactDetail.getPhoneNumber().isEmpty()) {
                emailId = userContactDetail.getPhoneNumber();
            } else {
                if (!(!userContactDetail.getEmailId().isEmpty())) {
                    str = "";
                    sq8.m48646e(str);
                    textView.setText(str);
                }
                emailId = userContactDetail.getEmailId();
            }
            str = emailId.get(0);
            sq8.m48646e(str);
            textView.setText(str);
        }
    }

    /* renamed from: s */
    public static final void m40974s(AutoCompleteTextView autoCompleteTextView, gge ggeVar) {
        sq8.m48649h(ggeVar, "$selectedItem");
        autoCompleteTextView.setText((CharSequence) ggeVar.f25106a, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r1.equals("option") != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (r1.equals("selection") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        r1 = r6.getPropertyDefinition();
        p001o.sq8.m48646e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
    
        if (r1.isMultiple() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        r6 = r6.getPropertyDefinition();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (r6 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        r4 = r6.getDisplayName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
    
        r5.setText(r0 + r4 + " (multiple)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d4, code lost:
    
        r6 = r6.getPropertyDefinition();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        if (r6 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        r4 = r6.getDisplayName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00de, code lost:
    
        r5.setText(r0 + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s0(MaterialTextView materialTextView, FormField formField) {
        sq8.m48649h(formField, "obj");
        if (materialTextView == null || formField.getPropertyDefinition() == null) {
            return;
        }
        PropertyDefinition propertyDefinition = formField.getPropertyDefinition();
        sq8.m48646e(propertyDefinition);
        if (propertyDefinition.getScalarType() == null) {
            return;
        }
        String str = sq8.m48644c(formField.isMandatory(), Boolean.TRUE) ? "*" : "";
        PropertyDefinition propertyDefinition2 = formField.getPropertyDefinition();
        sq8.m48646e(propertyDefinition2);
        String lowerCase = propertyDefinition2.getScalarType().toLowerCase();
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != -1715965556) {
            if (iHashCode != -1010136971) {
                if (iHashCode == 1793702779 && lowerCase.equals("datetime")) {
                    PropertyDefinition propertyDefinition3 = formField.getPropertyDefinition();
                    materialTextView.setText(str + "Select Date/Time For " + (propertyDefinition3 != null ? propertyDefinition3.getDisplayName() : null));
                    return;
                }
            }
            materialTextView.setText(str + "Select Applicable Option");
        }
    }

    public static final void s1(TextView textView, Date date) throws Resources.NotFoundException {
        String str;
        int color;
        if (textView == null || date == null) {
            return;
        }
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(ZoneId.systemDefault());
        ZonedDateTime zonedDateTimeAtZone = DesugarDate.toInstant(date).atZone(ZoneId.systemDefault());
        long jBetween = ChronoUnit.DAYS.between(zonedDateTimeNow.toLocalDate(), zonedDateTimeAtZone.toLocalDate());
        long jBetween2 = ChronoUnit.HOURS.between(zonedDateTimeNow, zonedDateTimeAtZone);
        String str2 = DateTimeFormatter.ofPattern("dd-MMM hh:mm a").format(zonedDateTimeAtZone);
        if (0 <= jBetween2 && jBetween2 < 24) {
            str = "In " + jBetween2 + "H";
        } else {
            if (-23 <= jBetween2 && jBetween2 < 0) {
                str = (-jBetween2) + "H ago";
            } else if (jBetween > 0) {
                str = "In " + jBetween + " D";
            } else if (jBetween < 0) {
                str = (-jBetween) + " D ago";
            } else {
                str = "Today";
            }
        }
        textView.setText(str + " • " + str2);
        if (jBetween < 0) {
            color = c64.getColor(textView.getContext(), u6e.superfone_red);
        } else {
            TypedValue typedValue = new TypedValue();
            textView.getContext().getTheme().resolveAttribute(i6e.colorOnSurface, typedValue, true);
            color = typedValue.data;
        }
        textView.setTextColor(color);
        Drawable drawable = c64.getDrawable(textView.getContext(), w7e.ic_bell_icon);
        if (drawable != null) {
            drawable.setTint(color);
            int dimensionPixelSize = textView.getContext().getResources().getDimensionPixelSize(k7e.grid_2);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        } else {
            drawable = null;
        }
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    public static final void s2(TextView textView, Long l) {
        if (textView == null || l == null || l.longValue() <= 0) {
            return;
        }
        textView.setText(jm7.m34024J(l.longValue(), textView));
    }

    /* renamed from: t */
    public static final void m40975t(AutoCompleteTextView autoCompleteTextView, ck6 ck6Var, ArrayList arrayList, AdapterView adapterView, View view, int i, long j) {
        sq8.m48649h(arrayList, "$data");
        autoCompleteTextView.getLayoutParams().width = -2;
        autoCompleteTextView.setMinWidth(0);
        autoCompleteTextView.setMinimumWidth(0);
        autoCompleteTextView.requestLayout();
        autoCompleteTextView.requestApplyInsets();
        if (ck6Var != null) {
            ck6Var.mo708b(autoCompleteTextView, i, arrayList.get(i));
        }
    }

    public static final void t0(TextInputLayout textInputLayout, FormField formField) {
        String str;
        sq8.m48649h(formField, "obj");
        if (textInputLayout == null || formField.getPropertyDefinition() == null) {
            return;
        }
        boolean z = true;
        if (sq8.m48644c(formField.isMandatory(), Boolean.TRUE)) {
            textInputLayout.setHelperTextEnabled(true);
            textInputLayout.setHelperText("Mandatory Field");
            textInputLayout.setHelperTextColor(ColorStateList.valueOf(c64.getColor(textInputLayout.getContext(), u6e.superfone_red)));
            str = "*";
        } else {
            str = "";
        }
        String hintText = formField.getHintText();
        if (hintText != null && hintText.length() != 0) {
            z = false;
        }
        if (!z && !sq8.m48644c(formField.getHintText(), "false")) {
            String hintText2 = formField.getHintText();
            sq8.m48646e(hintText2);
            String lowerCase = hintText2.toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            if (!sq8.m48644c(lowerCase, "enter hint text")) {
                textInputLayout.setHint(str + formField.getHintText());
                return;
            }
        }
        PropertyDefinition propertyDefinition = formField.getPropertyDefinition();
        sq8.m48646e(propertyDefinition);
        textInputLayout.setHint(str + propertyDefinition.getDisplayName());
    }

    public static final void t1(ImageView imageView, Activities activities) {
        if (imageView == null || activities == null) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
        } else if (sq8.m48644c(activities.getActivityType(), "PAYMENT_RECEIVED")) {
            pu5.m44193b().m44197e(imageView, "45882e72-e4e9-476c-b762-f5baa14aa2c5/a60827a7-1d6f-47dc-bce6-2a6d9b2f0e94/1719908528456-payment.jpg");
            imageView.setVisibility(0);
        } else if (!sq8.m48644c(activities.getActivityType(), "DEAL_WON")) {
            imageView.setVisibility(8);
        } else {
            pu5.m44193b().m44197e(imageView, "45882e72-e4e9-476c-b762-f5baa14aa2c5/ca6c380d-15df-496c-8681-7cfef55c353e/1741432078498-deal_win_resized.jpg");
            imageView.setVisibility(0);
        }
    }

    public static final void t2(TextView textView, String str) {
        if (textView == null || str == null || !(!f9g.d0(str)) || sq8.m48644c(str, "0") || sq8.m48644c(str, "-1")) {
            return;
        }
        textView.setText(jm7.m34024J(Long.parseLong(str), textView));
    }

    /* renamed from: u */
    public static final Object m40976u(AutoCompleteTextView autoCompleteTextView, TemplateVariable templateVariable, ck6 ck6Var) {
        if (autoCompleteTextView == null || templateVariable == null || !(!templateVariable.getVariableMap().isEmpty())) {
            if (autoCompleteTextView != null) {
                autoCompleteTextView.setVisibility(8);
            }
            return y3i.f54824a;
        }
        su5 su5VarW0 = templateVariable.getAllVariableEntries().w0(new C15630b(autoCompleteTextView, templateVariable, ck6Var), C15631c.f37189a, new jm() { // from class: o.ir1
            @Override // p001o.jm
            public final void run() {
                nr1.m40977v();
            }
        });
        sq8.m48646e(su5VarW0);
        return su5VarW0;
    }

    public static final void u0(TextView textView, Leads leads) {
        if (textView != null) {
            int color = c64.getColor(textView.getContext(), u6e.superfone_black_70);
            if (leads != null) {
                if (leads.getLeadLifecycleStage() != null) {
                    if (sq8.m48644c(leads.getLeadLifecycleStage(), "UNCONTACTED_NEW") || sq8.m48644c(leads.getLeadLifecycleStage(), "UNCONTACTED_RECHURNED")) {
                        String leadLifecycleStageViewValue = leads.getLeadLifecycleStageViewValue();
                        textView.setText(leadLifecycleStageViewValue != null ? new mge("(?i)\\s*lead\\s*").m38996h(leadLifecycleStageViewValue, "") : null);
                        color = c64.getColor(textView.getContext(), u6e.superfone_blue);
                    } else if (sq8.m48644c(leads.getLeadLifecycleStage(), "PROSPECTING")) {
                        String leadLifecycleStageViewValue2 = leads.getLeadLifecycleStageViewValue();
                        textView.setText(leadLifecycleStageViewValue2 != null ? new mge("(?i)\\s*lead\\s*").m38996h(leadLifecycleStageViewValue2, "") : null);
                        color = c64.getColor(textView.getContext(), u6e.superfone_msg_read);
                    } else if (sq8.m48644c(leads.getLeadLifecycleStage(), "OPPORTUNITY")) {
                        String leadLifecycleStageViewValue3 = leads.getLeadLifecycleStageViewValue();
                        textView.setText(leadLifecycleStageViewValue3 != null ? new mge("(?i)\\s*lead\\s*").m38996h(leadLifecycleStageViewValue3, "") : null);
                        color = c64.getColor(textView.getContext(), u6e.superfone_purple);
                    } else if (!sq8.m48644c(leads.getLeadLifecycleStage(), "CLOSED")) {
                        textView.setText(" ");
                    } else if (leads.getLeadLifecycleStageSubCategory() == null) {
                        String leadLifecycleStageViewValue4 = leads.getLeadLifecycleStageViewValue();
                        textView.setText(leadLifecycleStageViewValue4 != null ? new mge("(?i)\\s*lead\\s*").m38996h(leadLifecycleStageViewValue4, "") : null);
                        color = c64.getColor(textView.getContext(), u6e.superfone_red);
                    } else if (sq8.m48644c(leads.getLeadLifecycleStageSubCategory(), "OPPORTUNITY_WON")) {
                        textView.setText("Customer");
                        color = c64.getColor(textView.getContext(), u6e.superfone_green);
                    } else if (sq8.m48644c(leads.getLeadLifecycleStageSubCategory(), "OPPORTUNITY_LOST")) {
                        textView.setText("Lost");
                        color = c64.getColor(textView.getContext(), u6e.superfone_red);
                    } else {
                        String leadLifecycleStageViewValue5 = leads.getLeadLifecycleStageViewValue();
                        textView.setText(leadLifecycleStageViewValue5 != null ? new mge("(?i)\\s*lead\\s*").m38996h(leadLifecycleStageViewValue5, "") : null);
                        color = c64.getColor(textView.getContext(), u6e.superfone_red);
                    }
                } else if (leads.getFreshLeadTag() == null) {
                    textView.setText(" ");
                } else if (leads.isCustomer() != null) {
                    textView.setText("Customer");
                    color = c64.getColor(textView.getContext(), u6e.superfone_green);
                } else if (leads.getLastLeadAssignmentDateTimeInMillis() == -1) {
                    textView.setText("Unassigned");
                    color = c64.getColor(textView.getContext(), u6e.superfone_blue);
                } else {
                    textView.setText(" ");
                }
                textView.setBackgroundTintList(ColorStateList.valueOf(color));
            } else {
                textView.setText(" ");
                textView.setBackgroundTintList(ColorStateList.valueOf(color));
            }
            if (sq8.m48644c(textView.getText(), " ")) {
                textView.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void u1(TextView textView, PaymentDetail paymentDetail) {
        if (textView == null || paymentDetail == null) {
            if (textView != null) {
                textView.setText("--");
                return;
            }
            return;
        }
        if (paymentDetail.getAmount() != null) {
            Integer amount = paymentDetail.getAmount();
            sq8.m48646e(amount);
            if (amount.intValue() <= 0) {
                textView.setText("Payment Requested");
            } else if (sq8.m48644c(paymentDetail.getStatus(), "created")) {
                String currency = paymentDetail.getCurrency();
                Integer amount2 = paymentDetail.getAmount();
                sq8.m48646e(amount2);
                textView.setText("Payment Requested : " + currency + " " + (amount2.intValue() / 100));
            } else if (sq8.m48644c(paymentDetail.getStatus(), "cancelled")) {
                String currency2 = paymentDetail.getCurrency();
                Integer amount3 = paymentDetail.getAmount();
                sq8.m48646e(amount3);
                textView.setText("Payment Cancelled : " + currency2 + " " + (amount3.intValue() / 100));
            } else if (sq8.m48644c(paymentDetail.getStatus(), "paid")) {
                String currency3 = paymentDetail.getCurrency();
                Integer amount4 = paymentDetail.getAmount();
                sq8.m48646e(amount4);
                textView.setText("Payment Received : " + currency3 + " " + (amount4.intValue() / 100));
            } else if (sq8.m48644c(paymentDetail.getStatus(), "cancelled")) {
                String currency4 = paymentDetail.getCurrency();
                Integer amount5 = paymentDetail.getAmount();
                sq8.m48646e(amount5);
                textView.setText("Payment Partially Paid : " + currency4 + " " + (amount5.intValue() / 100));
            }
        }
        textView.setVisibility(0);
    }

    public static final void u2(TextView textView, ArrayList arrayList) {
        if (textView == null || arrayList == null || !(!arrayList.isEmpty())) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        } else {
            if (arrayList.size() > 1) {
                gh3.m28657z(arrayList, new C15634f());
            }
            textView.setText(jm7.m34024J(Long.parseLong(((CallLogs) arrayList.get(0)).getCallDate()), textView));
            textView.setVisibility(0);
        }
    }

    /* renamed from: v */
    public static final void m40977v() {
    }

    public static final void v0(Chip chip, String str) {
        if (chip != null) {
            if (str != null) {
                if (str.length() > 0) {
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    sq8.m48648g(lowerCase, "toLowerCase(...)");
                    chip.setText(th1.m49850b(th1.m49854f(lowerCase)));
                    chip.setVisibility(0);
                    return;
                }
            }
            chip.setText("");
            chip.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void v1(TextView textView, PaymentDataInfo paymentDataInfo) {
        if (textView == null || paymentDataInfo == null) {
            if (textView != null) {
                textView.setText("--");
                return;
            }
            return;
        }
        if (paymentDataInfo.getAmount() != null) {
            Integer amount = paymentDataInfo.getAmount();
            sq8.m48646e(amount);
            if (amount.intValue() <= 0) {
                textView.setText("Payment Recorded");
            } else if (sq8.m48644c(paymentDataInfo.getStatus(), "created")) {
                String currency = paymentDataInfo.getCurrency();
                Integer amount2 = paymentDataInfo.getAmount();
                sq8.m48646e(amount2);
                textView.setText("Payment Requested : " + currency + " " + (amount2.intValue() / 100));
            } else if (sq8.m48644c(paymentDataInfo.getStatus(), "cancelled")) {
                String currency2 = paymentDataInfo.getCurrency();
                Integer amount3 = paymentDataInfo.getAmount();
                sq8.m48646e(amount3);
                textView.setText("Payment Cancelled : " + currency2 + " " + (amount3.intValue() / 100));
            } else if (sq8.m48644c(paymentDataInfo.getStatus(), "paid")) {
                String currency3 = paymentDataInfo.getCurrency();
                Integer amount4 = paymentDataInfo.getAmount();
                sq8.m48646e(amount4);
                textView.setText("Payment Received : " + currency3 + " " + (amount4.intValue() / 100));
            } else if (sq8.m48644c(paymentDataInfo.getStatus(), "partial_paid")) {
                String currency4 = paymentDataInfo.getCurrency();
                Integer amountPaid = paymentDataInfo.getAmountPaid();
                int iIntValue = amountPaid != null ? amountPaid.intValue() : 0;
                Integer amount5 = paymentDataInfo.getAmount();
                sq8.m48646e(amount5);
                textView.setText("Payment Partially Paid : " + currency4 + " " + (iIntValue / 100) + "/" + (amount5.intValue() / 100));
            }
        }
        textView.setVisibility(0);
    }

    public static final void v2(ShapeableImageView shapeableImageView, ArrayList arrayList) throws NumberFormatException {
        int i = w7e.ic_call_in;
        if (shapeableImageView != null && arrayList != null && (!arrayList.isEmpty())) {
            if (arrayList.size() > 1) {
                gh3.m28657z(arrayList, new C15633e());
            }
            Object obj = arrayList.get(0);
            sq8.m48648g(obj, "get(...)");
            int i2 = Integer.parseInt(((CallLogs) obj).getCallType());
            int i3 = i2 != 1 ? i2 != 2 ? i2 != 3 ? w7e.ic_call_missed : w7e.ic_home_calls_missed : w7e.ic_call_out : w7e.ic_call_in;
            shapeableImageView.setVisibility(0);
            i = i3;
        } else if (shapeableImageView != null) {
            shapeableImageView.setVisibility(4);
        }
        if (shapeableImageView != null) {
            shapeableImageView.setImageResource(i);
        }
    }

    /* renamed from: w */
    public static final void m40978w(View view, Integer num) {
        if (view == null || num == null) {
            return;
        }
        view.setBackgroundTintList(ColorStateList.valueOf(c64.getColor(view.getContext(), num.intValue())));
    }

    public static final void w0(ImageView imageView, Drawable drawable) {
        if (imageView != null && drawable != null) {
            ws7.m54949a(imageView.getContext()).m21755F(drawable).N0(ny5.m41226j()).A0(imageView);
        } else if (imageView != null) {
            ws7.m54949a(imageView.getContext()).m21757H(Integer.valueOf(w7e.ic_empty)).Q0().N0(ny5.m41226j()).A0(imageView);
        }
    }

    public static final void w1(MaterialCardView materialCardView, String str) {
        if (materialCardView == null || str == null) {
            return;
        }
        int i = u6e.superfone_purple_10;
        int iHashCode = str.hashCode();
        if (iHashCode != 3433164) {
            if (iHashCode != 476588369) {
                if (iHashCode == 1028554472 && str.equals("created")) {
                    i = u6e.superfone_blue_10;
                }
            } else if (str.equals("cancelled")) {
                i = u6e.superfone_purple_10;
            }
        } else if (str.equals("paid")) {
            i = u6e.superfone_green_30;
        }
        materialCardView.setCardBackgroundColor(c64.getColor(materialCardView.getContext(), i));
    }

    public static final void w2(Chip chip, String str) {
        if (chip != null) {
            if (str != null) {
                if (str.length() > 0) {
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    sq8.m48648g(lowerCase, "toLowerCase(...)");
                    chip.setText(th1.m49850b(th1.m49854f(lowerCase)));
                    return;
                }
            }
            chip.setText("Uncategorized");
        }
    }

    /* renamed from: x */
    public static final void m40979x(LinearProgressIndicator linearProgressIndicator, Integer num) {
        if (linearProgressIndicator == null || num == null) {
            return;
        }
        linearProgressIndicator.setIndicatorColor(c64.getColor(linearProgressIndicator.getContext(), num.intValue()));
    }

    public static final void x0(ViewProfileData viewProfileData, List list) {
        if (viewProfileData == null || list == null || !(!list.isEmpty())) {
            return;
        }
        viewProfileData.setViewProfileDataValue((String) list.get(0));
    }

    public static final void x1(MaterialCardView materialCardView, Date date) {
        if (materialCardView != null && date != null) {
            materialCardView.setCardBackgroundColor(ChronoUnit.DAYS.between(LocalDate.now(), DesugarDate.toInstant(date).atZone(ZoneId.systemDefault()).toLocalDate()) < 0 ? c64.getColor(materialCardView.getContext(), u6e.superfone_purple_10) : c64.getColor(materialCardView.getContext(), u6e.colorBackground));
        } else if (materialCardView != null) {
            materialCardView.setCardBackgroundColor(c64.getColor(materialCardView.getContext(), u6e.colorBackground));
        }
    }

    public static final void x2(ImageView imageView, ChatMessages chatMessages) {
        if (imageView == null || chatMessages == null) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        if (chatMessages.getMessageFile() != null) {
            FileData messageFile = chatMessages.getMessageFile();
            sq8.m48646e(messageFile);
            if (messageFile.getThumbNailUri().length() > 0) {
                imageView.setVisibility(0);
                pu5 pu5VarM44193b = pu5.m44193b();
                FileData messageFile2 = chatMessages.getMessageFile();
                sq8.m48646e(messageFile2);
                pu5VarM44193b.m44197e(imageView, messageFile2.getThumbNailUri());
                return;
            }
        }
        if (chatMessages.getPdfThumbnailBitmap() != null) {
            imageView.setVisibility(0);
            imageView.setImageBitmap(chatMessages.getPdfThumbnailBitmap());
            return;
        }
        if (chatMessages.getMessageFile() != null) {
            FileData messageFile3 = chatMessages.getMessageFile();
            sq8.m48646e(messageFile3);
            if (e9g.m24597K(messageFile3.getMimeType(), "video", false, 2, null)) {
                imageView.setVisibility(0);
                pu5 pu5VarM44193b2 = pu5.m44193b();
                FileData messageFile4 = chatMessages.getMessageFile();
                sq8.m48646e(messageFile4);
                pu5VarM44193b2.m44197e(imageView, messageFile4.getUploadedUri());
                return;
            }
        }
        imageView.setVisibility(8);
    }

    /* renamed from: y */
    public static final void m40980y(MaterialButton materialButton, Integer num) {
        if (materialButton == null || num == null) {
            return;
        }
        materialButton.setIcon(c64.getDrawable(materialButton.getContext(), num.intValue()));
    }

    public static final void y0(MaterialButton materialButton, WhatsAppTemplates whatsAppTemplates) {
        String upperCase;
        Object next;
        TemplateComponent templateComponent;
        WaBody waBody;
        Object next2;
        TemplateComponent templateComponent2;
        WaHeader waHeader;
        TemplateComponent templateComponent3;
        WaHeader waHeader2;
        String waFormat;
        if (materialButton == null || whatsAppTemplates == null) {
            return;
        }
        materialButton.setEnabled(true);
        List<TemplateComponent> components = whatsAppTemplates.getComponents();
        if (components == null || (templateComponent3 = (TemplateComponent) kh3.h0(components)) == null || (waHeader2 = templateComponent3.getWaHeader()) == null || (waFormat = waHeader2.getWaFormat()) == null) {
            upperCase = null;
        } else {
            Locale locale = Locale.getDefault();
            sq8.m48648g(locale, "getDefault(...)");
            upperCase = waFormat.toUpperCase(locale);
            sq8.m48648g(upperCase, "toUpperCase(...)");
        }
        if (upperCase == null) {
            upperCase = "";
        }
        if (whatsAppTemplates.getDefaultMedia() == null && (sq8.m48644c(upperCase, "IMAGE") || sq8.m48644c(upperCase, "VIDEO") || sq8.m48644c(upperCase, "DOCUMENT"))) {
            materialButton.setEnabled(false);
        }
        if (whatsAppTemplates.getComponents() != null) {
            List<TemplateVariable> templateVariables = whatsAppTemplates.getTemplateVariables();
            List<TemplateComponent> components2 = whatsAppTemplates.getComponents();
            String waText = (components2 == null || (templateComponent2 = (TemplateComponent) kh3.h0(components2)) == null || (waHeader = templateComponent2.getWaHeader()) == null) ? null : waHeader.getWaText();
            if (waText == null) {
                waText = "";
            }
            if (waText.length() > 0) {
                List<String> listM20229i = c50.m20229i(waText);
                if (!listM20229i.isEmpty()) {
                    for (String str : listM20229i) {
                        if (!templateVariables.isEmpty()) {
                            Iterator<T> it = templateVariables.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it.next();
                                TemplateVariable templateVariable = (TemplateVariable) next2;
                                if (sq8.m48644c(templateVariable.getVariableId(), str) && sq8.m48644c(templateVariable.getTaType(), "HEADER")) {
                                    break;
                                }
                            }
                            TemplateVariable templateVariable2 = (TemplateVariable) next2;
                            if (templateVariable2 != null) {
                                if (templateVariable2.getFallBackValue().length() == 0) {
                                }
                            }
                            materialButton.setEnabled(false);
                        }
                    }
                }
            }
            List<TemplateComponent> components3 = whatsAppTemplates.getComponents();
            String waText2 = (components3 == null || (templateComponent = (TemplateComponent) kh3.h0(components3)) == null || (waBody = templateComponent.getWaBody()) == null) ? null : waBody.getWaText();
            String str2 = waText2 != null ? waText2 : "";
            if (str2.length() > 0) {
                List<String> listM20229i2 = c50.m20229i(str2);
                if (!listM20229i2.isEmpty()) {
                    for (String str3 : listM20229i2) {
                        if (!templateVariables.isEmpty()) {
                            Iterator<T> it2 = templateVariables.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                TemplateVariable templateVariable3 = (TemplateVariable) next;
                                if (sq8.m48644c(templateVariable3.getVariableId(), str3) && sq8.m48644c(templateVariable3.getTaType(), "BODY")) {
                                    break;
                                }
                            }
                            TemplateVariable templateVariable4 = (TemplateVariable) next;
                            if (templateVariable4 != null) {
                                if (templateVariable4.getFallBackValue().length() == 0) {
                                }
                            }
                            materialButton.setEnabled(false);
                        }
                    }
                }
            }
        }
    }

    public static final void y1(TextView textView, String str) {
        if (textView != null) {
            ss9 ss9VarJ0 = PropertyDefinitionRepository.o0().j0();
            String strM48863f = ss9VarJ0 != null ? ss9VarJ0.m48863f("PROSPECTING") : null;
            if (strM48863f == null) {
                strM48863f = "Prospecting";
            }
            String lowerCase = strM48863f.toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            textView.setText(th1.m49850b(lowerCase) + " Followups");
        }
    }

    public static final void y2(ImageView imageView, WhatsAppTemplates whatsAppTemplates) {
        if (imageView == null || whatsAppTemplates == null) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        if (whatsAppTemplates.getDefaultMedia() != null) {
            FileData defaultMedia = whatsAppTemplates.getDefaultMedia();
            sq8.m48646e(defaultMedia);
            if (defaultMedia.getThumbNailUri().length() > 0) {
                imageView.setVisibility(0);
                pu5 pu5VarM44193b = pu5.m44193b();
                FileData defaultMedia2 = whatsAppTemplates.getDefaultMedia();
                sq8.m48646e(defaultMedia2);
                pu5VarM44193b.m44197e(imageView, defaultMedia2.getThumbNailUri());
                return;
            }
        }
        if (whatsAppTemplates.getDefaultMedia() != null) {
            FileData defaultMedia3 = whatsAppTemplates.getDefaultMedia();
            sq8.m48646e(defaultMedia3);
            if (e9g.m24597K(defaultMedia3.getMimeType(), "video", false, 2, null)) {
                imageView.setVisibility(0);
                pu5 pu5VarM44193b2 = pu5.m44193b();
                FileData defaultMedia4 = whatsAppTemplates.getDefaultMedia();
                sq8.m48646e(defaultMedia4);
                pu5VarM44193b2.m44197e(imageView, defaultMedia4.getUploadedUri());
                return;
            }
        }
        imageView.setVisibility(8);
    }

    /* renamed from: z */
    public static final void m40981z(TextView textView, Tasks tasks) {
        if (textView != null && tasks != null && tasks.getCallStartTime() > 0) {
            textView.setText(sq8.m48644c(tasks.getCallDirection(), "INCOMING") ? "Incoming Call" : "Outgoing Call");
            textView.setVisibility(0);
        } else {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final void z0(ImageView imageView, Tasks tasks) {
        if (imageView == null || tasks == null) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        String upperCase = "";
        if (tasks.getClient() != null) {
            LeadsSummary client = tasks.getClient();
            sq8.m48646e(client);
            String contactSource = client.getContactSource();
            if (!(contactSource == null || contactSource.length() == 0)) {
                LeadsSummary client2 = tasks.getClient();
                sq8.m48646e(client2);
                String contactSource2 = client2.getContactSource();
                sq8.m48646e(contactSource2);
                Locale locale = Locale.getDefault();
                sq8.m48648g(locale, "getDefault(...)");
                String lowerCase = contactSource2.toLowerCase(locale);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
                switch (lowerCase.hashCode()) {
                    case -1918536447:
                        if (lowerCase.equals("commonfloor")) {
                            imageView.setImageResource(w7e.commonfloor);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case -1858793111:
                        if (lowerCase.equals("sulekha")) {
                            imageView.setImageResource(w7e.sulekha);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case -1647335718:
                        if (lowerCase.equals("shared_mailbox")) {
                            imageView.setImageResource(w7e.inbox);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case -1420744429:
                        if (lowerCase.equals("jotform")) {
                            imageView.setImageResource(w7e.jotform);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case -1254789861:
                        if (lowerCase.equals("urbanpro")) {
                            imageView.setImageResource(w7e.urbanpro);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case -713507699:
                        if (lowerCase.equals("indiamart")) {
                            imageView.setImageResource(w7e.indiamart);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case -178324326:
                        if (lowerCase.equals("calendly")) {
                            imageView.setImageResource(w7e.calendly);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case -79386020:
                        if (lowerCase.equals("justdial")) {
                            imageView.setImageResource(w7e.jdshort);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case 117734:
                        if (lowerCase.equals("wix")) {
                            imageView.setImageResource(w7e.wix);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case 24625183:
                        if (lowerCase.equals("cashfree")) {
                            imageView.setImageResource(w7e.cashfree);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case 28903346:
                        if (lowerCase.equals("instagram")) {
                            imageView.setImageResource(w7e.ig);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case 92576527:
                        if (lowerCase.equals("aajjo")) {
                            imageView.setImageResource(w7e.aajjo);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case 497130182:
                        if (lowerCase.equals("facebook")) {
                            imageView.setImageResource(w7e.external_logo_facebook);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case 604200602:
                        if (lowerCase.equals("razorpay")) {
                            imageView.setImageResource(w7e.razorpay_glyph);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case 1100520413:
                        if (lowerCase.equals("housing")) {
                            imageView.setImageResource(w7e.housing);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case 1223953944:
                        if (lowerCase.equals("webform")) {
                            imageView.setImageResource(w7e.webform);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case 1523815487:
                        if (lowerCase.equals("magicbricks")) {
                            imageView.setImageResource(w7e.magicbricks);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case 1884714579:
                        if (lowerCase.equals("tradeindia")) {
                            imageView.setImageResource(w7e.tradeindia);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case 1934780818:
                        if (lowerCase.equals("whatsapp")) {
                            imageView.setImageResource(w7e.wa);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case 1948103513:
                        if (lowerCase.equals("googleleadform")) {
                            imageView.setImageResource(w7e.google_ad);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                    case 2118220354:
                        if (lowerCase.equals("salesmaxapi")) {
                            imageView.setImageResource(w7e.api);
                            imageView.setVisibility(0);
                            return;
                        }
                        break;
                }
                String clientProfilePic = tasks.getClientProfilePic();
                String clientID = tasks.getClientID();
                if (tasks.getClientName().length() > 0) {
                    if (f9g.Z0(tasks.getClientName()).toString().length() > 0) {
                        String strValueOf = String.valueOf(f9g.Z0(tasks.getClientName()).toString().charAt(0));
                        sq8.m48647f(strValueOf, "null cannot be cast to non-null type java.lang.String");
                        upperCase = strValueOf.toUpperCase(Locale.ROOT);
                        sq8.m48648g(upperCase, "toUpperCase(...)");
                    }
                }
                if (!(clientProfilePic.length() == 0) && !f9g.m26306P(clientProfilePic, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null)) {
                    pu5.m44193b().m44196d(imageView, clientProfilePic);
                    return;
                }
                if (!(clientID.length() == 0)) {
                    if (!(upperCase.length() == 0)) {
                        imageView.setImageDrawable(xgh.m56281a().mo56294a(upperCase, oh3.f38348d.m42239b(clientID), 20));
                        return;
                    }
                }
                imageView.setImageResource(R.color.transparent);
                return;
            }
        }
        if (tasks.getClient() == null) {
            imageView.setVisibility(8);
            return;
        }
        String clientProfilePic2 = tasks.getClientProfilePic();
        String clientID2 = tasks.getClientID();
        if (tasks.getClientName().length() > 0) {
            if (f9g.Z0(tasks.getClientName()).toString().length() > 0) {
                String strValueOf2 = String.valueOf(f9g.Z0(tasks.getClientName()).toString().charAt(0));
                sq8.m48647f(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                upperCase = strValueOf2.toUpperCase(Locale.ROOT);
                sq8.m48648g(upperCase, "toUpperCase(...)");
            }
        }
        if (!(clientProfilePic2.length() == 0) && !f9g.m26306P(clientProfilePic2, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null)) {
            pu5.m44193b().m44196d(imageView, clientProfilePic2);
            return;
        }
        if (!(clientID2.length() == 0)) {
            if (!(upperCase.length() == 0)) {
                imageView.setImageDrawable(xgh.m56281a().mo56294a(upperCase, oh3.f38348d.m42239b(clientID2), 20));
                return;
            }
        }
        imageView.setImageResource(R.color.transparent);
    }

    public static final void z1(TextView textView, String str) {
        if (textView == null || str == null) {
            return;
        }
        textView.setText((-ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.parse(str, DateTimeFormatter.ISO_OFFSET_DATE_TIME))) + " D");
    }

    public static final void z2(TextView textView, Long l) {
        if (textView != null && l != null && l.longValue() > 0) {
            textView.setText(jm7.c0(l.longValue(), textView));
            textView.setVisibility(0);
        } else {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        }
    }
}
