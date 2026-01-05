package com.sun.mail.util.logging;

import a1.C0005d;
import a2.AbstractC0030c;
import com.sun.mail.imap.IMAPStore;
import jakarta.mail.AbstractC3633a;
import jakarta.mail.AbstractC3634b;
import jakarta.mail.AbstractC3635c;
import jakarta.mail.AbstractC3682n;
import jakarta.mail.AbstractC3684p;
import jakarta.mail.AbstractC3695w;
import jakarta.mail.C3681m;
import jakarta.mail.C3686r;
import jakarta.mail.InterfaceC3685q;
import jakarta.mail.MessagingException;
import jakarta.mail.c0;
import jakarta.mail.f0;
import jakarta.mail.internet.AbstractC3670s;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.C3655d;
import jakarta.mail.internet.C3663l;
import jakarta.mail.internet.C3665n;
import jakarta.mail.internet.C3666o;
import jakarta.mail.internet.C3675x;
import jakarta.mail.internet.InterfaceC3667p;
import jakarta.mail.internet.ParseException;
import jakarta.mail.util.C3690a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.ErrorManager;
import java.util.logging.Filter;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;
import nw.AbstractC5158h;
import nw.C5154d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class MailHandler extends Handler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int MIN_HEADER_SIZE = 1024;
    private volatile Filter[] attachmentFilters;
    private Formatter[] attachmentFormatters;
    private Formatter[] attachmentNames;
    private AbstractC3634b auth;
    private int capacity;
    private Comparator<? super LogRecord> comparator;
    private AbstractC5158h contentTypes;
    private LogRecord[] data;
    private String encoding;
    private volatile Filter filter;
    private Formatter formatter;
    private boolean isWriting;
    private Properties mailProps;
    private int[] matched;
    private Filter pushFilter;
    private Level pushLevel;
    private volatile boolean sealed;
    private c0 session;
    private int size;
    private Formatter subjectFormatter;
    private static final Filter[] EMPTY_FILTERS = new Filter[0];
    private static final Formatter[] EMPTY_FORMATTERS = new Formatter[0];
    private static final int offValue = Level.OFF.intValue();
    private static final PrivilegedAction<Object> MAILHANDLER_LOADER = new GetAndSetContext(MailHandler.class);
    private static final ThreadLocal<Integer> MUTEX = new ThreadLocal<>();
    private static final Integer MUTEX_PUBLISH = -2;
    private static final Integer MUTEX_REPORT = -4;
    private static final Integer MUTEX_LINKAGE = -8;
    private volatile Level logLevel = Level.ALL;
    private volatile ErrorManager errorManager = defaultErrorManager();

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultAuthenticator extends AbstractC3634b {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final String pass;

        private DefaultAuthenticator(String str) {
            this.pass = str;
        }

        public static AbstractC3634b of(String str) {
            return new DefaultAuthenticator(str);
        }

        @Override // jakarta.mail.AbstractC3634b
        public final C3686r getPasswordAuthentication() {
            return new C3686r(getDefaultUserName(), this.pass);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class GetAndSetContext implements PrivilegedAction<Object> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        public static final Object NOT_MODIFIED = GetAndSetContext.class;
        private final Object source;

        public GetAndSetContext(Object obj) {
            this.source = obj;
        }

        @Override // java.security.PrivilegedAction
        public final Object run() {
            Thread threadCurrentThread = Thread.currentThread();
            ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
            Object obj = this.source;
            ClassLoader classLoader = obj == null ? null : obj instanceof ClassLoader ? (ClassLoader) obj : obj instanceof Class ? ((Class) obj).getClassLoader() : obj instanceof Thread ? ((Thread) obj).getContextClassLoader() : obj.getClass().getClassLoader();
            if (contextClassLoader == classLoader) {
                return NOT_MODIFIED;
            }
            threadCurrentThread.setContextClassLoader(classLoader);
            return contextClassLoader;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class TailNameFormatter extends Formatter {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final String name;

        private TailNameFormatter(String str) {
            this.name = str;
        }

        public static Formatter of(String str) {
            return new TailNameFormatter(str);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof TailNameFormatter) {
                return this.name.equals(((TailNameFormatter) obj).name);
            }
            return false;
        }

        @Override // java.util.logging.Formatter
        public final String format(LogRecord logRecord) {
            return "";
        }

        @Override // java.util.logging.Formatter
        public final String getTail(Handler handler) {
            return this.name;
        }

        public final int hashCode() {
            return this.name.hashCode() + TailNameFormatter.class.hashCode();
        }

        public final String toString() {
            return this.name;
        }
    }

    public MailHandler() throws SecurityException {
        init(null);
        this.sealed = true;
        checkAccess();
    }

    private boolean alignAttachmentFilters() {
        int length = this.attachmentFormatters.length;
        int length2 = this.attachmentFilters.length;
        if (length2 != length) {
            this.attachmentFilters = (Filter[]) Arrays.copyOf(this.attachmentFilters, length, Filter[].class);
            clearMatches(length2);
            z = length2 != 0;
            Filter filter = this.filter;
            if (filter != null) {
                while (length2 < length) {
                    this.attachmentFilters[length2] = filter;
                    length2++;
                }
            }
        }
        if (length == 0) {
            this.attachmentFilters = emptyFilterArray();
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean alignAttachmentNames() {
        /*
            r5 = this;
            java.util.logging.Formatter[] r0 = r5.attachmentFormatters
            int r0 = r0.length
            java.util.logging.Formatter[] r1 = r5.attachmentNames
            int r2 = r1.length
            r3 = 0
            if (r2 == r0) goto L17
            java.lang.Class<java.util.logging.Formatter[]> r4 = java.util.logging.Formatter[].class
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0, r4)
            java.util.logging.Formatter[] r1 = (java.util.logging.Formatter[]) r1
            r5.attachmentNames = r1
            if (r2 == 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = r3
        L18:
            if (r0 != 0) goto L21
            java.util.logging.Formatter[] r0 = emptyFormatterArray()
            r5.attachmentNames = r0
            return r1
        L21:
            if (r3 >= r0) goto L3a
            java.util.logging.Formatter[] r2 = r5.attachmentNames
            r4 = r2[r3]
            if (r4 != 0) goto L37
            java.util.logging.Formatter[] r4 = r5.attachmentFormatters
            r4 = r4[r3]
            java.lang.String r4 = r5.toString(r4)
            java.util.logging.Formatter r4 = com.sun.mail.util.logging.MailHandler.TailNameFormatter.of(r4)
            r2[r3] = r4
        L37:
            int r3 = r3 + 1
            goto L21
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.MailHandler.alignAttachmentNames():boolean");
    }

    private boolean allowRestrictedHeaders() {
        return LogManagerProperties.hasLogManager();
    }

    private void appendContentLang(InterfaceC3667p interfaceC3667p, Locale locale) {
        try {
            String languageTag = LogManagerProperties.toLanguageTag(locale);
            if (languageTag.length() != 0) {
                String header = interfaceC3667p.getHeader("Content-Language", null);
                if (isEmpty(header)) {
                    interfaceC3667p.setHeader("Content-Language", languageTag);
                    return;
                }
                if (header.equalsIgnoreCase(languageTag)) {
                    return;
                }
                String strConcat = ",".concat(languageTag);
                int iIndexOf = 0;
                do {
                    iIndexOf = header.indexOf(strConcat, iIndexOf);
                    if (iIndexOf <= -1 || (iIndexOf = iIndexOf + strConcat.length()) == header.length()) {
                        break;
                    }
                } while (header.charAt(iIndexOf) != ',');
                if (iIndexOf < 0) {
                    int iLastIndexOf = header.lastIndexOf("\r\n\t");
                    interfaceC3667p.setHeader("Content-Language", (iLastIndexOf < 0 ? header.length() + 20 : (header.length() - iLastIndexOf) + 8) + strConcat.length() > 76 ? header.concat("\r\n\t".concat(strConcat)) : header.concat(strConcat));
                }
            }
        } catch (MessagingException e2) {
            reportError(e2.getMessage(), e2, 5);
        }
    }

    private void appendFileName(InterfaceC3685q interfaceC3685q, String str) {
        if (str == null) {
            reportNullError(5);
        } else if (str.length() > 0) {
            appendFileName0(interfaceC3685q, str);
        }
    }

    private void appendFileName0(InterfaceC3685q interfaceC3685q, String str) {
        try {
            String strReplaceAll = str.replaceAll("[\\x00-\\x1F\\x7F]+", "");
            String fileName = interfaceC3685q.getFileName();
            if (fileName != null) {
                strReplaceAll = fileName.concat(strReplaceAll);
            }
            interfaceC3685q.setFileName(strReplaceAll);
        } catch (MessagingException e2) {
            reportError(e2.getMessage(), e2, 5);
        }
    }

    private void appendSubject(AbstractC3682n abstractC3682n, String str) {
        if (str == null) {
            reportNullError(5);
        } else if (str.length() > 0) {
            appendSubject0(abstractC3682n, str);
        }
    }

    private void appendSubject0(AbstractC3682n abstractC3682n, String str) {
        try {
            String strReplaceAll = str.replaceAll("[\\x00-\\x1F\\x7F]+", "");
            String encodingName = getEncodingName();
            String subject = abstractC3682n.getSubject();
            C3665n c3665n = (C3665n) abstractC3682n;
            if (subject != null) {
                strReplaceAll = subject.concat(strReplaceAll);
            }
            c3665n.setSubject(strReplaceAll, AbstractC3670s.m8252p(encodingName));
        } catch (MessagingException e2) {
            reportError(e2.getMessage(), e2, 5);
        }
    }

    private static String atIndexMsg(int i10) {
        return "At index: " + i10 + '.';
    }

    private static MessagingException attach(MessagingException messagingException, Exception exc) {
        if (exc != null && !messagingException.setNextException(exc)) {
            if (exc instanceof MessagingException) {
                MessagingException messagingException2 = (MessagingException) exc;
                if (messagingException2.setNextException(messagingException)) {
                    return messagingException2;
                }
            }
            if (exc != messagingException) {
                messagingException.addSuppressed(exc);
            }
        }
        return messagingException;
    }

    private static RuntimeException attachmentMismatch(String str) {
        return new IndexOutOfBoundsException(str);
    }

    private void checkAccess() throws SecurityException {
        if (this.sealed) {
            LogManagerProperties.checkLogManagerAccess();
        }
    }

    private void clearMatches(int i10) {
        for (int i11 = 0; i11 < this.size; i11++) {
            int[] iArr = this.matched;
            if (iArr[i11] >= i10) {
                iArr[i11] = MUTEX_PUBLISH.intValue();
            }
        }
    }

    private String contentWithEncoding(String str, String str2) {
        try {
            C0005d c0005d = new C0005d(str);
            String strM8252p = AbstractC3670s.m8252p(str2);
            if (((C3675x) c0005d.f26d) == null) {
                c0005d.f26d = new C3675x();
            }
            ((C3675x) c0005d.f26d).m8263g("charset", strM8252p);
            String string = c0005d.toString();
            return !isEmpty(string) ? string : str;
        } catch (MessagingException e2) {
            reportError(str, e2, 5);
            return str;
        }
    }

    private C3663l createBodyPart() throws MessagingException {
        C3663l c3663l = new C3663l();
        C3663l.setDisposition(c3663l, "inline");
        c3663l.setDescription(descriptionFrom(getFormatter(), getFilter(), this.subjectFormatter));
        setAcceptLang(c3663l);
        return c3663l;
    }

    private static Formatter createSimpleFormatter() {
        return (Formatter) Formatter.class.cast(new SimpleFormatter());
    }

    private ErrorManager defaultErrorManager() {
        ErrorManager errorManager;
        try {
            errorManager = super.getErrorManager();
        } catch (LinkageError | RuntimeException unused) {
            errorManager = null;
        }
        return errorManager == null ? new ErrorManager() : errorManager;
    }

    private String descriptionFrom(Comparator<?> comparator, Level level, Filter filter) {
        StringBuilder sb2 = new StringBuilder("Sorted using ");
        sb2.append(comparator == null ? "no comparator" : comparator.getClass().getName());
        sb2.append(", pushed when ");
        sb2.append(level.getName());
        sb2.append(", and ");
        return AbstractC0030c.m123n(sb2, filter == null ? "no push filter" : filter.getClass().getName(), '.');
    }

    private static Filter[] emptyFilterArray() {
        return EMPTY_FILTERS;
    }

    private static Formatter[] emptyFormatterArray() {
        return EMPTY_FORMATTERS;
    }

    private void envelopeFor(AbstractC3682n abstractC3682n, boolean z6) throws IOException, MessagingException {
        setAcceptLang(abstractC3682n);
        setFrom(abstractC3682n);
        C3681m c3681m = C3681m.f19407b;
        if (!setRecipient(abstractC3682n, "mail.to", c3681m)) {
            setDefaultRecipient(abstractC3682n, c3681m);
        }
        setRecipient(abstractC3682n, "mail.cc", C3681m.f19408c);
        setRecipient(abstractC3682n, "mail.bcc", C3681m.f19409d);
        setReplyTo(abstractC3682n);
        setSender(abstractC3682n);
        setMailer(abstractC3682n);
        setAutoSubmitted(abstractC3682n);
        if (z6) {
            setPriority(abstractC3682n);
        }
        try {
            abstractC3682n.setSentDate(new Date());
        } catch (MessagingException e2) {
            reportError(e2.getMessage(), e2, 5);
        }
    }

    private String format(Formatter formatter, LogRecord logRecord) {
        try {
            return formatter.format(logRecord);
        } catch (RuntimeException e2) {
            reportError(e2.getMessage(), e2, 5);
            return "";
        }
    }

    private Object getAndSetContextClassLoader(Object obj) {
        if (obj != GetAndSetContext.NOT_MODIFIED) {
            try {
                return AccessController.doPrivileged(obj instanceof PrivilegedAction ? (PrivilegedAction) obj : new GetAndSetContext(obj));
            } catch (SecurityException unused) {
            }
        }
        return GetAndSetContext.NOT_MODIFIED;
    }

    private String getClassId(Formatter formatter) {
        return formatter instanceof TailNameFormatter ? String.class.getName() : formatter.getClass().getName();
    }

    private String getContentType(String str) {
        String strMo10069a = this.contentTypes.mo10069a(str);
        if ("application/octet-stream".equalsIgnoreCase(strMo10069a)) {
            return null;
        }
        return strMo10069a;
    }

    private String getEncodingName() {
        String encoding = getEncoding();
        return encoding == null ? AbstractC3670s.m8246j() : encoding;
    }

    private String getLocalHost(AbstractC3695w abstractC3695w) {
        try {
            return LogManagerProperties.getLocalHost(abstractC3695w);
        } catch (Exception e2) {
            reportError(abstractC3695w.toString(), e2, 4);
            return null;
        } catch (LinkageError | NoSuchMethodException | SecurityException unused) {
            return null;
        }
    }

    private int getMatchedPart() {
        Integer num = MUTEX.get();
        if (num == null || num.intValue() >= readOnlyAttachmentFilters().length) {
            num = MUTEX_PUBLISH;
        }
        return num.intValue();
    }

    private c0 getSession(AbstractC3682n abstractC3682n) {
        AbstractC3682n abstractC3682n2;
        InterfaceC3685q interfaceC3685q;
        abstractC3682n.getClass();
        InterfaceC3685q interfaceC3685q2 = abstractC3682n;
        while (interfaceC3685q2 != null) {
            try {
                if (interfaceC3685q2 instanceof AbstractC3682n) {
                    abstractC3682n2 = (AbstractC3682n) interfaceC3685q2;
                    break;
                }
                AbstractC3684p parent = ((AbstractC3635c) interfaceC3685q2).getParent();
                if (parent == null) {
                    break;
                }
                synchronized (parent) {
                    interfaceC3685q = parent.f19414c;
                }
                interfaceC3685q2 = interfaceC3685q;
            } catch (MessagingException unused) {
            }
        }
        abstractC3682n2 = null;
        if (abstractC3682n2 != null) {
            return abstractC3682n2.getSession();
        }
        return null;
    }

    private void grow() {
        LogRecord[] logRecordArr = this.data;
        int length = logRecordArr.length;
        int i10 = (length >> 1) + length + 1;
        int i11 = this.capacity;
        if (i10 > i11 || i10 < length) {
            i10 = i11;
        }
        this.data = (LogRecord[]) Arrays.copyOf(logRecordArr, i10, LogRecord[].class);
        this.matched = Arrays.copyOf(this.matched, i10);
    }

    private static boolean hasValue(String str) {
        return (isEmpty(str) || "null".equalsIgnoreCase(str)) ? false : true;
    }

    private String head(Formatter formatter) {
        try {
            return formatter.getHead(this);
        } catch (RuntimeException e2) {
            reportError(e2.getMessage(), e2, 5);
            return "";
        }
    }

    private synchronized void init(Properties properties) {
        try {
            String name = getClass().getName();
            this.mailProps = new Properties();
            Object andSetContextClassLoader = getAndSetContextClassLoader(MAILHANDLER_LOADER);
            try {
                this.contentTypes = AbstractC5158h.m10068b();
                getAndSetContextClassLoader(andSetContextClassLoader);
                initErrorManager(name);
                initLevel(name);
                initFilter(name);
                initCapacity(name);
                initAuthenticator(name);
                initEncoding(name);
                initFormatter(name);
                initComparator(name);
                initPushLevel(name);
                initPushFilter(name);
                initSubject(name);
                initAttachmentFormaters(name);
                initAttachmentFilters(name);
                initAttachmentNames(name);
                if (properties == null && LogManagerProperties.fromLogManager(name.concat(".verify")) != null) {
                    verifySettings(initSession());
                }
                intern();
            } catch (Throwable th2) {
                getAndSetContextClassLoader(andSetContextClassLoader);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private void initAttachmentFilters(String str) {
        String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".attachment.filters"));
        if (isEmpty(strFromLogManager)) {
            this.attachmentFilters = emptyFilterArray();
            alignAttachmentFilters();
            return;
        }
        String[] strArrSplit = strFromLogManager.split(",");
        int length = strArrSplit.length;
        Filter[] filterArr = new Filter[length];
        for (int i10 = 0; i10 < length; i10++) {
            String strTrim = strArrSplit[i10].trim();
            strArrSplit[i10] = strTrim;
            if (!"null".equalsIgnoreCase(strTrim)) {
                try {
                    filterArr[i10] = LogManagerProperties.newFilter(strArrSplit[i10]);
                } catch (SecurityException e2) {
                    throw e2;
                } catch (Exception e10) {
                    reportError(e10.getMessage(), e10, 4);
                }
            }
        }
        this.attachmentFilters = filterArr;
        if (alignAttachmentFilters()) {
            reportError("Attachment filters.", attachmentMismatch("Length mismatch."), 4);
        }
    }

    private void initAttachmentFormaters(String str) {
        String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".attachment.formatters"));
        if (isEmpty(strFromLogManager)) {
            this.attachmentFormatters = emptyFormatterArray();
            return;
        }
        String[] strArrSplit = strFromLogManager.split(",");
        Formatter[] formatterArrEmptyFormatterArray = strArrSplit.length == 0 ? emptyFormatterArray() : new Formatter[strArrSplit.length];
        for (int i10 = 0; i10 < formatterArrEmptyFormatterArray.length; i10++) {
            String strTrim = strArrSplit[i10].trim();
            strArrSplit[i10] = strTrim;
            if ("null".equalsIgnoreCase(strTrim)) {
                reportError("Attachment formatter.", new NullPointerException(atIndexMsg(i10)), 4);
                formatterArrEmptyFormatterArray[i10] = createSimpleFormatter();
            } else {
                try {
                    Formatter formatterNewFormatter = LogManagerProperties.newFormatter(strArrSplit[i10]);
                    formatterArrEmptyFormatterArray[i10] = formatterNewFormatter;
                    if (formatterNewFormatter instanceof TailNameFormatter) {
                        reportError("Attachment formatter.", new ClassNotFoundException(formatterArrEmptyFormatterArray[i10].toString()), 4);
                        formatterArrEmptyFormatterArray[i10] = createSimpleFormatter();
                    }
                } catch (SecurityException e2) {
                    throw e2;
                } catch (Exception e10) {
                    reportError(e10.getMessage(), e10, 4);
                    formatterArrEmptyFormatterArray[i10] = createSimpleFormatter();
                }
            }
        }
        this.attachmentFormatters = formatterArrEmptyFormatterArray;
    }

    private void initAttachmentNames(String str) {
        String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".attachment.names"));
        if (isEmpty(strFromLogManager)) {
            this.attachmentNames = emptyFormatterArray();
            alignAttachmentNames();
            return;
        }
        String[] strArrSplit = strFromLogManager.split(",");
        int length = strArrSplit.length;
        Formatter[] formatterArr = new Formatter[length];
        for (int i10 = 0; i10 < length; i10++) {
            String strTrim = strArrSplit[i10].trim();
            strArrSplit[i10] = strTrim;
            if ("null".equalsIgnoreCase(strTrim)) {
                reportError("Attachment names.", new NullPointerException(atIndexMsg(i10)), 4);
            } else {
                try {
                    try {
                        formatterArr[i10] = LogManagerProperties.newFormatter(strArrSplit[i10]);
                    } catch (ClassCastException | ClassNotFoundException unused) {
                        formatterArr[i10] = TailNameFormatter.of(strArrSplit[i10]);
                    }
                } catch (SecurityException e2) {
                    throw e2;
                } catch (Exception e10) {
                    reportError(e10.getMessage(), e10, 4);
                }
            }
        }
        this.attachmentNames = formatterArr;
        if (alignAttachmentNames()) {
            reportError("Attachment names.", attachmentMismatch("Length mismatch."), 4);
        }
    }

    private void initAuthenticator(String str) {
        String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".authenticator"));
        if (strFromLogManager == null || "null".equalsIgnoreCase(strFromLogManager)) {
            return;
        }
        if (strFromLogManager.length() == 0) {
            this.auth = DefaultAuthenticator.of(strFromLogManager);
            return;
        }
        try {
            this.auth = (AbstractC3634b) LogManagerProperties.newObjectFrom(strFromLogManager, AbstractC3634b.class);
        } catch (ClassCastException | ClassNotFoundException unused) {
            this.auth = DefaultAuthenticator.of(strFromLogManager);
        } catch (SecurityException e2) {
            throw e2;
        } catch (Exception e10) {
            reportError(e10.getMessage(), e10, 4);
        }
    }

    private void initCapacity(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".capacity"));
            if (strFromLogManager != null) {
                setCapacity0(Integer.parseInt(strFromLogManager));
            } else {
                setCapacity0(IMAPStore.RESPONSE);
            }
        } catch (SecurityException e2) {
            throw e2;
        } catch (RuntimeException e10) {
            reportError(e10.getMessage(), e10, 4);
        }
        if (this.capacity <= 0) {
            this.capacity = IMAPStore.RESPONSE;
        }
        LogRecord[] logRecordArr = new LogRecord[1];
        this.data = logRecordArr;
        this.matched = new int[logRecordArr.length];
    }

    private void initComparator(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".comparator"));
            String strFromLogManager2 = LogManagerProperties.fromLogManager(str.concat(".comparator.reverse"));
            if (!hasValue(strFromLogManager)) {
                if (!isEmpty(strFromLogManager2)) {
                    throw new IllegalArgumentException("No comparator to reverse.");
                }
            } else {
                this.comparator = LogManagerProperties.newComparator(strFromLogManager);
                if (Boolean.parseBoolean(strFromLogManager2)) {
                    this.comparator = LogManagerProperties.reverseOrder(this.comparator);
                }
            }
        } catch (SecurityException e2) {
            throw e2;
        } catch (Exception e10) {
            reportError(e10.getMessage(), e10, 4);
        }
    }

    private void initEncoding(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".encoding"));
            if (strFromLogManager != null) {
                setEncoding0(strFromLogManager);
            }
        } catch (UnsupportedEncodingException e2) {
            e = e2;
            reportError(e.getMessage(), e, 4);
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            reportError(e.getMessage(), e, 4);
        }
    }

    private void initErrorManager(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".errorManager"));
            if (strFromLogManager != null) {
                setErrorManager0(LogManagerProperties.newErrorManager(strFromLogManager));
            }
        } catch (SecurityException e2) {
            throw e2;
        } catch (Exception e10) {
            reportError(e10.getMessage(), e10, 4);
        }
    }

    private void initFilter(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".filter"));
            if (hasValue(strFromLogManager)) {
                this.filter = LogManagerProperties.newFilter(strFromLogManager);
            }
        } catch (SecurityException e2) {
            throw e2;
        } catch (Exception e10) {
            reportError(e10.getMessage(), e10, 4);
        }
    }

    private void initFormatter(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".formatter"));
            if (!hasValue(strFromLogManager)) {
                this.formatter = createSimpleFormatter();
                return;
            }
            Formatter formatterNewFormatter = LogManagerProperties.newFormatter(strFromLogManager);
            if (formatterNewFormatter instanceof TailNameFormatter) {
                this.formatter = createSimpleFormatter();
            } else {
                this.formatter = formatterNewFormatter;
            }
        } catch (SecurityException e2) {
            throw e2;
        } catch (Exception e10) {
            reportError(e10.getMessage(), e10, 4);
            this.formatter = createSimpleFormatter();
        }
    }

    private void initLevel(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".level"));
            if (strFromLogManager != null) {
                this.logLevel = Level.parse(strFromLogManager);
            } else {
                this.logLevel = Level.WARNING;
            }
        } catch (SecurityException e2) {
            throw e2;
        } catch (RuntimeException e10) {
            reportError(e10.getMessage(), e10, 4);
            this.logLevel = Level.WARNING;
        }
    }

    private void initPushFilter(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".pushFilter"));
            if (hasValue(strFromLogManager)) {
                this.pushFilter = LogManagerProperties.newFilter(strFromLogManager);
            }
        } catch (SecurityException e2) {
            throw e2;
        } catch (Exception e10) {
            reportError(e10.getMessage(), e10, 4);
        }
    }

    private void initPushLevel(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".pushLevel"));
            if (strFromLogManager != null) {
                this.pushLevel = Level.parse(strFromLogManager);
            }
        } catch (RuntimeException e2) {
            reportError(e2.getMessage(), e2, 4);
        }
        if (this.pushLevel == null) {
            this.pushLevel = Level.OFF;
        }
    }

    private c0 initSession() {
        c0 c0Var = new c0(new LogManagerProperties(this.mailProps, getClass().getName()), this.auth);
        this.session = c0Var;
        return c0Var;
    }

    private void initSubject(String str) {
        String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".subject"));
        if (strFromLogManager == null) {
            strFromLogManager = "com.sun.mail.util.logging.CollectorFormatter";
        }
        if (!hasValue(strFromLogManager)) {
            this.subjectFormatter = TailNameFormatter.of(strFromLogManager);
            return;
        }
        try {
            this.subjectFormatter = LogManagerProperties.newFormatter(strFromLogManager);
        } catch (ClassCastException | ClassNotFoundException unused) {
            this.subjectFormatter = TailNameFormatter.of(strFromLogManager);
        } catch (SecurityException e2) {
            throw e2;
        } catch (Exception e10) {
            this.subjectFormatter = TailNameFormatter.of(strFromLogManager);
            reportError(e10.getMessage(), e10, 4);
        }
    }

    private void intern() {
        try {
            HashMap map = new HashMap();
            try {
                intern(map, this.errorManager);
            } catch (SecurityException e2) {
                reportError(e2.getMessage(), e2, 4);
            }
            try {
                Filter filter = this.filter;
                Object objIntern = intern(map, filter);
                if (objIntern != filter && (objIntern instanceof Filter)) {
                    this.filter = (Filter) objIntern;
                }
                Formatter formatter = this.formatter;
                Object objIntern2 = intern(map, formatter);
                if (objIntern2 != formatter && (objIntern2 instanceof Formatter)) {
                    this.formatter = (Formatter) objIntern2;
                }
            } catch (SecurityException e10) {
                reportError(e10.getMessage(), e10, 4);
            }
            Formatter formatter2 = this.subjectFormatter;
            Object objIntern3 = intern(map, formatter2);
            if (objIntern3 != formatter2 && (objIntern3 instanceof Formatter)) {
                this.subjectFormatter = (Formatter) objIntern3;
            }
            Filter filter2 = this.pushFilter;
            Object objIntern4 = intern(map, filter2);
            if (objIntern4 != filter2 && (objIntern4 instanceof Filter)) {
                this.pushFilter = (Filter) objIntern4;
            }
            int i10 = 0;
            while (true) {
                Formatter[] formatterArr = this.attachmentFormatters;
                if (i10 >= formatterArr.length) {
                    return;
                }
                Formatter formatter3 = formatterArr[i10];
                Object objIntern5 = intern(map, formatter3);
                if (objIntern5 != formatter3 && (objIntern5 instanceof Formatter)) {
                    this.attachmentFormatters[i10] = (Formatter) objIntern5;
                }
                Filter filter3 = this.attachmentFilters[i10];
                Object objIntern6 = intern(map, filter3);
                if (objIntern6 != filter3 && (objIntern6 instanceof Filter)) {
                    this.attachmentFilters[i10] = (Filter) objIntern6;
                }
                Formatter formatter4 = this.attachmentNames[i10];
                Object objIntern7 = intern(map, formatter4);
                if (objIntern7 != formatter4 && (objIntern7 instanceof Formatter)) {
                    this.attachmentNames[i10] = (Formatter) objIntern7;
                }
                i10++;
            }
        } catch (Exception e11) {
            reportError(e11.getMessage(), e11, 4);
        } catch (LinkageError e12) {
            reportError(e12.getMessage(), new InvocationTargetException(e12), 4);
        }
    }

    private boolean isAttachmentLoggable(LogRecord logRecord) {
        Filter[] onlyAttachmentFilters = readOnlyAttachmentFilters();
        for (int i10 = 0; i10 < onlyAttachmentFilters.length; i10++) {
            Filter filter = onlyAttachmentFilters[i10];
            if (filter == null || filter.isLoggable(logRecord)) {
                setMatchedPart(i10);
                return true;
            }
        }
        return false;
    }

    private static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    private boolean isPushable(LogRecord logRecord) {
        int iIntValue = getPushLevel().intValue();
        if (iIntValue == offValue || logRecord.getLevel().intValue() < iIntValue) {
            return false;
        }
        Filter pushFilter = getPushFilter();
        if (pushFilter == null) {
            return true;
        }
        int matchedPart = getMatchedPart();
        if (!(matchedPart == -1 && getFilter() == pushFilter) && (matchedPart < 0 || this.attachmentFilters[matchedPart] != pushFilter)) {
            return pushFilter.isLoggable(logRecord);
        }
        return true;
    }

    private Locale localeFor(LogRecord logRecord) {
        ResourceBundle resourceBundle = logRecord.getResourceBundle();
        if (resourceBundle == null) {
            return null;
        }
        Locale locale = resourceBundle.getLocale();
        return (locale == null || isEmpty(locale.getLanguage())) ? Locale.getDefault() : locale;
    }

    private void publish0(LogRecord logRecord) {
        AbstractC3682n abstractC3682nWriteLogRecords;
        boolean zIsPushable;
        synchronized (this) {
            try {
                int i10 = this.size;
                if (i10 == this.data.length && i10 < this.capacity) {
                    grow();
                }
                int i11 = this.size;
                abstractC3682nWriteLogRecords = null;
                if (i11 < this.data.length) {
                    this.matched[i11] = getMatchedPart();
                    LogRecord[] logRecordArr = this.data;
                    int i12 = this.size;
                    logRecordArr[i12] = logRecord;
                    this.size = i12 + 1;
                    zIsPushable = isPushable(logRecord);
                    if (zIsPushable || this.size >= this.capacity) {
                        abstractC3682nWriteLogRecords = writeLogRecords(1);
                    }
                } else {
                    zIsPushable = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (abstractC3682nWriteLogRecords != null) {
            send(abstractC3682nWriteLogRecords, zIsPushable, 1);
        }
    }

    private Filter[] readOnlyAttachmentFilters() {
        return this.attachmentFilters;
    }

    private void releaseMutex() {
        MUTEX.remove();
    }

    private void reportFilterError(LogRecord logRecord) {
        Formatter formatterCreateSimpleFormatter = createSimpleFormatter();
        reportError("Log record " + logRecord.getSequenceNumber() + " was filtered from all message parts.  " + head(formatterCreateSimpleFormatter) + format(formatterCreateSimpleFormatter, logRecord) + tail(formatterCreateSimpleFormatter, ""), new IllegalArgumentException(getFilter() + ", " + Arrays.asList(readOnlyAttachmentFilters())), 5);
    }

    private void reportLinkageError(Throwable th2, int i10) {
        if (th2 == null) {
            throw new NullPointerException(String.valueOf(i10));
        }
        ThreadLocal<Integer> threadLocal = MUTEX;
        Integer num = threadLocal.get();
        if (num == null || num.intValue() > MUTEX_LINKAGE.intValue()) {
            threadLocal.set(MUTEX_LINKAGE);
            try {
                Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th2);
                if (num != null) {
                    threadLocal.set(num);
                } else {
                    threadLocal.remove();
                }
            } catch (LinkageError | RuntimeException unused) {
                if (num != null) {
                    MUTEX.set(num);
                } else {
                    MUTEX.remove();
                }
            } catch (Throwable th3) {
                if (num != null) {
                    MUTEX.set(num);
                } else {
                    MUTEX.remove();
                }
                throw th3;
            }
        }
    }

    private void reportNonDiscriminating(Object obj, Object obj2) {
        reportError("Non discriminating equals implementation.", new IllegalArgumentException(obj.getClass().getName() + " should not be equal to " + obj2.getClass().getName()), 4);
    }

    private void reportNonSymmetric(Object obj, Object obj2) {
        reportError("Non symmetric equals implementation.", new IllegalArgumentException(obj.getClass().getName() + " is not equal to " + obj2.getClass().getName()), 4);
    }

    private void reportNullError(int i10) {
        reportError("null", new NullPointerException(), i10);
    }

    private void reportUnPublishedError(LogRecord logRecord) {
        String str;
        ThreadLocal<Integer> threadLocal = MUTEX;
        Integer num = threadLocal.get();
        if (num == null || num.intValue() > MUTEX_REPORT.intValue()) {
            threadLocal.set(MUTEX_REPORT);
            if (logRecord != null) {
                try {
                    Formatter formatterCreateSimpleFormatter = createSimpleFormatter();
                    str = "Log record " + logRecord.getSequenceNumber() + " was not published. " + head(formatterCreateSimpleFormatter) + format(formatterCreateSimpleFormatter, logRecord) + tail(formatterCreateSimpleFormatter, "");
                } catch (Throwable th2) {
                    if (num != null) {
                        MUTEX.set(num);
                    } else {
                        MUTEX.remove();
                    }
                    throw th2;
                }
            } else {
                str = null;
            }
            reportError(str, new IllegalStateException("Recursive publish detected by thread " + Thread.currentThread()), 1);
            if (num != null) {
                threadLocal.set(num);
            } else {
                threadLocal.remove();
            }
        }
    }

    private void reportUnexpectedSend(C3665n c3665n, String str, Exception exc) {
        Exception messagingException = new MessagingException("An empty message was sent.", exc);
        setErrorContent(c3665n, str, messagingException);
        reportError(c3665n, messagingException, 4);
    }

    private void reset() {
        int i10 = this.size;
        LogRecord[] logRecordArr = this.data;
        if (i10 < logRecordArr.length) {
            Arrays.fill(logRecordArr, 0, i10, (Object) null);
        } else {
            Arrays.fill(logRecordArr, (Object) null);
        }
        this.size = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0023 A[Catch: MessagingException -> 0x0006, MessagingException | RuntimeException -> 0x0008, TRY_ENTER, TryCatch #5 {MessagingException | RuntimeException -> 0x0008, blocks: (B:3:0x0002, B:19:0x0023, B:20:0x0026), top: B:23:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void saveChangesNoContent(jakarta.mail.AbstractC3682n r4, java.lang.String r5) throws java.lang.Throwable {
        /*
            r3 = this;
            if (r4 == 0) goto L2b
            r4.saveChanges()     // Catch: jakarta.mail.MessagingException -> L6 java.lang.RuntimeException -> L8 java.lang.NullPointerException -> La
            goto L2b
        L6:
            r4 = move-exception
            goto L27
        L8:
            r4 = move-exception
            goto L27
        La:
            r0 = move-exception
            java.lang.String r1 = "Content-Transfer-Encoding"
            java.lang.String[] r2 = r4.getHeader(r1)     // Catch: jakarta.mail.MessagingException -> L1c java.lang.RuntimeException -> L1e
            if (r2 != 0) goto L20
            java.lang.String r2 = "base64"
            r4.setHeader(r1, r2)     // Catch: jakarta.mail.MessagingException -> L1c java.lang.RuntimeException -> L1e
            r4.saveChanges()     // Catch: jakarta.mail.MessagingException -> L1c java.lang.RuntimeException -> L1e
            goto L2b
        L1c:
            r4 = move-exception
            goto L21
        L1e:
            r4 = move-exception
            goto L21
        L20:
            throw r0     // Catch: jakarta.mail.MessagingException -> L1c java.lang.RuntimeException -> L1e
        L21:
            if (r4 == r0) goto L26
            r4.addSuppressed(r0)     // Catch: jakarta.mail.MessagingException -> L6 java.lang.RuntimeException -> L8
        L26:
            throw r4     // Catch: jakarta.mail.MessagingException -> L6 java.lang.RuntimeException -> L8
        L27:
            r0 = 5
            r3.reportError(r5, r4, r0)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.MailHandler.saveChangesNoContent(jakarta.mail.n, java.lang.String):void");
    }

    private void send(AbstractC3682n abstractC3682n, boolean z6, int i10) {
        try {
            envelopeFor(abstractC3682n, z6);
            Object andSetContextClassLoader = getAndSetContextClassLoader(MAILHANDLER_LOADER);
            try {
                f0.send(abstractC3682n);
            } finally {
                getAndSetContextClassLoader(andSetContextClassLoader);
            }
        } catch (RuntimeException e2) {
            reportError(abstractC3682n, e2, i10);
        } catch (Exception e10) {
            reportError(abstractC3682n, e10, i10);
        }
    }

    private void setAcceptLang(InterfaceC3685q interfaceC3685q) {
        try {
            String languageTag = LogManagerProperties.toLanguageTag(Locale.getDefault());
            if (languageTag.length() != 0) {
                interfaceC3685q.setHeader("Accept-Language", languageTag);
            }
        } catch (MessagingException e2) {
            reportError(e2.getMessage(), e2, 5);
        }
    }

    private void setAuthenticator0(AbstractC3634b abstractC3634b) throws Exception {
        c0 c0VarUpdateSession;
        checkAccess();
        synchronized (this) {
            if (this.isWriting) {
                throw new IllegalStateException();
            }
            this.auth = abstractC3634b;
            c0VarUpdateSession = updateSession();
        }
        verifySettings(c0VarUpdateSession);
    }

    private void setAutoSubmitted(AbstractC3682n abstractC3682n) {
        if (allowRestrictedHeaders()) {
            try {
                abstractC3682n.setHeader("auto-submitted", "auto-generated");
            } catch (MessagingException e2) {
                reportError(e2.getMessage(), e2, 5);
            }
        }
    }

    private synchronized void setCapacity0(int i10) {
        try {
            checkAccess();
            if (i10 <= 0) {
                throw new IllegalArgumentException("Capacity must be greater than zero.");
            }
            if (this.isWriting) {
                throw new IllegalStateException();
            }
            if (this.capacity < 0) {
                this.capacity = -i10;
            } else {
                this.capacity = i10;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void setContent(InterfaceC3667p interfaceC3667p, CharSequence charSequence, String str) {
        String strM78w;
        String encodingName = getEncodingName();
        if (str == null || "text/plain".equalsIgnoreCase(str)) {
            interfaceC3667p.setText(charSequence.toString(), AbstractC3670s.m8252p(encodingName));
            return;
        }
        String strContentWithEncoding = contentWithEncoding(str, encodingName);
        try {
            String string = charSequence.toString();
            C3690a c3690a = new C3690a();
            c3690a.f19423b = -1;
            try {
                strM78w = new C0005d(strContentWithEncoding).m78w("charset");
            } catch (ParseException unused) {
                strM78w = null;
            }
            String strM8249m = AbstractC3670s.m8249m(strM78w);
            if (strM8249m == null) {
                strM8249m = AbstractC3670s.m8246j();
            }
            c3690a.f19422a = string.getBytes(strM8249m);
            c3690a.f19424c = strContentWithEncoding;
            interfaceC3667p.setDataHandler(new C5154d(c3690a));
        } catch (IOException e2) {
            reportError(e2.getMessage(), e2, 5);
            interfaceC3667p.setText(charSequence.toString(), encodingName);
        }
    }

    private void setDefaultFrom(AbstractC3682n abstractC3682n) {
        try {
            abstractC3682n.setFrom();
        } catch (MessagingException e2) {
            reportError(e2.getMessage(), e2, 5);
        }
    }

    private void setDefaultRecipient(AbstractC3682n abstractC3682n, C3681m c3681m) throws MessagingException {
        try {
            C3655d localAddress = C3655d.getLocalAddress(getSession(abstractC3682n));
            if (localAddress != null) {
                abstractC3682n.setRecipient(c3681m, localAddress);
                return;
            }
            C3665n c3665n = new C3665n(getSession(abstractC3682n));
            c3665n.setFrom();
            AbstractC3633a[] from = c3665n.getFrom();
            if (from.length <= 0) {
                throw new MessagingException("No local address.");
            }
            abstractC3682n.setRecipients(c3681m, from);
        } catch (MessagingException e2) {
            e = e2;
            reportError("Unable to compute a default recipient.", e, 5);
        } catch (RuntimeException e10) {
            e = e10;
            reportError("Unable to compute a default recipient.", e, 5);
        }
    }

    private void setEncoding0(String str) throws UnsupportedEncodingException {
        if (str != null) {
            try {
                if (!Charset.isSupported(str)) {
                    throw new UnsupportedEncodingException(str);
                }
            } catch (IllegalCharsetNameException unused) {
                throw new UnsupportedEncodingException(str);
            }
        }
        synchronized (this) {
            this.encoding = str;
        }
    }

    private void setErrorContent(C3665n c3665n, String str, Throwable th2) {
        C3663l c3663lCreateBodyPart;
        String strDescriptionFrom;
        String classId;
        try {
            synchronized (this) {
                c3663lCreateBodyPart = createBodyPart();
                strDescriptionFrom = descriptionFrom(this.comparator, this.pushLevel, this.pushFilter);
                classId = getClassId(this.subjectFormatter);
            }
            StringBuilder sb2 = new StringBuilder("Formatted using ");
            sb2.append(th2 == null ? Throwable.class.getName() : th2.getClass().getName());
            sb2.append(", filtered with ");
            sb2.append(str);
            sb2.append(", and named by ");
            sb2.append(classId);
            sb2.append('.');
            c3663lCreateBodyPart.setDescription(sb2.toString());
            setContent(c3663lCreateBodyPart, toMsgString(th2), "text/plain");
            C3666o c3666o = new C3666o();
            c3666o.mo8231a(c3663lCreateBodyPart);
            c3665n.setContent(c3666o);
            c3665n.setDescription(strDescriptionFrom);
            setAcceptLang(c3665n);
            c3665n.saveChanges();
        } catch (MessagingException e2) {
            e = e2;
            reportError("Unable to create body.", e, 4);
        } catch (RuntimeException e10) {
            e = e10;
            reportError("Unable to create body.", e, 4);
        }
    }

    private void setErrorManager0(ErrorManager errorManager) {
        errorManager.getClass();
        try {
            synchronized (this) {
                this.errorManager = errorManager;
                super.setErrorManager(errorManager);
            }
        } catch (LinkageError | RuntimeException unused) {
        }
    }

    private void setFrom(AbstractC3682n abstractC3682n) {
        String property = getSession(abstractC3682n).f19287a.getProperty("mail.from");
        if (property == null) {
            setDefaultFrom(abstractC3682n);
            return;
        }
        try {
            C3655d[] c3655dArr = C3655d.parse(property, false);
            if (c3655dArr.length > 0) {
                if (c3655dArr.length == 1) {
                    abstractC3682n.setFrom(c3655dArr[0]);
                } else {
                    abstractC3682n.addFrom(c3655dArr);
                }
            }
        } catch (MessagingException e2) {
            reportError(e2.getMessage(), e2, 5);
            setDefaultFrom(abstractC3682n);
        }
    }

    private void setIncompleteCopy(AbstractC3682n abstractC3682n) {
        try {
            abstractC3682n.setHeader("Incomplete-Copy", "");
        } catch (MessagingException e2) {
            reportError(e2.getMessage(), e2, 5);
        }
    }

    private void setMailProperties0(Properties properties) throws Exception {
        c0 c0VarUpdateSession;
        checkAccess();
        Properties properties2 = (Properties) properties.clone();
        synchronized (this) {
            if (this.isWriting) {
                throw new IllegalStateException();
            }
            this.mailProps = properties2;
            c0VarUpdateSession = updateSession();
        }
        verifySettings(c0VarUpdateSession);
    }

    private void setMailer(AbstractC3682n abstractC3682n) throws IOException {
        String strReplaceAll;
        String strM8245i;
        try {
            Class<?> cls = getClass();
            if (cls == MailHandler.class) {
                strM8245i = MailHandler.class.getName();
            } else {
                try {
                    strReplaceAll = AbstractC3670s.m8244h(cls.getName(), null, false);
                } catch (UnsupportedEncodingException e2) {
                    reportError(e2.getMessage(), e2, 5);
                    strReplaceAll = cls.getName().replaceAll("[^\\x00-\\x7F]", "\u001a");
                }
                strM8245i = AbstractC3670s.m8245i(10, MailHandler.class.getName() + " using the " + strReplaceAll + " extension.");
            }
            abstractC3682n.setHeader("X-Mailer", strM8245i);
        } catch (MessagingException e10) {
            reportError(e10.getMessage(), e10, 5);
        }
    }

    private void setMatchedPart(int i10) {
        Integer num = MUTEX_PUBLISH;
        ThreadLocal<Integer> threadLocal = MUTEX;
        if (num.equals(threadLocal.get())) {
            threadLocal.set(Integer.valueOf(i10));
        }
    }

    private void setPriority(AbstractC3682n abstractC3682n) {
        try {
            abstractC3682n.setHeader("Importance", "High");
            abstractC3682n.setHeader("Priority", "urgent");
            abstractC3682n.setHeader("X-Priority", "2");
        } catch (MessagingException e2) {
            reportError(e2.getMessage(), e2, 5);
        }
    }

    private boolean setRecipient(AbstractC3682n abstractC3682n, String str, C3681m c3681m) {
        String property = getSession(abstractC3682n).f19287a.getProperty(str);
        boolean z6 = property != null;
        if (!isEmpty(property)) {
            try {
                C3655d[] c3655dArr = C3655d.parse(property, false);
                if (c3655dArr.length > 0) {
                    abstractC3682n.setRecipients(c3681m, c3655dArr);
                    return z6;
                }
            } catch (MessagingException e2) {
                reportError(e2.getMessage(), e2, 5);
            }
        }
        return z6;
    }

    private void setReplyTo(AbstractC3682n abstractC3682n) {
        String property = getSession(abstractC3682n).f19287a.getProperty("mail.reply.to");
        if (isEmpty(property)) {
            return;
        }
        try {
            C3655d[] c3655dArr = C3655d.parse(property, false);
            if (c3655dArr.length > 0) {
                abstractC3682n.setReplyTo(c3655dArr);
            }
        } catch (MessagingException e2) {
            reportError(e2.getMessage(), e2, 5);
        }
    }

    private void setSender(AbstractC3682n abstractC3682n) {
        String property = getSession(abstractC3682n).f19287a.getProperty("mail.sender");
        if (isEmpty(property)) {
            return;
        }
        try {
            C3655d[] c3655dArr = C3655d.parse(property, false);
            if (c3655dArr.length > 0) {
                ((C3665n) abstractC3682n).setSender(c3655dArr[0]);
                if (c3655dArr.length > 1) {
                    reportError("Ignoring other senders.", tooManyAddresses(c3655dArr, 1), 5);
                }
            }
        } catch (MessagingException e2) {
            reportError(e2.getMessage(), e2, 5);
        }
    }

    private void sort() {
        Comparator<? super LogRecord> comparator = this.comparator;
        if (comparator != null) {
            try {
                int i10 = this.size;
                if (i10 != 1) {
                    Arrays.sort(this.data, 0, i10, comparator);
                    return;
                }
                LogRecord logRecord = this.data[0];
                if (comparator.compare(logRecord, logRecord) != 0) {
                    throw new IllegalArgumentException(this.comparator.getClass().getName());
                }
            } catch (RuntimeException e2) {
                reportError(e2.getMessage(), e2, 5);
            }
        }
    }

    private String tail(Formatter formatter, String str) {
        try {
            return formatter.getTail(this);
        } catch (RuntimeException e2) {
            reportError(e2.getMessage(), e2, 5);
            return str;
        }
    }

    private String toMsgString(Throwable th2) throws IOException {
        if (th2 == null) {
            return "null";
        }
        String encodingName = getEncodingName();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, encodingName);
            try {
                PrintWriter printWriter = new PrintWriter(outputStreamWriter);
                try {
                    printWriter.println(th2.getMessage());
                    th2.printStackTrace(printWriter);
                    printWriter.flush();
                    printWriter.close();
                    outputStreamWriter.close();
                    return byteArrayOutputStream.toString(encodingName);
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (RuntimeException e2) {
            return th2.toString() + ' ' + e2.toString();
        } catch (Exception e10) {
            return th2.toString() + ' ' + e10.toString();
        }
    }

    private String toRawString(AbstractC3682n abstractC3682n) {
        if (abstractC3682n == null) {
            return null;
        }
        Object andSetContextClassLoader = getAndSetContextClassLoader(MAILHANDLER_LOADER);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(abstractC3682n.getSize() + 1024, 1024));
            abstractC3682n.writeTo(byteArrayOutputStream);
            return byteArrayOutputStream.toString("UTF-8");
        } finally {
            getAndSetContextClassLoader(andSetContextClassLoader);
        }
    }

    private String toString(Formatter formatter) {
        String string = formatter.toString();
        return !isEmpty(string) ? string : getClassId(formatter);
    }

    private AddressException tooManyAddresses(AbstractC3633a[] abstractC3633aArr, int i10) {
        return new AddressException(Arrays.asList(abstractC3633aArr).subList(i10, abstractC3633aArr.length).toString());
    }

    private boolean tryMutex() {
        ThreadLocal<Integer> threadLocal = MUTEX;
        if (threadLocal.get() != null) {
            return false;
        }
        threadLocal.set(MUTEX_PUBLISH);
        return true;
    }

    private c0 updateSession() {
        if (this.mailProps.getProperty("verify") != null) {
            return initSession();
        }
        this.session = null;
        return null;
    }

    private static void verifyAddresses(AbstractC3633a[] abstractC3633aArr) throws AddressException {
        if (abstractC3633aArr != null) {
            for (AbstractC3633a abstractC3633a : abstractC3633aArr) {
                if (abstractC3633a instanceof C3655d) {
                    ((C3655d) abstractC3633a).validate();
                }
            }
        }
    }

    private static InetAddress verifyHost(String str) throws UnknownHostException {
        InetAddress localHost = isEmpty(str) ? InetAddress.getLocalHost() : InetAddress.getByName(str);
        if (localHost.getCanonicalHostName().length() != 0) {
            return localHost;
        }
        throw new UnknownHostException();
    }

    private static void verifyProperties(c0 c0Var, String str) {
        c0Var.m8183e("mail.from");
        c0Var.m8183e("mail." + str + ".from");
        c0Var.m8183e("mail.dsn.ret");
        c0Var.m8183e("mail." + str + ".dsn.ret");
        c0Var.m8183e("mail.dsn.notify");
        c0Var.m8183e("mail." + str + ".dsn.notify");
        c0Var.m8183e("mail." + str + ".port");
        c0Var.m8183e("mail.user");
        c0Var.m8183e("mail." + str + ".user");
        c0Var.m8183e("mail." + str + ".localport");
    }

    private void verifySettings(c0 c0Var) throws Exception {
        if (c0Var != null) {
            try {
                Object objPut = c0Var.f19287a.put("verify", "");
                if (!(objPut instanceof String)) {
                    if (objPut != null) {
                        verifySettings0(c0Var, objPut.getClass().toString());
                    }
                } else {
                    String str = (String) objPut;
                    if (hasValue(str)) {
                        verifySettings0(c0Var, str);
                    }
                }
            } catch (LinkageError e2) {
                reportLinkageError(e2, 4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0245 A[Catch: Exception -> 0x00e2, RuntimeException -> 0x00e5, TRY_LEAVE, TryCatch #11 {RuntimeException -> 0x00e5, blocks: (B:34:0x00d8, B:36:0x00de, B:42:0x00e9, B:47:0x00f4, B:49:0x00f7, B:60:0x0128, B:63:0x0132, B:65:0x015d, B:67:0x016b, B:69:0x018d, B:71:0x01c3, B:84:0x01ee, B:70:0x01aa, B:66:0x0166, B:95:0x0212, B:99:0x0219, B:101:0x0221, B:134:0x026b, B:106:0x0229, B:117:0x023f, B:119:0x0245, B:125:0x0254, B:127:0x0257, B:130:0x0263, B:132:0x0266, B:110:0x0236, B:114:0x023c, B:53:0x0107, B:54:0x0111, B:45:0x00ee), top: B:221:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x026b A[Catch: Exception -> 0x00e2, RuntimeException -> 0x00e5, TRY_LEAVE, TryCatch #11 {RuntimeException -> 0x00e5, blocks: (B:34:0x00d8, B:36:0x00de, B:42:0x00e9, B:47:0x00f4, B:49:0x00f7, B:60:0x0128, B:63:0x0132, B:65:0x015d, B:67:0x016b, B:69:0x018d, B:71:0x01c3, B:84:0x01ee, B:70:0x01aa, B:66:0x0166, B:95:0x0212, B:99:0x0219, B:101:0x0221, B:134:0x026b, B:106:0x0229, B:117:0x023f, B:119:0x0245, B:125:0x0254, B:127:0x0257, B:130:0x0263, B:132:0x0266, B:110:0x0236, B:114:0x023c, B:53:0x0107, B:54:0x0111, B:45:0x00ee), top: B:221:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0329 A[Catch: Exception -> 0x00e2, RuntimeException -> 0x030f, TryCatch #6 {RuntimeException -> 0x030f, blocks: (B:58:0x0120, B:136:0x0273, B:150:0x02a3, B:165:0x030b, B:175:0x031b, B:173:0x0317, B:174:0x031a, B:176:0x0326, B:178:0x0329, B:180:0x0338, B:181:0x033e, B:183:0x0348, B:185:0x034b, B:186:0x034f, B:188:0x0352, B:190:0x035a, B:191:0x035d, B:192:0x037d, B:194:0x0380, B:195:0x0388, B:196:0x0394, B:197:0x0395, B:198:0x039c, B:149:0x0298, B:86:0x01fb, B:123:0x024e, B:128:0x025d, B:55:0x0112, B:57:0x011c, B:204:0x03a5, B:205:0x03a8), top: B:216:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0395 A[Catch: Exception -> 0x00e2, RuntimeException -> 0x030f, TryCatch #6 {RuntimeException -> 0x030f, blocks: (B:58:0x0120, B:136:0x0273, B:150:0x02a3, B:165:0x030b, B:175:0x031b, B:173:0x0317, B:174:0x031a, B:176:0x0326, B:178:0x0329, B:180:0x0338, B:181:0x033e, B:183:0x0348, B:185:0x034b, B:186:0x034f, B:188:0x0352, B:190:0x035a, B:191:0x035d, B:192:0x037d, B:194:0x0380, B:195:0x0388, B:196:0x0394, B:197:0x0395, B:198:0x039c, B:149:0x0298, B:86:0x01fb, B:123:0x024e, B:128:0x025d, B:55:0x0112, B:57:0x011c, B:204:0x03a5, B:205:0x03a8), top: B:216:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x027b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void verifySettings0(jakarta.mail.c0 r17, java.lang.String r18) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.MailHandler.verifySettings0(jakarta.mail.c0, java.lang.String):void");
    }

    /* JADX WARN: Finally extract failed */
    private AbstractC3682n writeLogRecords(int i10) {
        try {
            synchronized (this) {
                try {
                    if (this.size <= 0 || this.isWriting) {
                        return null;
                    }
                    this.isWriting = true;
                    try {
                        AbstractC3682n abstractC3682nWriteLogRecords0 = writeLogRecords0();
                        this.isWriting = false;
                        if (this.size > 0) {
                            reset();
                        }
                        return abstractC3682nWriteLogRecords0;
                    } catch (Throwable th2) {
                        this.isWriting = false;
                        if (this.size > 0) {
                            reset();
                        }
                        throw th2;
                    }
                } finally {
                }
            }
        } catch (RuntimeException e2) {
            reportError(e2.getMessage(), e2, i10);
            return null;
        } catch (Exception e10) {
            reportError(e10.getMessage(), e10, i10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.logging.LogRecord[]] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.logging.LogRecord] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [jakarta.mail.internet.n, jakarta.mail.internet.p, jakarta.mail.n] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.sun.mail.util.logging.MailHandler] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.logging.Filter[]] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.logging.Filter] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.logging.Filter] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.CharSequence] */
    private AbstractC3682n writeLogRecords0() throws IOException, MessagingException {
        C3663l c3663lCreateBodyPart;
        int i10;
        C3663l c3663l;
        boolean z6;
        sort();
        if (this.session == null) {
            initSession();
        }
        ?? c3665n = new C3665n(this.session);
        int length = this.attachmentFormatters.length;
        C3663l[] c3663lArr = new C3663l[length];
        StringBuilder[] sbArr = new StringBuilder[length];
        if (length == 0) {
            c3665n.setDescription(descriptionFrom(getFormatter(), getFilter(), this.subjectFormatter));
            c3663lCreateBodyPart = c3665n;
        } else {
            c3665n.setDescription(descriptionFrom(this.comparator, this.pushLevel, this.pushFilter));
            c3663lCreateBodyPart = createBodyPart();
        }
        appendSubject(c3665n, head(this.subjectFormatter));
        Formatter formatter = getFormatter();
        ?? filter = getFilter();
        C3663l c3663l2 = null;
        StringBuilder sb2 = null;
        Locale locale = null;
        int i11 = 0;
        while (i11 < this.size) {
            int i12 = this.matched[i11];
            ?? r14 = this.data;
            ?? r15 = r14[i11];
            r14[i11] = c3663l2;
            Locale localeLocaleFor = localeFor(r15);
            C3663l c3663l3 = c3663l2;
            appendSubject(c3665n, format(this.subjectFormatter, r15));
            if (filter == 0 || i12 == -1 || length == 0 || (i12 < -1 && filter.isLoggable(r15))) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                    sb2.append(head(formatter));
                }
                sb2.append(format(formatter, r15));
                if (localeLocaleFor != null && !localeLocaleFor.equals(locale)) {
                    appendContentLang(c3663lCreateBodyPart, localeLocaleFor);
                }
                c3663l = filter;
                z6 = true;
            } else {
                c3663l = c3663l3;
                z6 = false;
            }
            C3663l[] c3663lArr2 = c3663lArr;
            C3663l c3663l4 = c3663l;
            int i13 = 0;
            while (i13 < length) {
                StringBuilder[] sbArr2 = sbArr;
                ?? r42 = this.attachmentFilters[i13];
                if (r42 == 0 || c3663l4 == r42 || i12 == i13 || (i12 < i13 && r42.isLoggable(r15))) {
                    if (c3663l4 == null && r42 != 0) {
                        c3663l4 = r42;
                    }
                    if (c3663lArr2[i13] == null) {
                        c3663lArr2[i13] = createBodyPart(i13);
                        StringBuilder sb3 = new StringBuilder();
                        sbArr2[i13] = sb3;
                        sb3.append(head(this.attachmentFormatters[i13]));
                        appendFileName(c3663lArr2[i13], head(this.attachmentNames[i13]));
                    }
                    appendFileName(c3663lArr2[i13], format(this.attachmentNames[i13], r15));
                    sbArr2[i13].append(format(this.attachmentFormatters[i13], r15));
                    if (localeLocaleFor != null && !localeLocaleFor.equals(locale)) {
                        appendContentLang(c3663lArr2[i13], localeLocaleFor);
                    }
                    z6 = true;
                }
                i13++;
                sbArr = sbArr2;
            }
            StringBuilder[] sbArr3 = sbArr;
            if (!z6) {
                reportFilterError(r15);
            } else if (c3663lCreateBodyPart != c3665n && localeLocaleFor != null && !localeLocaleFor.equals(locale)) {
                appendContentLang(c3665n, localeLocaleFor);
            }
            i11++;
            locale = localeLocaleFor;
            c3663l2 = c3663l3;
            c3663lArr = c3663lArr2;
            sbArr = sbArr3;
        }
        C3663l[] c3663lArr3 = c3663lArr;
        ?? r19 = sbArr;
        C3663l c3663l5 = c3663l2;
        this.size = 0;
        for (int i14 = length - 1; i14 >= 0; i14--) {
            C3663l c3663l6 = c3663lArr3[i14];
            if (c3663l6 != null) {
                appendFileName(c3663l6, tail(this.attachmentNames[i14], "err"));
                r19[i14].append(tail(this.attachmentFormatters[i14], ""));
                if (r19[i14].length() > 0) {
                    String fileName = c3663lArr3[i14].getFileName();
                    if (isEmpty(fileName)) {
                        fileName = toString(this.attachmentFormatters[i14]);
                        c3663lArr3[i14].setFileName(fileName);
                    }
                    setContent(c3663lArr3[i14], r19[i14], getContentType(fileName));
                } else {
                    setIncompleteCopy(c3665n);
                    c3663lArr3[i14] = c3663l5;
                }
                r19[i14] = c3663l5;
            }
        }
        if (sb2 != null) {
            sb2.append(tail(formatter, ""));
            i10 = 0;
        } else {
            i10 = 0;
            sb2 = new StringBuilder(0);
        }
        appendSubject(c3665n, tail(this.subjectFormatter, ""));
        String strContentTypeOf = contentTypeOf(sb2);
        String strContentTypeOf2 = contentTypeOf(formatter);
        if (strContentTypeOf2 != null) {
            strContentTypeOf = strContentTypeOf2;
        }
        setContent(c3663lCreateBodyPart, sb2, strContentTypeOf);
        if (c3663lCreateBodyPart != c3665n) {
            C3666o c3666o = new C3666o();
            c3666o.mo8231a(c3663lCreateBodyPart);
            for (int i15 = i10; i15 < length; i15++) {
                C3663l c3663l7 = c3663lArr3[i15];
                if (c3663l7 != null) {
                    c3666o.mo8231a(c3663l7);
                }
            }
            c3665n.setContent(c3666o);
        }
        return c3665n;
    }

    @Override // java.util.logging.Handler
    public void close() throws SecurityException {
        AbstractC3682n abstractC3682nWriteLogRecords;
        try {
            checkAccess();
            synchronized (this) {
                try {
                    try {
                        abstractC3682nWriteLogRecords = writeLogRecords(3);
                        this.logLevel = Level.OFF;
                        int i10 = this.capacity;
                        if (i10 > 0) {
                            this.capacity = -i10;
                        }
                        if (this.size == 0 && this.data.length != 1) {
                            LogRecord[] logRecordArr = new LogRecord[1];
                            this.data = logRecordArr;
                            this.matched = new int[logRecordArr.length];
                        }
                    } catch (Throwable th2) {
                        this.logLevel = Level.OFF;
                        if (this.capacity > 0) {
                            this.capacity = -this.capacity;
                        }
                        if (this.size == 0 && this.data.length != 1) {
                            LogRecord[] logRecordArr2 = new LogRecord[1];
                            this.data = logRecordArr2;
                            this.matched = new int[logRecordArr2.length];
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (abstractC3682nWriteLogRecords != null) {
                send(abstractC3682nWriteLogRecords, false, 3);
            }
        } catch (LinkageError e2) {
            reportLinkageError(e2, 3);
        }
    }

    public final String contentTypeOf(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return null;
        }
        if (charSequence.length() > 25) {
            charSequence = charSequence.subSequence(0, 25);
        }
        try {
            return URLConnection.guessContentTypeFromStream(new ByteArrayInputStream(charSequence.toString().getBytes(getEncodingName())));
        } catch (IOException e2) {
            reportError(e2.getMessage(), e2, 5);
            return null;
        }
    }

    @Override // java.util.logging.Handler
    public void flush() {
        push(false, 2);
    }

    public final Filter[] getAttachmentFilters() {
        return (Filter[]) readOnlyAttachmentFilters().clone();
    }

    public final Formatter[] getAttachmentFormatters() {
        Formatter[] formatterArr;
        synchronized (this) {
            formatterArr = this.attachmentFormatters;
        }
        return (Formatter[]) formatterArr.clone();
    }

    public final Formatter[] getAttachmentNames() {
        Formatter[] formatterArr;
        synchronized (this) {
            formatterArr = this.attachmentNames;
        }
        return (Formatter[]) formatterArr.clone();
    }

    public final synchronized AbstractC3634b getAuthenticator() {
        checkAccess();
        return this.auth;
    }

    public final synchronized int getCapacity() {
        return Math.abs(this.capacity);
    }

    public final synchronized Comparator<? super LogRecord> getComparator() {
        return this.comparator;
    }

    @Override // java.util.logging.Handler
    public synchronized String getEncoding() {
        return this.encoding;
    }

    @Override // java.util.logging.Handler
    public ErrorManager getErrorManager() throws SecurityException {
        checkAccess();
        return this.errorManager;
    }

    @Override // java.util.logging.Handler
    public Filter getFilter() {
        return this.filter;
    }

    @Override // java.util.logging.Handler
    public synchronized Formatter getFormatter() {
        return this.formatter;
    }

    @Override // java.util.logging.Handler
    public Level getLevel() {
        return this.logLevel;
    }

    public final Properties getMailProperties() throws SecurityException {
        Properties properties;
        checkAccess();
        synchronized (this) {
            properties = this.mailProps;
        }
        return (Properties) properties.clone();
    }

    public final synchronized Filter getPushFilter() {
        return this.pushFilter;
    }

    public final synchronized Level getPushLevel() {
        return this.pushLevel;
    }

    public final synchronized Formatter getSubject() {
        return this.subjectFormatter;
    }

    @Override // java.util.logging.Handler
    public boolean isLoggable(LogRecord logRecord) {
        int iIntValue;
        if (logRecord == null || logRecord.getLevel().intValue() < (iIntValue = getLevel().intValue()) || iIntValue == offValue) {
            return false;
        }
        Filter filter = getFilter();
        if (filter != null && !filter.isLoggable(logRecord)) {
            return isAttachmentLoggable(logRecord);
        }
        setMatchedPart(-1);
        return true;
    }

    public final boolean isMissingContent(AbstractC3682n abstractC3682n, Throwable th2) {
        Object andSetContextClassLoader = getAndSetContextClassLoader(MAILHANDLER_LOADER);
        try {
            try {
                try {
                    abstractC3682n.writeTo(new ByteArrayOutputStream(1024));
                } catch (Exception e2) {
                    String message = e2.getMessage();
                    if (!isEmpty(message)) {
                        int i10 = 0;
                        while (th2 != null) {
                            if (e2.getClass() == th2.getClass() && message.equals(th2.getMessage())) {
                                getAndSetContextClassLoader(andSetContextClassLoader);
                                return true;
                            }
                            Throwable cause = th2.getCause();
                            th2 = (cause == null && (th2 instanceof MessagingException)) ? ((MessagingException) th2).getNextException() : cause;
                            i10++;
                            if (i10 == 65536) {
                                break;
                            }
                        }
                    }
                }
                getAndSetContextClassLoader(andSetContextClassLoader);
                return false;
            } catch (RuntimeException e10) {
                throw e10;
            }
        } catch (Throwable th3) {
            getAndSetContextClassLoader(andSetContextClassLoader);
            throw th3;
        }
    }

    public void preDestroy() {
        push(false, 3);
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        if (!tryMutex()) {
            reportUnPublishedError(logRecord);
            return;
        }
        try {
            try {
                if (isLoggable(logRecord)) {
                    if (logRecord != null) {
                        logRecord.getSourceMethodName();
                        publish0(logRecord);
                    } else {
                        reportNullError(1);
                    }
                }
            } catch (LinkageError e2) {
                reportLinkageError(e2, 1);
            }
            releaseMutex();
        } catch (Throwable th2) {
            releaseMutex();
            throw th2;
        }
    }

    public void push() {
        push(true, 2);
    }

    @Override // java.util.logging.Handler
    public void reportError(String str, Exception exc, int i10) {
        try {
            if (str != null) {
                this.errorManager.error(Level.SEVERE.getName().concat(": ").concat(str), exc, i10);
            } else {
                this.errorManager.error(null, exc, i10);
            }
        } catch (LinkageError e2) {
            e = e2;
            reportLinkageError(e, i10);
        } catch (RuntimeException e10) {
            e = e10;
            reportLinkageError(e, i10);
        }
    }

    public final void setAttachmentFilters(Filter... filterArr) throws SecurityException {
        checkAccess();
        Filter[] filterArrEmptyFilterArray = filterArr.length == 0 ? emptyFilterArray() : (Filter[]) Arrays.copyOf(filterArr, filterArr.length, Filter[].class);
        synchronized (this) {
            try {
                Formatter[] formatterArr = this.attachmentFormatters;
                if (formatterArr.length != filterArrEmptyFilterArray.length) {
                    throw attachmentMismatch(formatterArr.length, filterArrEmptyFilterArray.length);
                }
                if (this.isWriting) {
                    throw new IllegalStateException();
                }
                if (this.size != 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= filterArrEmptyFilterArray.length) {
                            break;
                        }
                        if (filterArrEmptyFilterArray[i10] != this.attachmentFilters[i10]) {
                            clearMatches(i10);
                            break;
                        }
                        i10++;
                    }
                }
                this.attachmentFilters = filterArrEmptyFilterArray;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setAttachmentFormatters(Formatter... formatterArr) throws SecurityException {
        Formatter[] formatterArrEmptyFormatterArray;
        checkAccess();
        if (formatterArr.length == 0) {
            formatterArrEmptyFormatterArray = emptyFormatterArray();
        } else {
            formatterArrEmptyFormatterArray = (Formatter[]) Arrays.copyOf(formatterArr, formatterArr.length, Formatter[].class);
            for (int i10 = 0; i10 < formatterArrEmptyFormatterArray.length; i10++) {
                if (formatterArrEmptyFormatterArray[i10] == null) {
                    throw new NullPointerException(atIndexMsg(i10));
                }
            }
        }
        synchronized (this) {
            try {
                if (this.isWriting) {
                    throw new IllegalStateException();
                }
                this.attachmentFormatters = formatterArrEmptyFormatterArray;
                alignAttachmentFilters();
                alignAttachmentNames();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setAttachmentNames(String... strArr) throws SecurityException {
        checkAccess();
        Formatter[] formatterArrEmptyFormatterArray = strArr.length == 0 ? emptyFormatterArray() : new Formatter[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (str == null) {
                throw new NullPointerException(atIndexMsg(i10));
            }
            if (str.length() <= 0) {
                throw new IllegalArgumentException(atIndexMsg(i10));
            }
            formatterArrEmptyFormatterArray[i10] = TailNameFormatter.of(str);
        }
        synchronized (this) {
            try {
                Formatter[] formatterArr = this.attachmentFormatters;
                if (formatterArr.length != strArr.length) {
                    throw attachmentMismatch(formatterArr.length, strArr.length);
                }
                if (this.isWriting) {
                    throw new IllegalStateException();
                }
                this.attachmentNames = formatterArrEmptyFormatterArray;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setAuthenticator(AbstractC3634b abstractC3634b) throws Exception {
        setAuthenticator0(abstractC3634b);
    }

    public final synchronized void setComparator(Comparator<? super LogRecord> comparator) {
        checkAccess();
        if (this.isWriting) {
            throw new IllegalStateException();
        }
        this.comparator = comparator;
    }

    @Override // java.util.logging.Handler
    public void setEncoding(String str) throws SecurityException, UnsupportedEncodingException {
        checkAccess();
        setEncoding0(str);
    }

    @Override // java.util.logging.Handler
    public void setErrorManager(ErrorManager errorManager) throws SecurityException {
        checkAccess();
        setErrorManager0(errorManager);
    }

    @Override // java.util.logging.Handler
    public void setFilter(Filter filter) throws SecurityException {
        checkAccess();
        synchronized (this) {
            try {
                if (filter != this.filter) {
                    clearMatches(-1);
                }
                this.filter = filter;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.logging.Handler
    public synchronized void setFormatter(Formatter formatter) {
        checkAccess();
        if (formatter == null) {
            throw new NullPointerException();
        }
        this.formatter = formatter;
    }

    @Override // java.util.logging.Handler
    public void setLevel(Level level) throws SecurityException {
        level.getClass();
        checkAccess();
        synchronized (this) {
            try {
                if (this.capacity > 0) {
                    this.logLevel = level;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setMailProperties(Properties properties) throws Exception {
        setMailProperties0(properties);
    }

    public final synchronized void setPushFilter(Filter filter) {
        checkAccess();
        if (this.isWriting) {
            throw new IllegalStateException();
        }
        this.pushFilter = filter;
    }

    public final synchronized void setPushLevel(Level level) {
        checkAccess();
        if (level == null) {
            throw new NullPointerException();
        }
        if (this.isWriting) {
            throw new IllegalStateException();
        }
        this.pushLevel = level;
    }

    public final void setSubject(String str) throws SecurityException {
        if (str != null) {
            setSubject(TailNameFormatter.of(str));
        } else {
            checkAccess();
            throw null;
        }
    }

    private static RuntimeException attachmentMismatch(int i10, int i11) {
        return attachmentMismatch("Attachments mismatched, expected " + i10 + " but given " + i11 + '.');
    }

    private void push(boolean z6, int i10) {
        try {
            if (!tryMutex()) {
                reportUnPublishedError(null);
                return;
            }
            try {
                AbstractC3682n abstractC3682nWriteLogRecords = writeLogRecords(i10);
                if (abstractC3682nWriteLogRecords != null) {
                    send(abstractC3682nWriteLogRecords, z6, i10);
                }
            } catch (LinkageError e2) {
                reportLinkageError(e2, i10);
            }
        } finally {
            releaseMutex();
        }
    }

    public final void setAuthenticator(char... cArr) throws Exception {
        if (cArr == null) {
            setAuthenticator0(null);
        } else {
            setAuthenticator0(DefaultAuthenticator.of(new String(cArr)));
        }
    }

    public final void setSubject(Formatter formatter) throws SecurityException {
        checkAccess();
        formatter.getClass();
        synchronized (this) {
            try {
                if (!this.isWriting) {
                    this.subjectFormatter = formatter;
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void reportError(AbstractC3682n abstractC3682n, Exception exc, int i10) {
        try {
            try {
                this.errorManager.error(toRawString(abstractC3682n), exc, i10);
            } catch (RuntimeException e2) {
                reportError(toMsgString(e2), exc, i10);
            } catch (Exception e10) {
                reportError(toMsgString(e10), exc, i10);
            }
        } catch (LinkageError e11) {
            reportLinkageError(e11, i10);
        }
    }

    public MailHandler(int i10) {
        init(null);
        this.sealed = true;
        setCapacity0(i10);
    }

    private C3663l createBodyPart(int i10) throws MessagingException {
        C3663l c3663l = new C3663l();
        C3663l.setDisposition(c3663l, "attachment");
        c3663l.setDescription(descriptionFrom(this.attachmentFormatters[i10], this.attachmentFilters[i10], this.attachmentNames[i10]));
        setAcceptLang(c3663l);
        return c3663l;
    }

    private String descriptionFrom(Formatter formatter, Filter filter, Formatter formatter2) {
        String name;
        StringBuilder sb2 = new StringBuilder("Formatted using ");
        sb2.append(getClassId(formatter));
        sb2.append(", filtered with ");
        if (filter == null) {
            name = "no filter";
        } else {
            name = filter.getClass().getName();
        }
        sb2.append(name);
        sb2.append(", and named by ");
        return AbstractC0030c.m123n(sb2, getClassId(formatter2), '.');
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        r7 = r7.getSuperclass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String contentTypeOf(java.util.logging.Formatter r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L67
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = r6.getContentType(r0)
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.Class r7 = r7.getClass()
        L15:
            java.lang.Class<java.util.logging.Formatter> r0 = java.util.logging.Formatter.class
            if (r7 == r0) goto L67
            java.lang.String r0 = r7.getSimpleName()     // Catch: java.lang.InternalError -> L1e
            goto L22
        L1e:
            java.lang.String r0 = r7.getName()
        L22:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r1)
            r1 = 36
            int r1 = r0.indexOf(r1)
            r2 = 1
            int r1 = r1 + r2
        L30:
            java.lang.String r3 = "ml"
            int r1 = r0.indexOf(r3, r1)
            r3 = -1
            if (r1 <= r3) goto L62
            if (r1 <= 0) goto L5f
            int r3 = r1 + (-1)
            char r4 = r0.charAt(r3)
            r5 = 120(0x78, float:1.68E-43)
            if (r4 != r5) goto L48
            java.lang.String r7 = "application/xml"
            return r7
        L48:
            if (r1 <= r2) goto L5f
            int r4 = r1 + (-2)
            char r4 = r0.charAt(r4)
            r5 = 104(0x68, float:1.46E-43)
            if (r4 != r5) goto L5f
            char r3 = r0.charAt(r3)
            r4 = 116(0x74, float:1.63E-43)
            if (r3 != r4) goto L5f
            java.lang.String r7 = "text/html"
            return r7
        L5f:
            int r1 = r1 + 2
            goto L30
        L62:
            java.lang.Class r7 = r7.getSuperclass()
            goto L15
        L67:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.MailHandler.contentTypeOf(java.util.logging.Formatter):java.lang.String");
    }

    public MailHandler(Properties properties) throws Exception {
        properties.getClass();
        init(properties);
        this.sealed = true;
        setMailProperties0(properties);
    }

    public final void setAttachmentNames(Formatter... formatterArr) throws SecurityException {
        Formatter[] formatterArrEmptyFormatterArray;
        checkAccess();
        if (formatterArr.length == 0) {
            formatterArrEmptyFormatterArray = emptyFormatterArray();
        } else {
            formatterArrEmptyFormatterArray = (Formatter[]) Arrays.copyOf(formatterArr, formatterArr.length, Formatter[].class);
        }
        for (int i10 = 0; i10 < formatterArrEmptyFormatterArray.length; i10++) {
            if (formatterArrEmptyFormatterArray[i10] == null) {
                throw new NullPointerException(atIndexMsg(i10));
            }
        }
        synchronized (this) {
            try {
                Formatter[] formatterArr2 = this.attachmentFormatters;
                if (formatterArr2.length == formatterArrEmptyFormatterArray.length) {
                    if (!this.isWriting) {
                        this.attachmentNames = formatterArrEmptyFormatterArray;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw attachmentMismatch(formatterArr2.length, formatterArrEmptyFormatterArray.length);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void postConstruct() {
    }

    private Object intern(Map<Object, Object> map, Object obj) {
        if (obj == null) {
            return null;
        }
        Object objNewInstance = obj.getClass().getName().equals(TailNameFormatter.class.getName()) ? obj : obj.getClass().getConstructor(null).newInstance(null);
        if (objNewInstance.getClass() == obj.getClass()) {
            Object obj2 = map.get(objNewInstance);
            if (obj2 == null) {
                boolean zEquals = objNewInstance.equals(obj);
                boolean zEquals2 = obj.equals(objNewInstance);
                if (zEquals && zEquals2) {
                    Object objPut = map.put(obj, obj);
                    if (objPut != null) {
                        reportNonDiscriminating(objNewInstance, objPut);
                        Object objRemove = map.remove(objNewInstance);
                        if (objRemove != obj) {
                            reportNonDiscriminating(objNewInstance, objRemove);
                            map.clear();
                            return obj;
                        }
                    }
                } else if (zEquals != zEquals2) {
                    reportNonSymmetric(obj, objNewInstance);
                    return obj;
                }
            } else {
                if (obj.getClass() == obj2.getClass()) {
                    return obj2;
                }
                reportNonDiscriminating(obj, obj2);
            }
        }
        return obj;
    }
}
