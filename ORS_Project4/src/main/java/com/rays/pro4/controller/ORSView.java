package com.rays.pro4.controller;

/**
 * @author Pooja Jawariya
 *
 */
public interface ORSView {

	public String APP_CONTEXT = "/ORS_Project4";
	public String LAYOUT_VIEW = "/BaseLayout.jsp";
	public static String PAGE_FOLDER = "/jsp";
	public String JAVA_DOC_VIEW = APP_CONTEXT + "/doc/index.html";

	public String MARKSHEET_VIEW = PAGE_FOLDER + "/MarksheetView.jsp";
	public String MARKSHEET_LIST_VIEW = PAGE_FOLDER + "/MarksheetListView.jsp";
	public String GET_MARKSHEET_VIEW = PAGE_FOLDER + "/GetMarksheetView.jsp";
	public String USER_VIEW = PAGE_FOLDER + "/UserView.jsp";
	public String USER_LIST_VIEW = PAGE_FOLDER + "/UserListView.jsp";
	public String COLLEGE_VIEW = PAGE_FOLDER + "/CollegeView.jsp";
	public String COLLEGE_LIST_VIEW = PAGE_FOLDER + "/CollegeListView.jsp";
	public String STUDENT_VIEW = PAGE_FOLDER + "/StudentView.jsp";
	public String STUDENT_LIST_VIEW = PAGE_FOLDER + "/StudentListView.jsp";
	public String ROLE_VIEW = PAGE_FOLDER + "/RoleView.jsp";
	public String ROLE_LIST_VIEW = PAGE_FOLDER + "/RoleListView.jsp";
	public String USER_REGISTRATION_VIEW = PAGE_FOLDER + "/UserRegistrationView.jsp";
	public String LOGIN_VIEW = PAGE_FOLDER + "/LoginView.jsp";
	public static String WELCOME_VIEW = PAGE_FOLDER + "/Welcome.jsp";
	public String CHANGE_PASSWORD_VIEW = PAGE_FOLDER + "/ChangePasswordView.jsp";
	public String MY_PROFILE_VIEW = PAGE_FOLDER + "/MyProfileView.jsp";
	public String FORGET_PASSWORD_VIEW = PAGE_FOLDER + "/ForgetPasswordView.jsp";
	public String MARKSHEET_MERIT_LIST_VIEW = PAGE_FOLDER + "/MarksheetMeritListView.jsp";
	public String COURSE_VIEW = PAGE_FOLDER + "/CourseView.jsp";
	public String COURSE_LIST_VIEW = PAGE_FOLDER + "/CourseListView.jsp";
	public String FACULTY_VIEW = PAGE_FOLDER + "/FacultyView.jsp";
	public String FACULTY_LIST_VIEW = PAGE_FOLDER + "/FacultyListView.jsp";
	public String SUBJECT_VIEW = PAGE_FOLDER + "/SubjectView.jsp";
	public String SUBJECT_LIST_VIEW = PAGE_FOLDER + "/SubjectListView.jsp";
	public String TIMETABLE_VIEW = PAGE_FOLDER + "/TimetableView.jsp";
	public String TIMETABLE_LIST_VIEW = PAGE_FOLDER + "/TimetableListView.jsp";
	public String ERROR_VIEW = PAGE_FOLDER + "/ErrorView.jsp";
	public String BANK_VIEW = PAGE_FOLDER + "/BankView.jsp";
	public String BANK_LIST_VIEW = PAGE_FOLDER + "/BankListView.jsp";
	public String ABC_LIST_VIEW = PAGE_FOLDER + "/AbcListView.jsp";
	public String ABC_VIEW = PAGE_FOLDER + "/AbcView.jsp";
	public String DOCTOR_VIEW = PAGE_FOLDER + "/DoctorView.jsp";
	public String DOCTOR_LIST_VIEW = PAGE_FOLDER + "/DoctorListView.jsp";

	public String PRODUCT_VIEW = PAGE_FOLDER + "/ProductView.jsp";
	public String PRODUCT_LIST_VIEW = PAGE_FOLDER + "/ProductListView.jsp";
	public String CAR_VIEW = PAGE_FOLDER + "/CarView.jsp";
	public String CAR_LIST_VIEW = PAGE_FOLDER + "/CarListView.jsp";
	public String FIELD_VIEW = PAGE_FOLDER + "/FieldView.jsp";

	public String FIELD_LIST_VIEW = PAGE_FOLDER + "/FieldListView.jsp";
	public String TRANSACTION_VIEW = PAGE_FOLDER + "/TransactionView.jsp";

	public String TRANSACTION_LIST_VIEW = PAGE_FOLDER + "/TransactionListView.jsp";

	public String CUSTOMERS_VIEW = PAGE_FOLDER + "/CustomersView.jsp";

	public String CUSTOMERS_LIST_VIEW = PAGE_FOLDER + "/CustomersListView.jsp";
	
