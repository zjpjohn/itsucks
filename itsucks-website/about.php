<?
$selected_menu_entry = 'about';

include_once('include/header.php.inc');
?>


    <div id="info1">
    	<div class="small">
		<span class="subHeader">Features</span>
		<ul>
			<li><a href="#f_1">General Features</a></li>
			<li><a href="#f_2">HTTP Connection Features</a></li>
		</ul>
		
		<span class="subHeader">Rules</span>
		<ul>
			<li><a href="#r_1">Simple rules</a></li>
			<li><a href="#r_2">Special rules</a></li>
			<li><a href="#r_3">Advanced Regular Expression Rules</a></li>
			<li><a href="#r_4">Content filter</a></li>
		</ul>
		
		<span class="subHeader">Console</span>
		<ul>
			<li><a href="#c_1">Console</a></li>
		</ul>
		
		<span class="subHeader">Core library and API</span>
		<ul>
			<li><a href="#l_1">General Features</a></li>
			<li><a href="#l_2">Event Handling</a></li>
		</ul>		
		</div>
    </div>


    <div id="main">
      
        <h2>Features</h2>
		
		<a name="f_1" ></a>
        <h3>General Features</h3>
        <ul>
          <li>Multithreaded, configurable count of working threads</li>
          <li>Regular Expression Editor to test expressions on the fly</li>
          <li>Save/Load download jobs</li>
          <li>Online Help</li>
        </ul>
        
        <a name="f_2" ></a>
        <h3>HTTP Connection Features</h3>
        <ul>
          <li>HTTP/HTTPS supported</li>
          <li>HTTP Proxy Support (+ proxy authentication)</li>
          <li>HTTP Authentication Support</li>
          <li>Cookie Support (+ cookie migration from browser)</li>
          <li>Configurable User Agent</li>
          <li>Limitation of connections per server</li>
          <li>Configurable behaviour for HTTP response codes<br>
          Example: If an server sends 403 (Forbidden) after to many download, a retry + waiting time can be defined.</li>
          <li>Bandwidth limitation</li>
          <li>GZip compression</li>
        </ul>

        <h2>Rules</h2>
        <p>
          ItSucks offers a large variety of filters which can be used to isolate a specific
          part of an website.  
        </p>
        <a name="r_1" ></a>
        <h3>Simple rules:</h3>
        <ul>
          <li>Limitation of link depth<br>
          Example: To download only two levels after the initial link, set the value to 2.</li>
          <li>Limitation of links to follow (count)<br>
          Example: Stop adding new links after finding 5000 links.</li>
          <li>Limitation of time per job<br>
          Example: Stop adding new links after 30 minutes.</li>
          <li>Allowed Hostname filter (regular expression)<br>
          Example: Define '.*\.google.(de|com)' to allow all subdomains from google.de and google.com.</li>
          <li>Regular Expression Filter to save only certain filetypes/names on disk<br>
          Example: Define '.*jpg|.*png' to save only files which ends with 'jpg' or 'png'.</li>
        </ul>
        
        <a name="r_2" ></a>
        <h3>Special rules:</h3>
        <ul>
          <li>File Size filter<br>
          Example: Only save files on disk which are larger than 100kb.</li>
        </ul>

		<a name="r_3" ></a>
        <h3>Advanced Regular Expression Rules:</h3>
        <ul>
          <li>A highly customizable filter chain can hold multiple regular expressions. 
          For every expression, actions can be defined when the regular expression matches a URL
          and actions to be executed when the expression does not match.<br/>
          Possible actions are: 
          follow the URL (Accept), do not follow the URL (Reject), change the priority of the URL</li>
        </ul>

		<a name="r_4" ></a>
        <h3>Content filter:</h3>
        <ul>
          <li>Content filter for text/html files (regular expression)<br>
          Example: Only download link if the content contains 'New mail.*arrived'.</li>
        </ul>
      
      	<a name="c_1" ></a>
        <h2>Console</h2>
        <ul>
          <li>Start your download templates on the console after creating it with the GUI.</li>
        </ul>         

        <h2>Core library and API</h2>
        <p>
        	ItSucks is splitted into an backend (core) and frontend part. The backend can be used to implement
        	own web crawler/spider. License is GPL.
        </p>

		<a name="l_1" ></a>        
        <h3>General Features</h3>
        <ul>
          <li>Designed to support multiple protocols. At this time only http/https is implemented.</li>
          <li>Running multiple crawl jobs simultaniously.</li>
          <li>Customizable filter chain to filter found urls.</li>
          <li>Customizable processing chain to process the downloaded data.</li>
          <li>Save and load one or multiple Jobs. (serialize / deserialize)</li>
          <li>Fully programmed with Java 1.5 features (generics etc.).</li>
        </ul>
        
        <a name="l_2" ></a>
        <h3>Event Handling</h3>
        <ul>
          <li>Support to observe every event fired by the framework.</li>
          <li>Possibility to filter events by category and type.</li>
        </ul>
  
        <h2>External libraries/tools used in development</h2>
        <ul>
          <li><a href="http://www.springframework.org/">Spring Application Framework</a></li>
          <li><a href="http://maven.apache.org/">Maven2</a></li>
          <li><a href="http://jakarta.apache.org/commons/httpclient/">Jakarta Commons HttpClient</a></li>
          <li><a href="http://logging.apache.org/log4j/">log4j</a> 
          + <a href="http://jakarta.apache.org/commons/logging/">Jakarta Commons Logging</a></li>
          <li><a href="http://www.junit.org/">JUnit</a></li>
          <li><a href="http://eclipse.org">Eclipse development platform</a>
              <ul>
                  <li><a href="http://www.eclipse.org/subversive/">Subversive plugin (Subversion)</a></li>
                  <li><a href="http://m2eclipse.codehaus.org/">Maven Integration for Eclipse</a></li>
                  <li><a href="http://springide.org/">Spring IDE plugin</a></li>
                  <li><a href="http://findbugs.sourceforge.net/manual/eclipse.html">Find Bugs for Eclipse</a></li>
                  <li><a href="http://www.slimeuml.de/">Slime UML plugin</a></li>
                  <li><a href="http://classycleplugin.graf-tec.ch/">Classycle Plugin for Eclipse</a></li>
                  <li><a href="http://www.eclipse.org/mat/">Memory Analyzer Plugin for Eclipse (MAT)</a></li>
              </ul>
          </li>
        </ul>
        
    </div>
<?
include_once('include/footer.php.inc');
?>
