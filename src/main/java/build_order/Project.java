package build_order;

import java.util.ArrayList;
import java.util.List;

public class Project {

    // This variable means that this current Project is dependent on the referenced Projects, meaning the referenced
    // Projects must be built first before the current Project.
    private List<Project> dependencies;

    public Project() {
        this(null);
    }

    public Project(List<Project> dependencies) {
        this.dependencies = dependencies;
    }

    public List<Project> getDependencies() {
        return dependencies;
    }

    public void setDependecies(List<Project> dependencies) {
        this.dependencies = dependencies;
    }

    public void addDependency(Project project) {
        if (dependencies == null) {
            dependencies = new ArrayList<>();
        }
        dependencies.add(project);
    }
}
