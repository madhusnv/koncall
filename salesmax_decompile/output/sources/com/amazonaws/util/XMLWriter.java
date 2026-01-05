package com.amazonaws.util;

import com.amazonaws.AmazonClientException;
import com.amplifyframework.core.model.ModelIdentifier;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.Stack;

/* loaded from: classes5.dex */
public class XMLWriter {
    private static final String PROLOG = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
    private Stack<String> elementStack;
    private boolean rootElement;
    private final Writer writer;
    private final String xmlns;

    public XMLWriter(Writer writer) {
        this(writer, null);
    }

    private void append(String str) throws IOException {
        try {
            this.writer.append((CharSequence) str);
        } catch (IOException e) {
            throw new AmazonClientException("Unable to write XML document", e);
        }
    }

    private String escapeXMLEntities(String str) {
        if (str.contains("&")) {
            str = str.replace("&quot;", ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR).replace("&apos;", "'").replace("&lt;", "<").replace("&gt;", ">").replace("&amp;", "&");
        }
        return str.replace("&", "&amp;").replace(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "&quot;").replace("'", "&apos;").replace("<", "&lt;").replace(">", "&gt;");
    }

    public XMLWriter endElement() throws IOException {
        append("</" + this.elementStack.pop() + ">");
        return this;
    }

    public XMLWriter startElement(String str) throws IOException {
        append("<" + str);
        if (this.rootElement && this.xmlns != null) {
            append(" xmlns=\"" + this.xmlns + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            this.rootElement = false;
        }
        append(">");
        this.elementStack.push(str);
        return this;
    }

    public XMLWriter value(String str) throws IOException {
        append(escapeXMLEntities(str));
        return this;
    }

    public XMLWriter(Writer writer, String str) throws IOException {
        this.elementStack = new Stack<>();
        this.rootElement = true;
        this.writer = writer;
        this.xmlns = str;
        append(PROLOG);
    }

    public XMLWriter value(Date date) throws IOException {
        append(escapeXMLEntities(StringUtils.fromDate(date)));
        return this;
    }

    public XMLWriter value(Object obj) throws IOException {
        append(escapeXMLEntities(obj.toString()));
        return this;
    }
}
