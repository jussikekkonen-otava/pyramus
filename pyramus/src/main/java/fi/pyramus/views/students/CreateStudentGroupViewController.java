package fi.pyramus.views.students;

import java.util.Locale;

import fi.internetix.smvc.controllers.PageRequestContext;
import fi.pyramus.I18N.Messages;
import fi.pyramus.breadcrumbs.Breadcrumbable;
import fi.pyramus.domainmodel.users.Role;
import fi.pyramus.framework.PyramusViewController;
import fi.pyramus.framework.UserRole;

/**
 * The controller responsible of the Create StudentGroup view of the application.
 * 
 * @see fi.pyramus.json.students.CreateStudentGroupJSONRequestController
 */
public class CreateStudentGroupViewController extends PyramusViewController implements Breadcrumbable {

  /**
   * Processes the page request by including the corresponding JSP page to the response.
   * 
   * @param pageRequestContext Page request context
   */
  public void process(PageRequestContext pageRequestContext) {
    pageRequestContext.setIncludeJSP("/templates/students/createstudentgroup.jsp");
  }

  /**
   * Returns the roles allowed to access this page. Creating student groups is available for users with
   * {@link Role#MANAGER} or {@link Role#ADMINISTRATOR} privileges.
   * 
   * @return The roles allowed to access this page
   */
  public UserRole[] getAllowedRoles() {
    return new UserRole[] { UserRole.MANAGER, UserRole.ADMINISTRATOR };
  }

  /**
   * Returns the localized name of this page. Used e.g. for breadcrumb navigation.
   * 
   * @param locale The locale to be used for the name
   * 
   * @return The localized name of this page
   */
  public String getName(Locale locale) {
    return Messages.getInstance().getText(locale, "students.createStudentGroup.pageTitle");
  }

}
