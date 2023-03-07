package projects.service;

import projects.entity.Project;
import projects.dao.ProjectDao;

public class ProjectService {

	private ProjectDao projectDao = new ProjectDao();
	
	//calls DAO class to insert a project row
	public Project addProject(Project project) {
		return projectDao.insertProject(project);

	}

}
