package runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.CreatePosts;
import tests.DeletePosts;
import tests.GetPosts;
import tests.PatchPosts;
import tests.UpdatePosts;

@RunWith(Suite.class)
@Suite.SuiteClasses
	(
		{
			CreatePosts.class, 
			UpdatePosts.class, 
			PatchPosts.class, 
			DeletePosts.class, 
			GetPosts.class
		}
	)
public class TestRunner 
{	
}