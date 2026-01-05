package p001o;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.model.ChatMessageSummary;
import ai.salesmax.model.ChatMessages;
import ai.salesmax.model.FileData;
import ai.salesmax.model.UploadedFileSummary;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.amplifyframework.datastore.generated.model.Attendance;
import com.amplifyframework.datastore.generated.model.User;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import type.UpdateUserInput;

/* loaded from: classes2.dex */
public enum u60 {
    UPLOAD_IMAGE_POST_ATTENDANCE("uploadImagePostAttendance"),
    SEND_CHAT_MESSAGE_WITH_MEDIA("sendChatMessageWithMedia"),
    PASSTHROUGH("passthrough");

    static final /* synthetic */ boolean $assertionsDisabled = false;
    private String workType;

    /* renamed from: o.u60$a */
    public static /* synthetic */ class C17301a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48377a;

        static {
            int[] iArr = new int[u60.values().length];
            f48377a = iArr;
            try {
                iArr[u60.UPLOAD_IMAGE_POST_ATTENDANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48377a[u60.SEND_CHAT_MESSAGE_WITH_MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48377a[u60.PASSTHROUGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    u60(String str) {
        this.workType = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __prepareChatMessageWithUploadedFileSummary, reason: merged with bridge method [inline-methods] */
    public x6c lambda$uploadChatMessageWithMediaToWhatsApp$8(Context context, UploadedFileSummary uploadedFileSummary, ChatMessages chatMessages) throws IOException {
        String str = (String) Optional.ofNullable(uploadedFileSummary.getFileMimeType()).orElse("");
        FileData fileData = uploadedFileSummary.toFileData();
        fileData.setUploadedUri((String) Optional.ofNullable(uploadedFileSummary.getFileUrl()).orElse(""));
        fileData.setUploadedFileId(uploadedFileSummary.getId());
        fileData.setSuccess(true);
        fileData.setUploaded(true);
        if (str.contains("pdf") && fileData.getContentUri() != null) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(fileData.getContentUri(), "r");
                try {
                    PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                    try {
                        PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
                        try {
                            pageOpenPage.render(Bitmap.createBitmap(pageOpenPage.getWidth(), pageOpenPage.getHeight(), Bitmap.Config.ARGB_8888), null, null, 1);
                            pageOpenPage.close();
                            pdfRenderer.close();
                            if (parcelFileDescriptorOpenFileDescriptor != null) {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        chatMessages.setMessageFile(fileData);
        return i33.F1(chatMessages.toChatMessageSummary(null)).d0(new rl7() { // from class: o.f60
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((ChatMessageSummary) obj).toChatMessages();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$1(Attendance attendance) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$2(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$5(ChatMessages chatMessages) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$6(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$logAttendanceWithProfilePictureUpdateIfNeeded$10(mii miiVar, User user) {
        lpi.R0(user);
        miiVar.m39150H();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Attendance lambda$logAttendanceWithProfilePictureUpdateIfNeeded$11(Attendance attendance, User user) {
        return attendance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x8c lambda$logAttendanceWithProfilePictureUpdateIfNeeded$12(Boolean bool, String str, l1 l1Var, final mii miiVar, final Attendance attendance) {
        return !bool.booleanValue() ? x6c.c0(attendance) : l1Var.cj(UpdateUserInput.builder().id(str).profilePictureUrl(attendance.getCapturedImageUrl()).build()).m55714J(new ggd() { // from class: o.o60
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return u60.lambda$logAttendanceWithProfilePictureUpdateIfNeeded$10(miiVar, (User) obj);
            }
        }).d0(new rl7() { // from class: o.p60
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u60.lambda$logAttendanceWithProfilePictureUpdateIfNeeded$11(attendance, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Attendance lambda$logAttendanceWithProfilePictureUpdateIfNeeded$9(Attendance.BuildStep buildStep, UploadedFileSummary uploadedFileSummary) {
        return buildStep.capturedImageUrl(uploadedFileSummary.getFileUrl()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: logAttendanceWithProfilePictureUpdateIfNeeded, reason: merged with bridge method [inline-methods] */
    public x6c lambda$execute$0(final mii miiVar, String str) {
        final l1 l1VarM39161k = miiVar.m39161k();
        Map map = (Map) ja8.f30035c.fromJson(str, Map.class);
        String str2 = (String) map.get("accountId");
        final String str3 = (String) map.get("userId");
        String str4 = (String) map.getOrDefault("dateTimeOfAttendanceInMillis", a81.m16645F(a81.m16641B()).toString());
        final Boolean boolValueOf = Boolean.valueOf(Boolean.parseBoolean((String) map.getOrDefault("updateProfilePicUrl", "false")));
        Long lValueOf = Long.valueOf(Long.parseLong(str4));
        String str5 = (String) map.get("capturedImageUri");
        String str6 = (String) map.get("capturedImageName");
        String str7 = (String) map.get("attendanceId");
        Uri uri = Uri.parse(str5);
        String.format("Log attendance with input uri %s", uri);
        final Attendance.BuildStep buildStepId = Attendance.builder().accountId(str2).userId(str3).dateOfAttendance(a81.m16658m(lValueOf)).id(str7);
        x6c x6cVarD0 = gq9.m29278C(SuperfoneApplication.f225c.m127c().m3259u(), uri, str6, "application/image", "ATTENDANCE", "ATTENDANCE").d0(new rl7() { // from class: o.l60
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u60.lambda$logAttendanceWithProfilePictureUpdateIfNeeded$9(buildStepId, (UploadedFileSummary) obj);
            }
        });
        Objects.requireNonNull(l1VarM39161k);
        return x6cVarD0.m55717M(new rl7() { // from class: o.m60
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return l1VarM39161k.ca((Attendance) obj);
            }
        }).m55717M(new rl7() { // from class: o.n60
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u60.lambda$logAttendanceWithProfilePictureUpdateIfNeeded$12(boolValueOf, str3, l1VarM39161k, miiVar, (Attendance) obj);
            }
        });
    }

    public static u60 ofWorkType(String str) {
        for (u60 u60Var : values()) {
            if (u60Var.workType.equals(str)) {
                return u60Var;
            }
        }
        return PASSTHROUGH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uploadChatMessageWithMediaToWhatsApp, reason: merged with bridge method [inline-methods] */
    public x6c lambda$execute$4(mii miiVar, String str) {
        Map map = (Map) ja8.f30035c.fromJson(str, Map.class);
        String.format("FileData: %s", map.get("fileData"));
        Gson gson = ja8.f30034b;
        FileData fileData = (FileData) gson.fromJson((String) map.get("fileData"), FileData.class);
        final ChatMessages chatMessages = (ChatMessages) gson.fromJson((String) map.get("chatMessages"), ChatMessages.class);
        final Activity activityM125a = SuperfoneApplication.f225c.m125a();
        return (Objects.isNull(activityM125a) || Objects.isNull(fileData.getContentUri())) ? x6c.m55693G() : gq9.m29279D(activityM125a, fileData.getContentUri(), fileData.getFileName(), fileData.getMimeType(), fileData.getDocumentCategory(), fileData.getDocumentSubCategory(), fileData.getScopeLevel(), fileData.getScopeId(), fileData.getUploadSource()).m55717M(new rl7() { // from class: o.q60
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f41336a.lambda$uploadChatMessageWithMediaToWhatsApp$8(activityM125a, chatMessages, (UploadedFileSummary) obj);
            }
        });
    }

    public void execute(final String str) {
        int i = C17301a.f48377a[ordinal()];
        if (i == 1) {
            uni.LB().d0(new gd()).m55717M(new rl7() { // from class: o.r60
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return this.f43044a.lambda$execute$0(str, (mii) obj);
                }
            }).w0(new gu3() { // from class: o.s60
                @Override // p001o.gu3
                public final void accept(Object obj) {
                    this.f44864a.lambda$execute$1((Attendance) obj);
                }
            }, new gu3() { // from class: o.t60
                @Override // p001o.gu3
                public final void accept(Object obj) {
                    this.f46482a.lambda$execute$2((Throwable) obj);
                }
            }, new jm() { // from class: o.g60
                @Override // p001o.jm
                public final void run() {
                    this.f24622a.lambda$execute$3();
                }
            });
        } else {
            if (i != 2) {
                return;
            }
            uni.LB().d0(new gd()).m55717M(new rl7() { // from class: o.h60
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return this.f26227a.lambda$execute$4(str, (mii) obj);
                }
            }).w0(new gu3() { // from class: o.i60
                @Override // p001o.gu3
                public final void accept(Object obj) {
                    this.f28136a.lambda$execute$5((ChatMessages) obj);
                }
            }, new gu3() { // from class: o.j60
                @Override // p001o.gu3
                public final void accept(Object obj) {
                    this.f29842a.lambda$execute$6((Throwable) obj);
                }
            }, new jm() { // from class: o.k60
                @Override // p001o.jm
                public final void run() {
                    this.f31520a.lambda$execute$7();
                }
            });
        }
    }

    public String getWorkType() {
        return this.workType;
    }
}
