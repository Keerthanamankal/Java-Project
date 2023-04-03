import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
@EnableWebMvc
public class DoctorInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configfiles= {UserAppConfig.class};
		return configfiles;
	}
	
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String[] mappings= {"/"};
		return mappings;
	}
	
}
