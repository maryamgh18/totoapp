package com.mkyong;

import com.mkyong.dao.MyDao;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class App {



    @Autowired
    private MyDao myDao;

    


    //----------------------------------------------------


    public MyDao getMyDao() {
        return myDao;
    }

    public void setMyDao(MyDao myDao) {
        this.myDao = myDao;
    }





/* public void setDataSource(DataSource dataSource) {
       // this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.jdbcTemplate = jdbcTemplate;
    }
*/

    public static void main(String[] args) {
        runJob();

       // sayHello("Test jdbc");
       
    }




    public static void runJob() {
        //This works properly
        String[] springConfig =
                {
                        "spring/batch/jobs/job-hello-world.xml"

                };

        ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

        MyDao customerDAO = (MyDao) context.getBean("myDao");
        System.out.println("customerDAO = " + customerDAO);
        JdbcTemplate jdbcTemplate=(JdbcTemplate) context.getBean("jdbcTemplate");

        System.out.println("jdbcTemplate = " + jdbcTemplate);

        String sql = "SELECT COUNT(*) FROM mdrs_ts_noe_drkhst";

        int total = jdbcTemplate.queryForInt(sql);




        System.out.println("total = " + total);
        
        
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("helloWorldJob");


        try {


            JobParameters jobParameters =
                    new JobParametersBuilder()
                            .addLong("time", System.currentTimeMillis()).toJobParameters();

            //JobExecution execution = jobLauncher.run(job, new JobParameters());
            JobExecution execution = jobLauncher.run(job, jobParameters);
            System.out.println("Exit Status : " + execution.getStatus());

            //-------------------------------------------/**/


        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Done");

    }


}//Fin de classe