	public String SALARY_VIEW = PAGE_FOLDER + "/SalaryView.jsp";

	public String SALARY_LIST_VIEW = PAGE_FOLDER + "/SalaryListView.jsp";

	
	

	// public String ERROR_VIEW5 = PAGE_FOLDER + "/ErrorView5.jsp";

	public String MARKSHEET_CTL = APP_CONTEXT + "/ctl/MarksheetCtl";
	public String MARKSHEET_LIST_CTL = APP_CONTEXT + "/ctl/MarksheetListCtl";
	public String BANK_CTL = APP_CONTEXT + "/ctl/BankCtl";
	public String BANK_LIST_CTL = APP_CONTEXT + "/ctl/BankListCtl";
	public String USER_CTL = APP_CONTEXT + "/ctl/UserCtl";
	public String USER_LIST_CTL = APP_CONTEXT + "/ctl/UserListCtl";
	public String COLLEGE_CTL = APP_CONTEXT + "/ctl/CollegeCtl";
	public String COLLEGE_LIST_CTL = APP_CONTEXT + "/ctl/CollegeListCtl";
	public String STUDENT_CTL = APP_CONTEXT + "/ctl/StudentCtl";
	public String STUDENT_LIST_CTL = APP_CONTEXT + "/ctl/StudentListCtl";
	public String ROLE_CTL = APP_CONTEXT + "/ctl/RoleCtl";
	public String ROLE_LIST_CTL = APP_CONTEXT + "/ctl/RoleListCtl";
	public String USER_REGISTRATION_CTL = APP_CONTEXT + "/UserRegistrationCtl";
	public String LOGIN_CTL = APP_CONTEXT + "/LoginCtl";
	public String WELCOME_CTL = APP_CONTEXT + "/WelcomeCtl";
	public String LOGOUT_CTL = APP_CONTEXT + "/LoginCtl";
	public String GET_MARKSHEET_CTL = APP_CONTEXT + "/ctl/GetMarksheetCtl";
	public String CHANGE_PASSWORD_CTL = APP_CONTEXT + "/ctl/ChangePasswordCtl";
	public String MY_PROFILE_CTL = APP_CONTEXT + "/ctl/MyProfileCtl";
	public String FORGET_PASSWORD_CTL = APP_CONTEXT + "/ForgetPasswordCtl";
	public String MARKSHEET_MERIT_LIST_CTL = APP_CONTEXT + "/ctl/MarksheetMeritListCtl";
	public String COURSE_CTL = APP_CONTEXT + "/ctl/CourseCtl";
	public String COURSE_LIST_CTL = APP_CONTEXT + "/ctl/CourseListCtl";
	public String FACULTY_CTL = APP_CONTEXT + "/ctl/FacultyCtl";
	public String FACULTY_LIST_CTL = APP_CONTEXT + "/ctl/FacultyListCtl";
	public String SUBJECT_CTL = APP_CONTEXT + "/ctl/SubjectCtl";
	public String SUBJECT_LIST_CTL = APP_CONTEXT + "/ctl/SubjectListCtl";
	public String TIMETABLE_CTL = APP_CONTEXT + "/ctl/TimetableCtl";
	public String TIMETABLE_LIST_CTL = APP_CONTEXT + "/ctl/TimetableListCtl";
	public String ERROR_CTL = APP_CONTEXT + "/ErrorCtl";
	public String DOCTOR_CTL = APP_CONTEXT + "/ctl/DoctorCtl";
	public String DOCTOR_LIST_CTL = APP_CONTEXT + "/ctl/DoctorListCtl";
	public String PRODUCT_CTL = APP_CONTEXT + "/ctl/ProductCtl";
	public String PRODUCT_LIST_CTL = APP_CONTEXT + "/ctl/ProductListCtl";
	public String CAR_CTL = APP_CONTEXT + "/ctl/CarCtl";
	public String CAR_LIST_CTL = APP_CONTEXT + "/ctl/CarListCtl";
	public String FIELD_CTL = APP_CONTEXT + "/ctl/FieldCtl";
	public String FIELD_LIST_CTL = APP_CONTEXT + "/ctl/FieldListCtl";
	public String ABC_LIST_CTL = APP_CONTEXT + "/ctl/ABCListCtl";
	public String ABC_CTL = APP_CONTEXT + "/ctl/ABCCtl";
	public String TRANSACTION_LIST_CTL = APP_CONTEXT + "/ctl/TransactionListCtl";
	public String TRANSACTION_CTL = APP_CONTEXT + "/ctl/TransactionCtl";

	public String CUSTOMERS_CTL = APP_CONTEXT + "/ctl/CustomersCtl";
	public String CUSTOMERS_LIST_CTL = APP_CONTEXT + "/ctl/CustomersListCtl";
	
	public String SALARY_CTL = APP_CONTEXT + "/ctl/SalaryCtl";

	public String SALARY_LIST_CTL = APP_CONTEXT + "/ctl/SalaryListCtl";


}
