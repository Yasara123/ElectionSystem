/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-11-04 08:08:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.eventstream;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.analytics.stream.persistence.stub.EventStreamPersistenceAdminServiceStub;
import org.wso2.carbon.event.stream.stub.EventStreamAdminServiceStub;
import org.wso2.carbon.event.stream.stub.types.EventStreamInfoDto;
import org.wso2.carbon.event.stream.ui.EventStreamUIUtils;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/tlds/carbontags.tld", Long.valueOf(1438165494000L));
    _jspx_dependants.put("/WEB-INF/tlds/fmt.tld", Long.valueOf(1438165494000L));
    _jspx_dependants.put("/WEB-INF/tlds/c.tld", Long.valueOf(1438165494000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.release();
    _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_005fbundle_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_005fbundle_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fbundle_005f0.setParent(null);
      // /eventstream/index.jsp(27,0) name = basename type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fbundle_005f0.setBasename("org.wso2.carbon.event.stream.ui.i18n.Resources");
      int _jspx_eval_fmt_005fbundle_005f0 = _jspx_th_fmt_005fbundle_005f0.doStartTag();
      if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_fmt_005fbundle_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_fmt_005fbundle_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\n");
          out.write("    ");
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_005fbreadcrumb_005f0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_005fbreadcrumb_005f0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_005fbreadcrumb_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
          // /eventstream/index.jsp(29,4) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_carbon_005fbreadcrumb_005f0.setLabel("eventstream.list");
          // /eventstream/index.jsp(29,4) name = resourceBundle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_carbon_005fbreadcrumb_005f0.setResourceBundle("org.wso2.carbon.event.stream.ui.i18n.Resources");
          // /eventstream/index.jsp(29,4) name = topPage type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_carbon_005fbreadcrumb_005f0.setTopPage(false);
          // /eventstream/index.jsp(29,4) name = request type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_carbon_005fbreadcrumb_005f0.setRequest(request);
          int _jspx_eval_carbon_005fbreadcrumb_005f0 = _jspx_th_carbon_005fbreadcrumb_005f0.doStartTag();
          if (_jspx_th_carbon_005fbreadcrumb_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.reuse(_jspx_th_carbon_005fbreadcrumb_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.reuse(_jspx_th_carbon_005fbreadcrumb_005f0);
          out.write("\n");
          out.write("\n");
          out.write("    <script type=\"text/javascript\" src=\"../admin/js/breadcrumbs.js\"></script>\n");
          out.write("    <script type=\"text/javascript\" src=\"../admin/js/cookies.js\"></script>\n");
          out.write("    <script type=\"text/javascript\" src=\"../admin/js/main.js\"></script>\n");
          out.write("\n");
          out.write("    <script type=\"text/javascript\">\n");
          out.write("\n");
          out.write("        var ENABLE = \"enable\";\n");
          out.write("        var DISABLE = \"disable\";\n");
          out.write("        var STAT = \"statistics\";\n");
          out.write("        var TRACE = \"Tracing\";\n");
          out.write("\n");
          out.write("        function doDelete(eventStreamName, eventStreamVersion) {\n");
          out.write("            CARBON.showConfirmationDialog(\n");
          out.write("                    \"If event stream is deleted then other artifacts using this stream will go into inactive state! Are you sure want to delete?\", function () {\n");
          out.write("                        var theform = document.getElementById('deleteForm');\n");
          out.write("                        theform.eventStream.value = eventStreamName;\n");
          out.write("                        theform.eventStreamVersion.value = eventStreamVersion;\n");
          out.write("                        theform.submit();\n");
          out.write("                    }, null, null);\n");
          out.write("        }\n");
          out.write("\n");
          out.write("    </script>\n");
          out.write("    ");

        EventStreamAdminServiceStub stub = EventStreamUIUtils.getEventStreamAdminService(config, session, request);
        String eventStreamName = request.getParameter("eventStream");
        String eventStreamVersion = request.getParameter("eventStreamVersion");
        int totalEventStreams = 0;
        if (eventStreamName != null && eventStreamVersion != null) {
            stub.removeEventStreamDefinition(eventStreamName, eventStreamVersion);
    
          out.write("\n");
          out.write("    <script type=\"text/javascript\">CARBON.showInfoDialog('Event Stream successfully deleted.');</script>\n");
          out.write("    ");

        }

        EventStreamInfoDto[] eventStreamDetailsArray = stub.getAllEventStreamDefinitionDto();
        if (eventStreamDetailsArray != null) {
            totalEventStreams = eventStreamDetailsArray.length;
        }

        EventStreamPersistenceAdminServiceStub persistenceAdminServiceStub =
                EventStreamUIUtils.getEventStreamPersistenceAdminService(config, session, request);
        pageContext.setAttribute("isAnalyticsPersistenceBackendAvailable",
                                 EventStreamUIUtils.isEventStreamPersistenceAdminServiceAvailable(persistenceAdminServiceStub),
                                 PageContext.APPLICATION_SCOPE);

    
          out.write("\n");
          out.write("\n");
          out.write("    <div id=\"middle\">\n");
          out.write("        <h2>");
          if (_jspx_meth_fmt_005fmessage_005f0(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
            return;
          out.write("</h2>\n");
          out.write("\n");
          out.write("        <a href=\"create_event_stream.jsp?ordinal=1\"\n");
          out.write("           style=\"background-image:url(images/add.gif);\"\n");
          out.write("           class=\"icon-link\">\n");
          out.write("            Add Event Stream\n");
          out.write("        </a>\n");
          out.write("\n");
          out.write("        <br/>\n");
          out.write("        <br/>\n");
          out.write("\n");
          out.write("        <div id=\"workArea\">\n");
          out.write("\n");
          out.write("            ");
          out.print(totalEventStreams);
          out.write(' ');
          if (_jspx_meth_fmt_005fmessage_005f1(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            <br/><br/>\n");
          out.write("            <table class=\"styledLeft\">\n");
          out.write("                ");


                    if (eventStreamDetailsArray != null) {
                
          out.write("\n");
          out.write("                <thead>\n");
          out.write("                <tr>\n");
          out.write("                    <th>");
          if (_jspx_meth_fmt_005fmessage_005f2(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("                    <th>");
          if (_jspx_meth_fmt_005fmessage_005f3(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("                    <th width=\"30%\">");
          if (_jspx_meth_fmt_005fmessage_005f4(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("                </tr>\n");
          out.write("                </thead>\n");
          out.write("                <tbody>\n");
          out.write("                ");

                    for (EventStreamInfoDto eventStreamInfoDto : eventStreamDetailsArray) {
                        String eventStreamWithVersion = eventStreamInfoDto.getStreamName() + ":" + eventStreamInfoDto.getStreamVersion();
                
          out.write("\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        <a href=\"eventStreamDetails.jsp?ordinal=1&eventStreamWithVersion=");
          out.print(eventStreamWithVersion);
          out.write('"');
          out.write('>');
          out.print(eventStreamWithVersion);
          out.write("\n");
          out.write("                        </a>\n");
          out.write("                    </td>\n");
          out.write("                    <td>");
          out.print( eventStreamInfoDto.getStreamDescription() != null ? eventStreamInfoDto.getStreamDescription() : "" );
          out.write("\n");
          out.write("                    </td>\n");
          out.write("                    <td>\n");
          out.write("\n");
          out.write("                        <a style=\"background-image: url(images/event-simulator.png);\"\n");
          out.write("                           class=\"icon-link\"\n");
          out.write("                           href = \"../eventsimulator/index.jsp?streamId=");
          out.print(eventStreamInfoDto.getStreamName());
          out.write(':');
          out.print(eventStreamInfoDto.getStreamVersion());
          out.write("\"<font\n");
          out.write("                                color=\"#4682b4\">Simulate</font></a>\n");
          out.write("                        ");

                            if (eventStreamInfoDto.getEditable()) {
                        
          out.write("\n");
          out.write("\n");
          out.write("                        <a style=\"background-image: url(../admin/images/delete.gif);\"\n");
          out.write("                           class=\"icon-link\"\n");
          out.write("                           onclick=\"doDelete('");
          out.print(eventStreamInfoDto.getStreamName());
          out.write('\'');
          out.write(',');
          out.write('\'');
          out.print(eventStreamInfoDto.getStreamVersion());
          out.write("')\"><font\n");
          out.write("                                color=\"#4682b4\">Delete</font></a>\n");
          out.write("\n");
          out.write("                        <a style=\"background-image: url(../admin/images/edit.gif);\"\n");
          out.write("                           class=\"icon-link\"\n");
          out.write("                           href=\"edit_event_stream.jsp?ordinal=1&eventStreamWithVersion=");
          out.print(eventStreamWithVersion);
          out.write("\"><font\n");
          out.write("                                color=\"#4682b4\">Edit</font></a>\n");
          out.write("                        ");

                            }
                        
          out.write("\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                </tbody>\n");
          out.write("                ");

                    }

                } else {
                
          out.write("\n");
          out.write("\n");
          out.write("                <tbody>\n");
          out.write("                <tr>\n");
          out.write("                    <td class=\"formRaw\">\n");
          out.write("                        <table id=\"noEventStreamInputTable\" class=\"normal-nopadding\"\n");
          out.write("                               style=\"width:100%\">\n");
          out.write("                            <tbody>\n");
          out.write("\n");
          out.write("                            <tr>\n");
          out.write("                                <td class=\"leftCol-med\" colspan=\"2\">");
          if (_jspx_meth_fmt_005fmessage_005f5(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            </tbody>\n");
          out.write("                        </table>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                </tbody>\n");
          out.write("                ");

                    }
                
          out.write("\n");
          out.write("\n");
          out.write("            </table>\n");
          out.write("\n");
          out.write("            <div>\n");
          out.write("                <br/>\n");
          out.write("\n");
          out.write("                <form id=\"deleteForm\" name=\"input\" action=\"\" method=\"post\"><input type=\"HIDDEN\"\n");
          out.write("                                                                                 name=\"eventStream\"\n");
          out.write("                                                                                 value=\"\"/>\n");
          out.write("                    <input type=\"HIDDEN\"\n");
          out.write("                           name=\"eventStreamVersion\"\n");
          out.write("                           value=\"\"/>\n");
          out.write("                </form>\n");
          out.write("\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("\n");
          out.write("    <script type=\"text/javascript\">\n");
          out.write("        alternateTableRows('expiredsubscriptions', 'tableEvenRow', 'tableOddRow');\n");
          out.write("        alternateTableRows('validsubscriptions', 'tableEvenRow', 'tableOddRow');\n");
          out.write("    </script>\n");
          out.write("\n");
          int evalDoAfterBody = _jspx_th_fmt_005fbundle_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_fmt_005fbundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.reuse(_jspx_th_fmt_005fbundle_005f0);
        return;
      }
      _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.reuse(_jspx_th_fmt_005fbundle_005f0);
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
    // /eventstream/index.jsp(83,12) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setKey("available.event.streams");
    int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
    // /eventstream/index.jsp(96,35) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f1.setKey("total.event.streams");
    int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
    // /eventstream/index.jsp(106,24) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f2.setKey("event.stream.id");
    int _jspx_eval_fmt_005fmessage_005f2 = _jspx_th_fmt_005fmessage_005f2.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
    // /eventstream/index.jsp(107,24) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f3.setKey("event.stream.description");
    int _jspx_eval_fmt_005fmessage_005f3 = _jspx_th_fmt_005fmessage_005f3.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f3);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
    // /eventstream/index.jsp(108,36) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f4.setKey("actions");
    int _jspx_eval_fmt_005fmessage_005f4 = _jspx_th_fmt_005fmessage_005f4.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
    // /eventstream/index.jsp(162,68) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f5.setKey("empty.event.stream.msg");
    int _jspx_eval_fmt_005fmessage_005f5 = _jspx_th_fmt_005fmessage_005f5.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
    return false;
  }
}