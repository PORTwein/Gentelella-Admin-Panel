package pl.sky.gentelella;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping(value = "/calendar")
  public String calendar(){
    return "calendar";
  }

  @GetMapping(value = "/chartjs")
  public String chartjs(){
    return "chartjs";
  }

  @GetMapping(value = "/chartjs2")
  public String chartjs2(){
    return "chartjs2";
  }

  @GetMapping(value = "/contacts")
  public String contacts(){
    return "contacts";
  }
  @GetMapping(value = "/e_commerce")
  public String eCommerce(){
    return "e_commerce";
  }

  @GetMapping(value = "/echarts")
  public String eCharts(){
    return "echarts";
  }

  @GetMapping(value = "/fixed_footer")
  public String fixedFooter(){
    return "fixed_footer";
  }

  @GetMapping(value = "/fixed_sidebar")
  public String fixedSidebar(){
    return "fixed_sidebar";
  }

  @GetMapping(value = "/form")
  public String form(){
    return "form";
  }

  @GetMapping(value = "/form_advanced")
  public String formAdvanced(){
    return "form_advanced";
  }

  @GetMapping(value = "/form_buttons")
  public String formButtons(){
    return "form_buttons";
  }

  @GetMapping(value = "/form_upload")
  public String formUpload(){
    return "form_upload";
  }

  @GetMapping(value = "/form_validation")
  public String formValidation(){
    return "form_validation";
  }

  @GetMapping(value = "/form_wizards")
  public String formWizards(){
    return "form_wizards";
  }
  @GetMapping(value = "/general_elements")
  public String generalElements(){
    return "general_elements";
  }

  @GetMapping(value = "/glyphicons")
  public String glyphIcons(){
    return "glyphicons";
  }

  @GetMapping(value = "/icons")
  public String icons(){
    return "icons";
  }

  @GetMapping(value = "/inbox")
  public String inbox(){
    return "inbox";
  }

  @GetMapping(value = "/index")
  public String index(){
    return "index";
  }

  @GetMapping(value = "/index2")
  public String index2(){
    return "index2";
  }

  @GetMapping(value = "/index3")
  public String index3(){
    return "index3";
  }

  @GetMapping(value = "/invoice")
  public String invoice(){
    return "invoice";
  }

  @GetMapping(value = "/level2")
  public String level2(){
    return "level2";
  }

  @GetMapping(value = "/login")
  public String login(){
    return "login";
  }
  @GetMapping(value = "/map")
  public String map(){
    return "map";
  }

  @GetMapping(value = "/media_gallery")
  public String mediaGallery(){
    return "media_gallery";
  }

  @GetMapping(value = "/morisjs")
  public String morisjs(){
    return "morisjs";
  }

  @GetMapping(value = "/other_charts")
  public String otherCharts(){
    return "other_charts";
  }

  @GetMapping(value = "/page_403")
  public String page403(){
    return "page_403";
  }

  @GetMapping(value = "/page_404")
  public String page404(){
    return "page_404";
  }

  @GetMapping(value = "/page_500")
  public String page500(){
    return "page_500";
  }

  @GetMapping(value = "/plain_page")
  public String plainPage(){
    return "plain_page";
  }

  @GetMapping(value = "/pricing_tables")
  public String pricingTables(){
    return "pricing_tables";
  }

  @GetMapping(value = "/profile")
  public String profile(){
    return "profile";
  }
  @GetMapping(value = "/project_detail")
  public String projectDetail(){
    return "project_detail";
  }

  @GetMapping(value = "/projects")
  public String projects(){
    return "projects";
  }

  @GetMapping(value = "/tables")
  public String tables(){
    return "tables";
  }

  @GetMapping(value = "/tables_dynamic")
  public String tablesDynamic(){
    return "tables_dynamic";
  }

  @GetMapping(value = "/typography")
  public String typography(){
    return "typography";
  }

  @GetMapping(value = "/widgets")
  public String widgets(){
    return "widgets";
  }

  @GetMapping(value = "/xx")
  public String xx(){
    return "xx";
  }
}
